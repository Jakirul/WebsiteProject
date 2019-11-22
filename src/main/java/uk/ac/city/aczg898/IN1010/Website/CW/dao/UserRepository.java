package uk.ac.city.aczg898.IN1010.Website.CW.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczg898.IN1010.Website.CW.domain.ShoeUser;


@Repository
public interface UserRepository extends JpaRepository<ShoeUser, String> {



}
