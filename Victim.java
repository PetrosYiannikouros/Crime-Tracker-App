import java.util.List;

/**
 * Victim class
 * creates victim
 * adds stories and family members
 * extends class person
 */
public class Victim extends Person {
    private String story;
    private List<String> familyMembers;
    private String phoneNumber;
    private String criminalDesc;

    /**
     * default constructor
     */
    public Victim() 
    {

    }
    public Victim (String firstName, String lastName, 
                boolean deceased, List<Integer> caseNums, String story,
                List<String> familyMembers,  String phoneNumber, String criminalDesc)
    {
        super(firstName, lastName, deceased, caseNums);
        this.story = story;
        this.familyMembers = familyMembers;
        this.phoneNumber = phoneNumber;
        this.criminalDesc = criminalDesc;
    }

    //getters -----------------------------------------------------

    /**
     * 
     * @return
     */
    public String getStory() {
        return this.story;
    }

    /**
     * 
     * @return
     */
    public List<String> getFamily() {
        return this.familyMembers;
    }

    /**
     * 
     * @return
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * 
     * @return
     */
    public String getCriminalDesc() {
        return this.criminalDesc;
    }

    //setters -----------------------------------------------------

    /**
     * 
     * @param story
     */
    public void setStory(String story) {
        this.story = story;
    }

    /**
     * 
     * @param familyMembers
     */
    public void setFamilyMembers(List<String> familyMembers) {
        this.familyMembers = familyMembers;
    }

    /**
     * 
     * @param number
     */
    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    /**
     * 
     * @param description
     */
    public void setCriminalDesc(String description) {
        this.criminalDesc = description;
    }


    /**
     * 
     * @param familyMember
     */
    public void addFamilyMember(String familyMember) {
        familyMembers.add(familyMember);
    }

}
