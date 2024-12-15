package security;

import user.User;

public class SecurityContext {

    private static User currentUser;



    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    public static boolean isLoggedIn () {
        return currentUser != null;
    }
}
