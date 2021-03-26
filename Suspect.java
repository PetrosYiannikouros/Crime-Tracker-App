import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
     * @param id
     * @param firstName
     * @param lastName
     * @param deceased
     * @param phoneNumber
     * @param nickName
     * @param age
     * @param weight
     * @param height
     * @param race
     * @param gender
     * @param shoeSize
     * @param naturalHairColor
     * @param hairLength
     * @param facialHairDesc
     * @param clothesDesc
     * @param tattoed
     * @param tattooes
     * @param hasCar
     * @param carDescription
     * @param licensePlate
     * @param reasons
     */
    public Suspect(UUID id, String firstName, String lastName, boolean deceased, String phoneNumber, String nickName,
            int age, int weight, String height, String race, String gender, double shoeSize, String naturalHairColor,
            String hairLength, String facialHairDesc, String clothesDesc, boolean tattoed, ArrayList<String> tattooes,
            boolean hasCar, String carDescription, String licensePlate, ArrayList<String> reasons) {
        super(id, firstName, lastName, deceased, phoneNumber, nickName, age, weight, height, race, gender, shoeSize,
                naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, tattooes, hasCar, carDescription,
                licensePlate);
        this.reasons = reasons;
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
