package uk.ac.city.aczg898.IN1010.Website.CW.domain;

import java.util.List;

/**
 * An Entity class representing all of the information relevant to a specific operauser including
 * their bookings and login history.
 *
 * */
public class CollatedUser{

    private ShoeUser shoeUser;
    private List<Booking> bookings;
    private List<LoginHistory> logins;

    public ShoeUser getShoeUser() {
        return shoeUser;
    }


    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }


    public void setShoeUser(ShoeUser shoeUser) {
        this.shoeUser = shoeUser;
    }


    public List<LoginHistory> getLogins() {
        return logins;
    }

    public void setLogins(List<LoginHistory> logins) {
        this.logins = logins;
    }
}
