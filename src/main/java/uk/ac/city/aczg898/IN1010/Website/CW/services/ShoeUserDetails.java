package uk.ac.city.aczg898.IN1010.Website.CW.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uk.ac.city.aczg898.IN1010.Website.CW.dao.HistoryRepository;
import uk.ac.city.aczg898.IN1010.Website.CW.dao.UserRepository;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.LoginHistory;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.ShoeUser;


import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Custom authentication service which includes recording login history
 * each time a user is authenticated.
 */
@Service
public class ShoeUserDetails implements UserDetailsService {


    /**
     * The repository for opera user data.
     */
    private UserRepository userRepository;
    /**
     * The repository for login history
     */
    private HistoryRepository historyRepository;

    /**
     * Constructo based dependency injection of repositories.
     *
     * @param userRepository the opera user repo
     * @param historyRepository the login history repo
     */
    @Autowired
    public ShoeUserDetails(UserRepository userRepository, HistoryRepository historyRepository){
        this.userRepository = userRepository;
        this.historyRepository = historyRepository;
    }

    /**
     * The override fo the UserDetailsService method that validates a user. The methods finds the
     * user in the database based on the String s provided by the users login credentials (their email
     * address)
     *
     * @param s user's email address provided when logging in.
     * @return UserDetails an object representing the user including their password, account status and roles
     * @throws UsernameNotFoundException if the user cannot be found in the database
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        ShoeUser shoeUser = userRepository.findById(s).orElseThrow(()-> new UsernameNotFoundException("No matching user."));
        //if the first line does not throw the exception the login history
        //object will be constructed and saved to the database.
        LoginHistory loginHistory = new LoginHistory();
        loginHistory.setEmail(shoeUser.getEmail());
        loginHistory.setTime(LocalDateTime.now());
        historyRepository.save(loginHistory);
        //and a UserDetails object will be constructed and returned.
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(shoeUser.getAuthoritiy()));
        return new User
                (shoeUser.getEmail(), shoeUser.getPassword(), shoeUser.getEnabled(),
                        true, true, true, authorities);

    }
}
