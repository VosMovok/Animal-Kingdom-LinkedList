package AnimalKingdom;

public abstract class Animal {
    String animalKingdom;
    String animalClassification;
    int numberOfLegs;

    public Animal() {}
    String getAnimalKingdom() {
        return "The animal is " + animalKingdom;
    }

    String getAnimalClassification() {
        return "The animal class is " + animalClassification;
    }

    String getNumberOfLegs() {
        return "The animal has " + numberOfLegs + " legs";
    }

    public void printAll() {
        System.out.println(getAnimalKingdom());
        System.out.println(getAnimalClassification());
        System.out.println(getNumberOfLegs());
    }

}
