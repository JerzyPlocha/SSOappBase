package eu.plocha.jerzy.appbase.repository;

import eu.plocha.jerzy.appbase.models.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
