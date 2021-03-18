import java.util.List;

/**
 * Victim class creates victim adds stories and family members extends class
 * person
 */
public class Victim extends Person {
    private List<String> familyMembers;
    private String criminalDesc;

    /**
     * default constructor
     */
    public Victim() {

    }

    public Victim(String firstName, String lastName, String phoneNumber, List<String> familyMembers,
            String criminalDesc) {
        super(firstName, lastName, phoneNumber);
        this.familyMembers = familyMembers;
        this.criminalDesc = criminalDesc;
    }

    // getters -----------------------------------------------------

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
    public String getCriminalDesc() {
        return this.criminalDesc;
    }

    // setters -----------------------------------------------------

    /**
     * 
     * @param familyMembers
     */
    public void setFamilyMembers(List<String> familyMembers) {
        this.familyMembers = familyMembers;
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
