package uk.ac.city.aczg898.IN1010.Website.CW.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import uk.ac.city.aczg898.IN1010.Website.CW.dao.UserRepository;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.ShoeUser;


import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    /**
     * The repository for opera user data.
     */
    private UserRepository userRepository;

    /**
     * Constructor based dependency injection
     *
     * @param userRepository the opera user repo.
     */
    @Autowired
    public RegistrationServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    /**
     * Saves an opera user to the database.
     *
     * @param shoeUser the opera user to be saved.
     */
    @Override
    public void registerUser(ShoeUser shoeUser) {
        userRepository.save(shoeUser);
    }
}
