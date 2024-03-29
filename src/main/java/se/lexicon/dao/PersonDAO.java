package se.lexicon.dao;

import se.lexicon.model.Person;

import java.util.Collection;

public interface PersonDAO {

    Person persist(Person person);

    Person findById(Integer id);


    Person findByEmail(String email);

    Collection<Person> findAll();

    void removeId(int id);
}
