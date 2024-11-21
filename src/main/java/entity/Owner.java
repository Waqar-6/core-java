package entity;

import java.util.List;

public class Owner {
    private long id;
    private String name;
    private String contact;
    private List<Dog> ownedDogs;  // collection of dogs

    public Owner(long id, String name, String contact, List<Dog> ownedDogs) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.ownedDogs = ownedDogs;
    }

    public Owner () {}

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getContact() {return contact;}

    public void setContact(String contact) {this.contact = contact;}

    public List<Dog> getOwnedDogs() {return ownedDogs;}

    public void setOwnedDogs(List<Dog> ownedDogs) {this.ownedDogs = ownedDogs;}
}