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
    public Criminal() {
    }

    /**
     * Adding convictions to a criminal
     * 
     * @param conviction to add to criminal
     */
    public void addConvictions(String conviction) {
    }
}
