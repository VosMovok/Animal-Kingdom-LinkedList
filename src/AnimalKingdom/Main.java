package AnimalKingdom;

public class Main {
    public static void main(String[] args) {
        Cat meow = new Cat();
        Goat mbee = new Goat();
        Rose red = new Rose();
        Kale green = new Kale();

        System.out.println(meow.getAnimalName());
        System.out.println("--------------------------------");
        meow.printAll();
        System.out.println();

        System.out.println(mbee.getAnimalName());
        System.out.println("--------------------------------");
        mbee.printAll();
        System.out.println(mbee.foodType());
        System.out.println(mbee.ediblePart());
        System.out.println();

        System.out.println(red.getPlantName());
        System.out.println("--------------------------------");
        red.printAll();
        System.out.println();

        System.out.println(green.getPlantName());
        System.out.println("--------------------------------");
        green.printAll();
        System.out.println(green.foodType());
        System.out.println(green.ediblePart());

    }
}