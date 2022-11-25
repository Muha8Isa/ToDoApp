package se.lexicon;

import se.lexicon.model.AppUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {


    private Integer id; //Reference class, int is wrapper class and cannot be null.
    private String firstName;
    private String lastName;
    private String email;

    private AppUser credentials; //Should this be public or private?
    private List<TodoItem> assignedTodos; //Do I need this here?

    public Person(Integer id, String firstName, String lastName, String email, List<TodoItem> assignedTodos) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.assignedTodos = assignedTodos;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.assignedTodos = new ArrayList<>();
    }

    public void setId(Integer id) {
        if (id == null)
            throw new RuntimeException("id was null"); //It is exception from the application, not from the user, because the app generates the ID.
        this.id = id;
    }

    public List<TodoItem> getAssignedTodos() {
        return assignedTodos;
    }

    public void setAssignedTodos(List<TodoItem> assignedTodos) {
        if (assignedTodos == null)
            this.assignedTodos = new ArrayList<>(); //If the Todos are null, we have to instantiate it.

        this.assignedTodos = assignedTodos;
    }

    public Integer getId() {
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
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
/*public String getSummary() {
        return " Person" +" FirstName: " + firstName + ", LastName: " + lastName + ", ID: " + id + ", Email: " + email;
    }*/

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        if (credentials == null) throw new IllegalArgumentException("Credentials was null");
        this.credentials = credentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
}
