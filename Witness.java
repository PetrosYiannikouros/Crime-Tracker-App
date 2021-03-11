import java.text.SimpleDateFormat;
import java.util.List;

/**
 * A witness to a crime. At or near the scene of the crime
 */
public class Witness extends Person {
    String pattern = "dd-MM-yyyy HH:mm";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private boolean proof;
    private List<String> stories;
    private String location;
    private SimpleDateFormat timeOfEvent;

    /**
     * Constructor of witness object
     */
    public Witness() {
    }

    /**
     * Adds account to the totality of witness's tale
     * 
     * @param story of what happened (at least partially)
     */
    public void addStory(String story) {
    }

}
