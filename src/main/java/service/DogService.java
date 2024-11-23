package service;

import entity.Dog;
import entity.Owner;
import entity.Pedigree;

public interface DogService {

    /**
     *
     * @param dog - Dog Object
     */
    void createDog (Dog dog);

    /**
     *
     * @param owner - Owner Object
     */
    void createOwner (Owner owner);

    /**
     *
     * @param pedigree - Pedigree Object
     */
    void createPedigree (Pedigree pedigree);
}
