package uk.ac.city.aczg898.IN1010.Website.CW.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import uk.ac.city.aczg898.IN1010.Website.CW.services.ShoeUserDetails;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private ShoeUserDetails shoeUserDetails;

//    @Autowired
//    public SecurityConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//
//    }

   @Autowired
    public SecurityConfig(ShoeUserDetails shoeUserDetails){
        this.shoeUserDetails = shoeUserDetails;
    }
    /**
     * Set the authentication service to use the custom user details service.
     *
     * @param auth
     * @throws Exception
     */
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .authenticationProvider(authenticationProvider());
    }


    @Override
    public void configure(HttpSecurity http) throws Exception{

        http
                .authorizeRequests()
                .antMatchers("/", "register", "/profile")
                .permitAll()
                .antMatchers( "/users", "/book")
                .authenticated()
                .and()
                .formLogin();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }

    /**
     * Method to construct an authentication provided which uses the  custom user details
     * service so it can be supplied to the auth object (together with a BCrypt password
     * encoder. Method is called when configuring authentication.
     *
     * @return DaoAuthenticationProvider an authentication provider that contains the custom
     * user details service and password encoder.
     */
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider
                = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(shoeUserDetails);
        authProvider.setPasswordEncoder(new BCryptPasswordEncoder());
        return authProvider;
    }



}

