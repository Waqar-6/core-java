package user;

public class UserController {

    IUserService iUserService;

    public UserController () {
        this.iUserService = new UserServiceImpl();
    }

    public String createUser (User user) {
        this.iUserService.createUser(user);
        return "User created successfully";
    }

    public String logUserIn (AuthToken authToken) {

        boolean authSuccessful = this.iUserService.loginUser(authToken);
        return authSuccessful ? "User logged in" : "log failed try again";
    }

}
