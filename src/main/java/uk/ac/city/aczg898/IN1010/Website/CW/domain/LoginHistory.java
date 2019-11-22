package uk.ac.city.aczg898.IN1010.Website.CW.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * An Entity class representing the information representing a users login history.
 */
@Entity
public class LoginHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long key;
    private String email;
    private LocalDateTime time;

    public LoginHistory(){}

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
