package se.lexicon.dao;

import se.lexicon.model.AppUser;
import se.lexicon.sequencers.PersonIdSequencer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppUserDaoCollection implements AppUserDAO {

    private List<AppUser> userStorage;

    public AppUserDaoCollection() {
        userStorage = new ArrayList<>();
    }

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("appUser was null");
        AppUser result = findByUsername(appUser.getUsername()); // user
        if (result != null)
            throw new IllegalArgumentException("username was duplicate"); //How does this work? How does it know that the username is duplicate?
        appUser.setId(PersonIdSequencer.nextId()); // 1
        userStorage.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        if (username == null) throw new IllegalArgumentException("username was null");
        for (AppUser appUser : userStorage)
            if (appUser.getUsername().equalsIgnoreCase(username)) return appUser;
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return new ArrayList<>(userStorage);
    }

    @Override
    public void removeUsername(String username) {
        if (username == null) throw new IllegalArgumentException("username was null");
        AppUser result = findByUsername(username);
        userStorage.remove(result);
    }

}
