import java.util.ArrayList;
import java.util.UUID;

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
            String height, String race, String gender, double shoeSize, String naturalHairColor, String hairLength,
            String facialHairDesc, String clothesDesc, boolean tattoed, boolean hasCar, String carSpecs,
            String licensePlate, boolean inJail) {
        criminalList.add(new Criminal(firstName, lastName, phoneNumber, nickName, age, weight, height, race, gender,
                shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, hasCar, carSpecs,
                licensePlate, inJail));
        DataWriter.saveCriminals();
    }

    public Criminal getCriminal(UUID id) {
        for (int i = 0; i < criminalList.size(); i++) {
            Criminal criminal = criminalList.get(i);
            if (criminal.getId().equals(id))
                return criminal;
        }
        return null;
    }
}
