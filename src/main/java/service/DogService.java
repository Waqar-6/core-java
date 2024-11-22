package service;

import entity.Dog;
import entity.Owner;

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
}
