import java.util.ArrayList;
import java.util.List;

/**
 * A convicted criminal
 */
public class Criminal extends PersonOfInterest {
    private boolean inJail;
    private List<String> convictions;
    private double shoeSize;
    private int numOfCrimes; // just get size of convictions

    /**
     * Constructor for creating a criminal object
     */
    public Criminal() {

    }

    public Criminal(String firstName, String lastName, String phoneNumber, int id, String nickName, int age, int weight,
            String height, String race, String naturalHairColor, String hairLength, String facialHairDesc,
            String clothesDesc, boolean hasCar, String carSpecs, String licensePlate, boolean inJail, double shoeSize) {
        super(firstName, lastName, phoneNumber, id, nickName, age, weight, height, race, naturalHairColor, hairLength,
                facialHairDesc, clothesDesc, hasCar, carSpecs, licensePlate);
        this.inJail = inJail;
        this.convictions = new ArrayList<>();
        this.shoeSize = shoeSize;
        this.numOfCrimes = this.convictions.size();
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

    /**
     * 
     * @return
     */
    public double getShoeSize() {
        return this.shoeSize;
    }

    /**
     * 
     * @return
     */
    public int getNumOfCrimes() {
        return this.numOfCrimes;
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
     * 
     * @param shoeSize
     */
    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    /**
     * 
     * @param crimeNum
     */
    public void setNumOfCrimes(int crimeNum) {
        this.numOfCrimes = crimeNum;
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
