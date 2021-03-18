import java.util.ArrayList;
import java.util.List;

/**
 * Person class used for creating people going to be an extension to many
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private boolean deceased;
    private String phoneNumber;
    private List<String> stories;
    protected List<Integer> caseNums;

    /**
     * default constructor for person
     */
    protected Person() {

    }

    protected Person(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deceased = false; // default is not deceased
        this.phoneNumber = phoneNumber;
        this.stories = new ArrayList<>();
        this.caseNums = new ArrayList<>();
    }

    // getter section
    /**
     * get First Name
     * 
     * @return String firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * get Last Name
     * 
     * @return String lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * is Deceased boolean
     * 
     * @return deceased status true = dead false = alive
     */
    public boolean getIsDeceased() {
        return this.deceased;
    }

    /**
     * Accessor for phone numer
     * 
     * @return phone number in string format
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public List<Integer> getCases() {
        return caseNums;
    }

    // setter section
    /**
     * set First Name
     * 
     * @param String firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set Last Name
     * 
     * @param String lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set deceased status
     * 
     * @param boolean deceased
     */
    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addStory(String story) {
        stories.add(story);
    }

    public void addCase(Integer caseNum) {
        caseNums.add(caseNum);
    }
}
