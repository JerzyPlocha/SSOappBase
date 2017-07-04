package eu.plocha.jerzy.appbase.controller;

import eu.plocha.jerzy.appbase.models.Profile;
import eu.plocha.jerzy.appbase.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilesController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping("/profiles")
    public Iterable<Profile> profiles() {
        Iterable<Profile> profiles = profileService.findAll();
        System.out.println(profiles);
        return profiles;
    }
}
