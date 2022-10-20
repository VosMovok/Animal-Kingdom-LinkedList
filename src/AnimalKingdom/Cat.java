package AnimalKingdom;

public class Cat extends Animal{
    public Cat() {
        animalKingdom = "Vertebrate";
        animalClassification = "Mammal";
        numberOfLegs = 4;
    };
    String animalName = "Cat";
    public String getAnimalName() {
        return "The animal name is " + animalName;
    };
}
