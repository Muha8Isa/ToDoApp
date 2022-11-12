package se.lexicon;

import se.lexicon.model.AppUser;

public class Person {


    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public AppUser credentials;

    public Person (int id, String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
        setEmail(email);

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("firstName param was null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("lastName param was null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("email param was null");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", ID: " + id + ", Email: " + email;
    }

    @Override
    public int hashCode() {
        return hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }


    /*public String getSummary() {
        return " Person" +" FirstName: " + firstName + ", LastName: " + lastName + ", ID: " + id + ", Email: " + email;
    }*/

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }
}
