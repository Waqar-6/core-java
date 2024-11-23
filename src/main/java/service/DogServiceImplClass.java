package service;

import doa.DogDatabase;
import entity.Dog;
import entity.Owner;
import entity.Pedigree;
import exception.DogAlreadyExistsException;
import exception.OwnerAlreadyExistsException;
import exception.ResourceNotFoundException;

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

    /**
     * @param owner - Owner Object
     */
    @Override
    public void createOwner(Owner owner) throws OwnerAlreadyExistsException{
        String userEmail = owner.getEmail();
        List<Owner> ownerDb = dogDatabase.getOwners();
        Optional<Owner> ownerExists = ownerDb.stream()
                .filter(user -> user.getEmail().equals(userEmail)).findFirst();
        if (ownerExists.isPresent())
            throw new OwnerAlreadyExistsException("Owner with the email: " + owner.getEmail() + " already exists");
        ownerDb.add(owner);
    }

    /**
     * @param pedigree - Pedigree Object
     */
    @Override
    public void createPedigree(Pedigree pedigree) throws ResourceNotFoundException{
        List<Dog> dogDb = dogDatabase.getDogs();
        Dog mainDog = dogDb.stream()
                .filter(dog -> dog.getId() == pedigree.getDogId()).findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Dog", "id", pedigree.getDogId().toString()));

        Dog fartherDog = dogDb.stream()
                .filter(dog -> dog.getId() == pedigree.getFatherId()).findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Dog", "fartherId", pedigree.getFatherId().toString()));

        Dog motherDog = dogDb.stream()
                .filter(dog -> dog.getId() == pedigree.getMotherId()).findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Dog", "fartherId", pedigree.getMotherId().toString()));

        List<Pedigree> pedigreeDb = dogDatabase.getPedigrees();
        pedigreeDb.add(pedigree);
    }
}
