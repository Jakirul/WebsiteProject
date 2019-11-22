package uk.ac.city.aczg898.IN1010.Website.CW.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.LoginHistory;


/**
 * Class to access the database table backing the LoginHistory entity.
 */
@Repository
public interface HistoryRepository extends JpaRepository<LoginHistory, String> {

}
