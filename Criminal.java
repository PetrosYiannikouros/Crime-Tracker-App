import java.util.ArrayList;
import java.util.List;

/**
 * A convicted criminal
 */
public class Criminal extends PersonOfInterest {
    private boolean inJail;
    private List<String> convictions;

    /**
     * Constructor for creating a criminal object
     */
    public Criminal() {

    }

    public Criminal(String firstName, String lastName, String phoneNumber, String nickName, int age, int weight,
            String height, String race, double shoeSize, String naturalHairColor, String hairLength,
            String facialHairDesc, String clothesDesc, boolean tattoed, boolean hasCar, String carDescription,
            String licensePlate, boolean inJail) {
        super(firstName, lastName, phoneNumber, nickName, age, weight, height, race, shoeSize, naturalHairColor,
                hairLength, facialHairDesc, clothesDesc, tattoed, hasCar, carDescription, licensePlate);
        this.inJail = inJail;
        this.convictions = new ArrayList<>();
    }

    // getters ---------------------------------------------------

    /**
     * 
     * @return
     */
    public boolean isInJail() {
        return this.inJail;
    }

    /**
     * 
     * @return
     */
    public List<String> getConvictions() {
        return this.convictions;
    }

    // setters ---------------------------------------------------

    /**
     * 
     * @param jailed
     */
    public void setInJail(boolean jailed) {
        this.inJail = jailed;
    }

    /**
     * 
     * @param convictions
     */
    public void setConvictions(List<String> convictions) {
        this.convictions = convictions;
    }

    /**
     * Adding convictions to a criminal
     * 
     * @param conviction to add to criminal
     */
    public void addConvictions(String conviction) {
        convictions.add(conviction);
    }
}
