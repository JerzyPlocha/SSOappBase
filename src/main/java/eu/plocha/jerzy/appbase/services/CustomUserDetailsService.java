package eu.plocha.jerzy.appbase.services;

import eu.plocha.jerzy.appbase.models.SimpleUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Value("${mysso.domain.allowed}")
    private String allowedomain;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String email = username.split("@")[1];
        if (email.equals(allowedomain)) {
            return new SimpleUser(username);
        } else {
            throw new UsernameNotFoundException("");
        }
    }
}
