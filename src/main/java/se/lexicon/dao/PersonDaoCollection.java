package se.lexicon.dao;

import se.lexicon.Person;
import se.lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonDaoCollection implements PersonDAO{


    private List<Person> personStorage;

    public PersonDaoCollection(){
        personStorage = new ArrayList<>();
    }


    @Override
    public Person persist(Person person) {
        if (person == null) throw new IllegalArgumentException("person was null");
        Person result = findById(person.getId());
        if(result != null) throw new IllegalArgumentException("person was duplicate");
        personStorage.add(person);
        return person;
    }

    @Override
    public Person findById(Integer id) {
        if(id == null) throw new IllegalArgumentException("ID was null");
        for (Person person:personStorage)
            if(person.getId().equals(id)) { // Why do we use person not Person here?
                return person;
            }
        return null;
    }


    @Override
    public Person findByEmail(String email) {
        if(email == null) throw new IllegalArgumentException("email was null");
        for (Person person:personStorage)
            if(person.getEmail().equalsIgnoreCase(String.valueOf(email))) return person;
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(personStorage);
    }

    @Override
    public void removeId(int id) {
        if(id == 0) throw new IllegalArgumentException("id was null");
        if (id != 0) personStorage.remove(id);
    }
}
