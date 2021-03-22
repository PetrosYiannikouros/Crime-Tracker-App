import java.util.ArrayList;

public class Criminals {
    private static Criminals criminals = null;
    private static ArrayList<Criminal> criminalList = new ArrayList<>();

    private Criminals() {
        criminalList = DataLoader.loadCriminals();
    }

    public static Criminals getInstance() {
        if (criminals == null) {
            criminals = new Criminals();
        }
        return criminals;
    }

    public ArrayList<Criminal> getCriminals() {
        return criminalList;
    }

    public void addCriminal(String firstName, String lastName, String phoneNumber, String nickName, int age, int weight,
            String height, String race, double shoeSize, String naturalHairColor, String hairLength,
            String facialHairDesc, String clothesDesc, boolean hasCar, String carSpecs, String licensePlate,
            boolean inJail) {
        criminalList.add(new Criminal(firstName, lastName, phoneNumber, nickName, age, weight, height, race, shoeSize,
                naturalHairColor, hairLength, facialHairDesc, clothesDesc, hasCar, carSpecs, licensePlate, inJail));
        DataWriter.saveCriminals();
    }
}