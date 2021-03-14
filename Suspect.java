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

    public Suspect(String firstName, String lastName,String pattern, String nickName, int age, int weight, String height, String race, String carDescription)
    {
        super(firstName, lastName, pattern, nickName, age, weight, height, race, carDescription);
        reasons = new ArrayList<>();

    }

    /**
     * Add a reason why this could be "our guy" and document case against him/her
     * 
     * @param reason why he/she is suspected
     */
    public void addReason(String reason) {
    }
}
