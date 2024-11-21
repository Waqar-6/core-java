package doa;

import entity.Dog;
import entity.Owner;
import entity.Pedigree;

import java.util.List;

public class DogDatabase {
    private List<Dog> dogs;
    private List<Owner> owners;
    private List<Pedigree> pedigrees;

    public DogDatabase(List<Dog> dogs, List<Owner> owners, List<Pedigree> pedigrees) {
        this.dogs = dogs;
        this.owners = owners;
        this.pedigrees = pedigrees;
    }

    public DogDatabase () {}


    public List<Dog> getDogs() {return dogs;}

    public void setDogs(List<Dog> dogs) {this.dogs = dogs;}

    public List<Owner> getOwners() {return owners;}

    public void setOwners(List<Owner> owners) {this.owners = owners;}

    public List<Pedigree> getPedigrees() {return pedigrees;}

    public void setPedigrees(List<Pedigree> pedigrees) {this.pedigrees = pedigrees;}
}