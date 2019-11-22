package uk.ac.city.aczg898.IN1010.Website.CW.services;

import uk.ac.city.aczg898.IN1010.Website.CW.domain.CollatedUser;

/**
 * Profile service interface that specifies a method to return a CollatedUser.
 */
public interface ProfileService {

    CollatedUser getProfile(String email);
}
