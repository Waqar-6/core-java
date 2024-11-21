import entity.Dog;
import entity.Owner;
import exception.DogAlreadyExistsException;
import service.DogService;
import service.DogServiceImplClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        DogService dogService = new DogServiceImplClass();


        int selectedOption;
        boolean isActive = true;

        while (isActive) {
            displayMenuOption();
            selectedOption = scanner.nextInt();
            if (selectedOption == 4) isActive = false;

            switch (selectedOption) {
                case 1 -> createDog(scanner, dogService);
            }
        }

        System.out.println("Thank you ");
    }


    static void displayMenuOption () {
        String[] options = {"1. Add New Dog ", "2. Add New Owner ", "3. Display All Dogs ", "4. Exit"};
        for (String option : options) {System.out.println(option);}
    }

    static void createDog (Scanner scanner, DogService dogService) {
        try {
            System.out.println("Enter an id : ");
            long id = scanner.nextLong();
            System.out.println("Enter the dogs name : ");
            String name = scanner.next();
            System.out.println("Enter the breed of the dog : ");
            String breed = scanner.next();
            System.out.println("Enter the date of birth of the dog : ");
            String dob = scanner.next();
            System.out.println("Enter the registration number : ");
            String registrationNumber = scanner.next();
            System.out.println("Enter the gender of the dog : ");
            String gender = scanner.next();
            Dog newDog = new Dog(id, name, breed, dob, registrationNumber, gender);
            dogService.createDog(newDog);
            System.out.println("Dog created successfully");
        } catch (DogAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

    }

}
