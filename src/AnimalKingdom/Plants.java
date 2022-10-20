package AnimalKingdom;

public abstract class Plants {
    String seedType;
    String rootType;
    String ecosystem;
    public Plants() {
    }

    String getSeedType() {
        return "The plant seed type is " + seedType;
    }

    String getRootType() {
        return "The Plant has " + rootType + " root";
    }

    String getEcosystem() {
        return "The plant ecosystem is on " + ecosystem;
    }

    public void printAll() {
        System.out.println(getSeedType());
        System.out.println(getRootType());
        System.out.println(getEcosystem());
    }

}

