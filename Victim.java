import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * Victim class creates victim adds stories and family members extends class
 * person
 */
public class Victim extends Person {
    private String location;
    private String story;
    private String criminalDesc;

    /**
     * default constructor
     */
    public Victim() {

    }

    public Victim(String firstName, String lastName, String phoneNumber, String location, String story,
            String criminalDesc) {
        super(firstName, lastName, phoneNumber);
        this.location = location;
        this.story = story;
        this.criminalDesc = criminalDesc;
    }

    public Victim(UUID id, String firstName, String lastName, String phoneNumber, String location, String story,
            String criminalDesc) {
        super(id, firstName, lastName, phoneNumber);
        this.location = location;
        this.story = story;
        this.criminalDesc = criminalDesc;
    }

    // getters -----------------------------------------------------

    public String getLocation() {
        return this.location;
    }

    public String getStory() {
        return this.story;
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
     * @param description
     */
    public void setCriminalDesc(String description) {
        this.criminalDesc = description;
    }
}
