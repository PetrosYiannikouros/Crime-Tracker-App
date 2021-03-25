import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

/**
 * A witness to a crime. At or near the scene of the crime
 */
public class Witness extends Person {
    String pattern = "dd-MM-yyyy HH:mm";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private boolean proof;
    private String story;
    private String location;
    private SimpleDateFormat timeOfEvent;

    /**
     * Constructor of witness object
     */
    public Witness() {

    }

    public Witness(String firstName, String lastName, String phoneNumber, List<Integer> caseNums, boolean proof,
            String story, String location, SimpleDateFormat timeOfEvent) {
        super(firstName, lastName, phoneNumber);
        this.proof = proof;
        this.story = story;
        this.location = location;
        this.timeOfEvent = timeOfEvent;
    }

    public Witness(UUID id, String firstName, String lastName, String phoneNumber, List<Integer> caseNums,
            boolean proof, String story, String location, SimpleDateFormat timeOfEvent) {
        super(id, firstName, lastName, phoneNumber);
        this.proof = proof;
        this.story = story;
        this.location = location;
        this.timeOfEvent = timeOfEvent;
    }

    // getters -----------------------------------------------------

    /**
     * 
     * @return
     */
    public boolean hasProof() {
        return this.proof;
    }

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
    public String getLocation() {
        return this.location;
    }

    /**
     * 
     * @return
     */
    public SimpleDateFormat getTimeOfEvent() {
        return this.timeOfEvent;
    }

    // setters -----------------------------------------------------

    /**
     * 
     * @param familyMembers
     */
    public void setProof(boolean proof) {
        this.proof = proof;
    }

    /**
     * 
     * @param story
     */
    public void setStory(String story) {
        this.story = story;
    }

    /**
     * 
     * @param number
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @param description
     */
    public void setTimeOfEvent(SimpleDateFormat timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }
}
