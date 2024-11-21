package entity;

public class Dog {
    private long id;
    private String name;
    private String breed;
    private String dateOfBirth;
    private String registrationNumber;
    private String gender;


    public Dog(long id, String name, String breed, String gender, String registrationNumber, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.registrationNumber = registrationNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Dog () {}

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public String getBreed() {return breed;}

    public void setBreed(String breed) {this.breed = breed;}

    public String getRegistrationNumber() {return registrationNumber;}

    public void setRegistrationNumber(String registrationNumber) {this.registrationNumber = registrationNumber;}

    public String getGender() {return gender;}

    public void setGender(String gender) {this.gender = gender;}

}
