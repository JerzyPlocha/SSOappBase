package eu.plocha.jerzy.appbase.services;

import eu.plocha.jerzy.appbase.models.Profile;
import eu.plocha.jerzy.appbase.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicProfileService implements ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public Iterable<Profile> findAll() {
        return profileRepository.findAll();
    }
}
