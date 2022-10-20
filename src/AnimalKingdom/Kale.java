package AnimalKingdom;

public class Kale extends Plants implements Food{
    Kale() {
        ecosystem = "Water";
        rootType = "Fibrous";
        seedType = "Dicotyledon";
    }

    String plantName = "Kale";

    public String getPlantName() {
        return "The plant name is " + plantName;
    }

    @Override
    public String foodType() {
        return "The plant can be eaten as vegetables";
    }

    @Override
    public String ediblePart() {
        return "The stem and leaves of the plant can be eaten";
    }
}