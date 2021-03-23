import java.util.ArrayList;

public class Suspects {
    private static Suspects suspects = null;
    private static ArrayList<Suspect> suspectList = new ArrayList<>();

    private Suspects() {
        suspectList = DataLoader.loadSuspects();
    }

    public static Suspects getInstance() {
        if (suspects == null) {
            suspects = new Suspects();
        }
        return suspects;
    }

    public ArrayList<Suspect> getSuspects() {
        return suspectList;
    }

    public void addSuspect(String firstName, String lastName, String phoneNumber, String nickName, int age, int weight,
            String height, String race, double shoeSize, String naturalHairColor, String hairLength,
            String facialHairDesc, String clothesDesc, boolean tattoed, boolean hasCar, String carSpecs,
            String licensePlate) {
        suspectList.add(new Suspect(firstName, lastName, phoneNumber, nickName, age, weight, height, race, shoeSize,
                naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, hasCar, carSpecs, licensePlate));
        DataWriter.saveCriminals();
    }

}
