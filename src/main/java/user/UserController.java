package user;

import security.SecurityContext;

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
        System.out.println(SecurityContext.getCurrentUser().getFirstName());
        return authSuccessful ? "User logged in" : "log failed try again";
    }

    public String logUserOut () {
        boolean isLoggedOut = this.iUserService.logOut();
        return isLoggedOut ? "Logged Out Successfully" : "Could not log out";
    }
}
