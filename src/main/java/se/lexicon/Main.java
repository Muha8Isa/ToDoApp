package se.lexicon;

import se.lexicon.dao.AppUserDAO;
import se.lexicon.dao.AppUserDaoCollection;
import se.lexicon.model.AppRole;
import se.lexicon.model.AppUser;

public class Main {
    public static void main(String[] args) {
        AppUser appUser1 = new AppUser("test", "password", AppRole.ROLE_APP_USER);
        AppUser appUser2 = new AppUser("test1", "password", AppRole.ROLE_APP_ADMIN);

        AppUserDAO appUserDAO = new AppUserDaoCollection();
        AppUser createdAppUser1 = appUserDAO.persist(appUser1);
        AppUser createdAppUser2 = appUserDAO.persist(appUser2);


        System.out.println(appUserDAO.removeUsername("test"));
    }
}
