package uk.ac.city.aczg898.IN1010.Website.CW.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.Booking;

/**
 * Class to access the database table backing the Booking entity.
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {
}
