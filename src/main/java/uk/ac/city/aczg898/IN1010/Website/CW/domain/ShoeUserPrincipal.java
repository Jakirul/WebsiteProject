package uk.ac.city.aczg898.IN1010.Website.CW.domain;

import java.nio.file.attribute.UserPrincipal;

/**
 * An OperaUserPricipal represents the current user in the user details service.
 */
public class ShoeUserPrincipal implements UserPrincipal {

    private ShoeUser shoeUser;

    public ShoeUserPrincipal(ShoeUser shoeUser){
        this.shoeUser = shoeUser;
    }

    @Override
    public String getName() {
        return shoeUser.getEmail();
    }


}
