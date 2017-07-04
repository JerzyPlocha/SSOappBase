package eu.plocha.jerzy.appbase.services;

import eu.plocha.jerzy.appbase.models.Profile;

public interface ProfileService {

    Iterable<Profile> findAll();
}
