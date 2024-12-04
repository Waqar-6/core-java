package user;

public interface IUserService {

    /**
     *
     * @param user - User Object
     */
    void createUser (User user);

    /**
     *
     * @param authToken
     * @return - true or false based of login
     */
    boolean loginUser (AuthToken authToken);


}
