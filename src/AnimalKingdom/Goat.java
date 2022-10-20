package AnimalKingdom;

public class Goat extends Animal implements Food {
    public Goat() {
        animalKingdom = "Vertebrate";
        animalClassification = "Mammals";
        numberOfLegs = 4;
    }

    String animalName = "Goat";

    public String getAnimalName() {
        return "The animal name is " + animalName;
    }

    public String foodType() {
        return "The animal can be eaten as meat";
    }

    public String ediblePart() {
        return "The whole part of the animal can be eaten";
    }
}
