package doa;


import user.User;

import java.util.List;

public class DogDatabase {
    private List<User> users;

    public DogDatabase( List<User> users) {
        this.users = users;
    }

    public DogDatabase () {}

    public List<User> getUsers() {return users;}

    public void setUsers(List<User> owners) {this.users = owners;}

}