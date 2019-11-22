package uk.ac.city.aczg898.IN1010.Website.CW.services;

import uk.ac.city.aczg898.IN1010.Website.CW.domain.Booking;


/**
 * A service interface containing methods used by the controllers
 * to record and retrieve booking information.
 */
public interface BookingService {

    void makeBooking(Booking booking);
}
