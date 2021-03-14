import java.util.ArrayList;
import java.util.List;

/**
 * A convicted criminal
 */
public class Criminal extends PersonOfInterest {
    private boolean inJail;
    private List<String> convictions;
    private String vehicle;
    private double shoeSize;
    private int numOfCrimes; // just get size of convictions

    /**
     * Constructor for creating a criminal object
     */
    public Criminal() 
    {

    }

    public Criminal(String firstName, String lastName,String pattern, String nickName, int age, int weight, String height, String race, String carDescription, String vehicle, double shoeSize, int numOfCrimes)
    {
        super(firstName, lastName, pattern, nickName, age, weight, height, race, carDescription);
        this.vehicle = vehicle;
        this.shoeSize = shoeSize;
        this.numOfCrimes = numOfCrimes;
        if(inJail)
        {
            this.inJail = inJail;
        }
        convictions = new ArrayList<>();
    }

    /**
     * Adding convictions to a criminal
     * 
     * @param conviction to add to criminal
     */
    public void addConvictions(String conviction) {
    }
}
