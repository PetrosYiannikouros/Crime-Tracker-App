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

    public Suspect(String firstName, String lastName, String phoneNumber, int id, String nickName, int age, int weight,
            String height, String race, String naturalHairColor, String hairLength, String facialHairDesc,
            String clothesDesc, boolean hasCar, String carSpecs, String licensePlate, boolean inJail, double shoeSize) {
        super(firstName, lastName, phoneNumber, id, nickName, age, weight, height, race, naturalHairColor, hairLength,
                facialHairDesc, clothesDesc, hasCar, carSpecs, licensePlate);
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
     * 
     * @param reasons
     */
    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
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
