package uk.ac.city.aczg898.IN1010.Website.CW.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.ShoeUser;
import uk.ac.city.aczg898.IN1010.Website.CW.services.RegistrationService;


@Controller
public class RegistrationController {
//
//    private final RegistrationService registrationService;
//
//    @Autowired
//    public RegistrationController(RegistrationService registrationService){
//        this.registrationService = registrationService;
//    }
//
//
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public ModelAndView showRegistrationForm() {
//        return new ModelAndView("register", "shoeUser", new ShoeUser());
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String processRegistrationForm(ShoeUser shoeUser) {
//        registrationService.addUser(shoeUser);
//        return "redirect:/profile";
//    }
//
//    @RequestMapping(value = "/profile")
//    public ModelAndView showProfile (){
//        return new ModelAndView("/profile", "shoeUser", registrationService.getCurrentUser());
//    }
//
//    @RequestMapping(value = "/users")
//    public ModelAndView showUsers(){
//        return new ModelAndView("/users", "users", registrationService.getUsers());
//    }

    /**
     * The registration service which is used to save user information to the
     * database.
     */
    private RegistrationService registrationService;

    /**
     * Constructor based dependency injection of the registration service
     *
     * @param registrationService
     */
    @Autowired
    public RegistrationController (RegistrationService registrationService){
        this.registrationService = registrationService;
    }

    /**
     * Controller method for responding to a GET request to the /register endpoint
     *
     * @return ModelAndView a view created from register.html backed by an OperaUser object
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegistation(){
        ShoeUser shoeUser = new ShoeUser();
        return new ModelAndView("register", "shoeUser", shoeUser);
    }

    /**
     * Controller method to handle a POST request to the /register endpoint
     *
     * @param shoeUser an object containing the data from the registration form
     * @return String a redirect to the profile page (which requries the user to login)
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistation(ShoeUser shoeUser) {
        shoeUser.setEnabled(Boolean.TRUE);
        shoeUser.setAuthoritiy("ROLE_USER");
        registrationService.registerUser(shoeUser);
        return "redirect:/profile";
    }
}
