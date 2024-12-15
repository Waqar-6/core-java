

import security.SecurityContext;
import user.AuthToken;
import user.User;
import user.UserController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User currentUser = SecurityContext.getCurrentUser();
        boolean isLoggedIn = SecurityContext.isLoggedIn();
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();


        int selectedOption;

        while (!SecurityContext.isLoggedIn()) {
            displayMenuOption();
            selectedOption = scanner.nextInt();


            if(!isLoggedIn) {
                switch (selectedOption) {
                    case 1 -> System.out.println(userController.createUser(userObject(scanner)));
                    case 2 -> System.out.println(userController.logUserIn(emailPasswordToken(scanner)));
                }
            }

            if (SecurityContext.isLoggedIn()) {
                displayLoggedInMenu();

                while (SecurityContext.isLoggedIn()) {
                    selectedOption = scanner.nextInt();
                    switch (selectedOption) {
                        case 3 -> System.out.println(userController.logUserOut());
                    }
                }
            }

        }

        System.out.println("Thank you ");
    }


    static void displayMenuOption () {
        String[] options = {"1. Register ", "2. Login "};
        for (String option : options) {System.out.println(option);}
    }

    static void displayLoggedInMenu () {
        String[] options = {"1. see your dogs", "2. create a dog", "3. logout"};
        for(String option : options) System.out.println(option);
    }


    static User userObject (Scanner scanner) {
        System.out.println("Enter id: ");
        long id = scanner.nextLong();
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println("Enter last name: ");
        String lastName = scanner.next();
        System.out.println("Enter email: ");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();
        return new User(id, firstName, lastName, email, password);
    }

    static AuthToken emailPasswordToken (Scanner scanner) {
        System.out.println("Enter your email: ");
        String email = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        return new AuthToken(email, password);
    }

}
