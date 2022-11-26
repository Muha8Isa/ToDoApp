package se.lexicon.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AppUser {

    private String username;
    private Integer id;

    private String password;
    private Set<AppRole> roles;




    public AppUser(String username,String password) { //User without role
        setUsername(username);
        setPassword(password);
        addRole(AppRole.ROLE_APP_USER);
    }
    public AppUser(String username,String password,AppRole role){ //Only one role
        setUsername(username);
        setPassword(password);
        addRole(role); //Why is it "add" here?
    }
    public AppUser(String username,String password, Set<AppRole> roles){ //Many roles
        setUsername(username);
        setPassword(password);
        setRoles(roles); //Why is it set here? not add as in line 22?
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id == null) throw new RuntimeException("id was null");
        this.id = id;
    }




    public void addRole(AppRole role){
        if (role == null) throw new IllegalArgumentException("role param was null");
        if (roles == null) roles = new HashSet<>();
        roles.add(role);
    }

    public void removeRole(AppRole role){
        if (role == null) throw new IllegalArgumentException("role param was null");
        if (roles != null) roles.remove(role);
    }


    //setters & getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null) throw new IllegalArgumentException("username param was null");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) throw new IllegalArgumentException("password param was null");
        if (password.length() < 8) throw new IllegalArgumentException("password length was not valid");
        this.password = password;
    }

    public Set<AppRole> getRoles() {
        return roles;
    }

    public void setRoles(Set <AppRole> roles) {
        if (roles == null) throw new IllegalArgumentException("role param was null");
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && Objects.equals(roles, appUser.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, roles);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", roles=" + roles +
                '}';
    }
}
