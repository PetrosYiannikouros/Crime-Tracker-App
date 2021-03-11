import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Stores all details
 */
public class Crime {
    String pattern = "dd-MM-yyyy HH:mm";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private TypesOfCrimes type;
    private String description;
    private SimpleDateFormat date;
    private String address;
    private int caseNumber;
    private Officer firstOnScene;
    private List<Person> suspects;
    private List<Person> criminals;
    private List<Person> witnesses;
    private List<Person> victims;
    private List<Evidence> evidence;
    private boolean isSolved;

    /**
     * Constructor for Crime object
     */
    public Crime() {
    }

    /**
     * Accessor for case number. Will help find a particular case
     * 
     * @return case number for specific crime
     */
    public int getCaseNumber() {
        return caseNumber;
    }

    /**
     * Accessor for suspects
     * 
     * @return suspects for a specific case
     */
    public List<Person> getSuspects() {
        return suspects;
    }

    /**
     * Accessor for criminals
     * 
     * @return suspects for a specific case
     */
    public List<Person> getCriminal() {
        return criminals;
    }

    /**
     * Accessor for witnesses
     * 
     * @return witnesses for a specific case
     */
    public List<Person> getWitnesses() {
        return witnesses;
    }

    /**
     * Accessor for victims
     * 
     * @return victims for a specific case
     */
    public List<Person> getVictims() {
        return victims;
    }

    /**
     * Accessor for evidence
     * 
     * @return evidence for a specific case
     */
    public List<Evidence> getEvidence() {
        return evidence;
    }

    /**
     * Add suspect to crime
     * 
     * @param suspect associated to crime
     */
    public void addSuspect(Person suspect) {
    }

    /**
     * Add criminal to crime
     * 
     * @param criminal associated to crime
     */
    public void addCriminal(Person criminal) {
    }

    /**
     * Add witness to crime
     * 
     * @param witness associated to crime
     */
    public void addWitness(Person witness) {
    }

    /**
     * Add victim to crime
     * 
     * @param victim associated to crime
     */
    public void addVictim(Person victim) {
    }

    /**
     * Add evidence to crime
     * 
     * @param evidence associate to crime
     */
    public void addEvidence(Evidence evidence) {
    }

    /**
     * Mutator for boolean isSolved
     */
    public void setSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    /**
     * Will display all contents of a particular crime
     */
    public void displayCrime() {
    }

    /**
     * May delete crime for possible errors. Only Admins may use this
     */
    private void deleteCrime() {
    }
}
