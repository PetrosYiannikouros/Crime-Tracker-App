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
    public Suspect() 
    {

    }

    public Suspect(String firstName, String lastName, boolean deceased, List<String> caseNums,
                String pattern, Integer id, String nickName, int age, int weight, 
                String height, String race, String naturalHairColor, String hairLength, 
                boolean facialHair, String facialHairDesc, String clothesDesc,
                boolean hasCar, String carSpecs, String licensePlate, String story, List<String> reasons)
    {
        super(firstName, lastName, deceased, caseNums, pattern, id, nickName, age, weight, height, race, naturalHairColor, 
            hairLength, facialHair, facialHairDesc, clothesDesc, hasCar, carSpecs, licensePlate, story);
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
