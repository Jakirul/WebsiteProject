package uk.ac.city.aczg898.IN1010.Website.CW.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.Booking;
import uk.ac.city.aczg898.IN1010.Website.CW.services.BookingService;

@Controller
public class BookingController {

    /**
     * The booking service which is used to save bookings to the
     * database.
     */
    private BookingService bookingService;

    /**
     * Constructor based dependency injection of the booking service
     *
      * @param bookingService
     */
    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    /**
     * Controller method to handle a get request to the /book endpoint
     *
     * @return ModelAndView an object that combines the book.html page with a Booking
     * object that can be filled out with booking data to be saved to the database.
     */
    @RequestMapping(value = "book", method = RequestMethod.GET)
    public ModelAndView showBooking(){
        Booking booking = new Booking();
        return new ModelAndView("book", "booking", booking);
    }

    /**
     * Controller method to handle a post request to the /book endpoint
     *
     * @param booking the booking object that contains the the information to
     *                be saved to the database.
     * @return String a redirect to the profile page.
     */
    @RequestMapping (value = "book", method = RequestMethod.POST)
    public String processBooking(Booking booking){
        //Retrieves the email address of the currently logged in user.
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        booking.setEmail(email);
        bookingService.makeBooking(booking);
        return "redirect:/profile";
    }

}
