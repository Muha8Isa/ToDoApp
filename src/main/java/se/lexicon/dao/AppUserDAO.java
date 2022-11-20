package se.lexicon.dao;

import se.lexicon.model.AppUser;

import java.util.Collection;
import java.util.List;

public interface AppUserDAO {

    AppUser persist(AppUser appUser);

    AppUser findByUsername(String username);

    Collection<AppUser> findAll();

    void removeUsername(String username);
}
