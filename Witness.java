import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

/**
 * A witness to a crime. At or near the scene of the crime
 */
public class Witness extends Person {
    private boolean proof;
    private String story;
    private String location;

    /**
     * Constructor of witness object
     */
    public Witness() {

    }

    public Witness(String firstName, String lastName, String phoneNumber, boolean proof, String story,
            String location) {
        super(firstName, lastName, phoneNumber);
        this.proof = proof;
        this.story = story;
        this.location = location;
    }

    public Witness(UUID id, String firstName, String lastName, String phoneNumber, boolean proof, String story,
            String location) {
        super(id, firstName, lastName, phoneNumber);
        this.proof = proof;
        this.story = story;
        this.location = location;
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
}
