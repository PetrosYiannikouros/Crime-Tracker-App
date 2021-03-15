/**
 * The evidence for each crime
 */
public class Evidence {
    private String type;
    private String description;
    private int amount;

    /**
     * Constructor for Evidence object
     */
    public Evidence(String type, String description, int amount) {
        this.type = type;
        this.description = description;
        this.amount = amount;
    }

    /**
     * Only Admin will be able to delete evidence
     */
    private void delete() {
        // future functionality
    }
}
