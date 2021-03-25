import java.util.ArrayList;
import java.util.List;

/**
 * Suspicious person possibly linked to an ongoing investigation of a crime
 */
public class Suspect extends PersonOfInterest {
    private List<String> reasons;

    /**
     * Constructor for suspect object
     */
    public Suspect() {

    }

    public Suspect(String firstName, String lastName, String phoneNumber, String nickName, int age, int weight,
            String height, String race, String gender, double shoeSize, String naturalHairColor, String hairLength,
            String facialHairDesc, String clothesDesc, boolean tattoed, boolean hasCar, String carDescription,
            String licensePlate) {
        super(firstName, lastName, phoneNumber, nickName, age, weight, height, race, gender, shoeSize, naturalHairColor,
                hairLength, facialHairDesc, clothesDesc, tattoed, hasCar, carDescription, licensePlate);
        this.reasons = new ArrayList<>();
    }

    /**
     * 
     * @return
     */
    public List<String> getReasons() {
        return this.reasons;
    }

    /**
     * Add a reason why this could be "our guy" and document case against him/her
     * 
     * @param reason why he/she is suspected
     */
    public void addReason(String reason) {
        reasons.add(reason);
    }
}
