package se.lexicon.model;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;

    public AppUser(String username,String password,AppRole role){
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public String toString() {
        return "username: "+ getUsername();
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
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("role param was null");
        this.role = role;
    }
}
