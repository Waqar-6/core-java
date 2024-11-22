package entity;

import java.util.List;

public class Owner {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String kennel;

    public Owner(long id, String firstName, String lastName, String email , String kennel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.kennel = kennel;
    }

    public Owner () {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKennel() {
        return kennel;
    }

    public void setKennel(String kennel) {
        this.kennel = kennel;
    }
}