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

    public Criminal(String firstName, String lastName, boolean deceased, List<String> caseNums,
                String pattern, Integer id, String nickName, int age, int weight, 
                String height, String race, String naturalHairColor, String hairLength, 
                boolean facialHair, String facialHairDesc, String clothesDesc,
                boolean hasCar, String carSpecs, String licensePlate, String story,
                boolean inJail, List<String> convictions, String vehicle, double shoeSize, int numOfCrimes)
    {
        super(firstName, lastName, deceased, caseNums, pattern, id, nickName, age, weight, height, race, naturalHairColor, 
        hairLength, facialHair, facialHairDesc, clothesDesc, hasCar, carSpecs, licensePlate, story);
        this.inJail = inJail;
        this.convictions = convictions;
        this.vehicle = vehicle;
        this.shoeSize = shoeSize;
        this.numOfCrimes = numOfCrimes;
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
    public String getVehicle() {
        return this.vehicle;
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
     * @param vehicle
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
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
