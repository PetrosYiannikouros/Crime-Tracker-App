/**
 * The evidence for each crime
 */
public class Evidence {
    private String type;
    private String description;
    private int amount;
    private Person personOfInterest;

    /**
     * Constructor for Evidence object
     */
    public Evidence(String type, String description, int amount) {
        this.type = type;
        this.description = description;
        this.amount = amount;
    }

    /**
     * Add something additional to evidence
     */
    public void addPersonOfInterest(Person personOfInterest) {
        this.personOfInterest = personOfInterest;
    }

    /**
     * Only Admin will be able to delete evidence
     */
    private void delete() {
        // future functionality
    }
}
