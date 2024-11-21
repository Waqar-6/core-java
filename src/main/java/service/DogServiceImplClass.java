package service;

import doa.DogDatabase;
import entity.Dog;
import entity.Owner;
import entity.Pedigree;
import exception.DogAlreadyExistsException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DogServiceImplClass implements DogService{

    List<Dog> dogsBd = new ArrayList<>();
    List<Owner> ownerDb = new ArrayList<>();
    List<Pedigree> pedigreeDb = new ArrayList<>();
    DogDatabase dogDatabase = new DogDatabase(dogsBd, ownerDb, pedigreeDb);

    /**
     * @param dog - Dog Object
     */
    @Override
    public void createDog(Dog dog) throws DogAlreadyExistsException{
        String registrationNumber = dog.getRegistrationNumber();
        List<Dog> listOfDogs = dogDatabase.getDogs();
        Optional<Dog> dogExists = listOfDogs.stream()
                .filter(d -> d.getRegistrationNumber().equals(registrationNumber)).findFirst();
        if (dogExists.isPresent())
            throw new DogAlreadyExistsException("Dog with the registration number: "  + registrationNumber + " already exists");
        listOfDogs.add(dog);
    }
}
