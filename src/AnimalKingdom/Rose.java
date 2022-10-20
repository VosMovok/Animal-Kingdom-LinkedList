package AnimalKingdom;

public class Rose extends Plants{
    Rose() {
        ecosystem = "Land";
        rootType = "Tap";
        seedType = "Dicotyledon";
    }
    String plantName = "Rose";

    public String getPlantName() {
        return "The plant name is " + plantName;
    }
}
