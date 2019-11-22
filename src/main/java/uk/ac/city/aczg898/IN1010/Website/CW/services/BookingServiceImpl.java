package uk.ac.city.aczg898.IN1010.Website.CW.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.city.aczg898.IN1010.Website.CW.dao.BookingRepository;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.Booking;

/**
 * Class implementing the methods specified in BookingService
 */
@Service
public class BookingServiceImpl implements BookingService {

    /**
     * The BookingRepostiory for interacting with the database table backing the
     * Booking entity.
     */
    private BookingRepository bookingRepository;

    /**
     * Constructor based dependency injection of the booking repository.
     * @param bookingRepository
     */
    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    /**
     * Implemented method using the bookingRepository to save the booking data.
     *
     * @param booking object that contains the booking data.
     */
    @Override
    public void makeBooking(Booking booking) {
        bookingRepository.save(booking);
    }
}
