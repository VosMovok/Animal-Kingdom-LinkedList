package AnimalKingdom;

public class run {
    public static void main(String[] args) {
        LinkedList<Cat> meow = new LinkedList<>();
        meow.add(new Cat());
        LinkedList<Goat> mbee = new LinkedList<>();
        mbee.add(new Goat());
        LinkedList<Rose> red = new LinkedList<>();
        red.add(new Rose());
        LinkedList<Kale> green = new LinkedList<>();
        green.add(new Kale());


        System.out.println(meow.get(0).getAnimalName());
        System.out.println("--------------------------------");
        meow.get(0).printAll();
        System.out.println();

        System.out.println(mbee.get(0).getAnimalName());
        System.out.println("--------------------------------");
        mbee.get(0).printAll();
        System.out.println(mbee.get(0).foodType());
        System.out.println(mbee.get(0).ediblePart());
        System.out.println();


        System.out.println(red.get(0).getPlantName());
        System.out.println("--------------------------------");
        red.get(0).printAll();
        System.out.println();

        System.out.println(green.get(0).getPlantName());
        System.out.println("--------------------------------");
        green.get(0).printAll();
        System.out.println(green.get(0).foodType());
        System.out.println(green.get(0).ediblePart());
    }
}
