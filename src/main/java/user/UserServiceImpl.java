package user;

import doa.DogDatabase;
import exception.AlreadyExistsException;
import exception.ResourceNotFoundException;
import security.SecurityContext;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService{

    List<User> userDb = new ArrayList<>();
    DogDatabase dogDatabase = new DogDatabase();
    /**
     * @param user - User Object
     */
    @Override
    public void createUser(User user) {
        String userEmail = user.getEmail();
        if (existsByEmail(userEmail))
            throw new AlreadyExistsException("User with the email: " + userEmail + " already exists.");
        userDb.add(user);
    }

    /**
     *
     * @param authToken - AuthToken Object
     * @return - true or false based on login
     */
    @Override
    public boolean loginUser(AuthToken authToken) {
        String email = authToken.getEmail();
        String password = authToken.getPassword();
        User user = findByEmail(email);
        if (user == null) throw new ResourceNotFoundException("User", "email", email);
        if (user.getPassword().equals(password)) {
            authToken.setAuthenticated(true);
        }
        SecurityContext.setCurrentUser(user);

        return authToken.isAuthenticated();
    }

    @Override
    public boolean logOut() {
        SecurityContext.setCurrentUser(null);
        return true;
    }


    private User findByEmail (String email) {
        User foundUser = null;
        for (User user : userDb) {
            if (user.getEmail().equals(email)) {
                foundUser = user;
            };
        }
        return foundUser;
    }

    private boolean existsByEmail (String userEmail) {
        boolean alreadyExists = false;
        for(User existingUser : userDb) {
            if (existingUser.getEmail().equals(userEmail)) {
                alreadyExists = true;
                break;
            }
        }
        return alreadyExists;
    }
}
