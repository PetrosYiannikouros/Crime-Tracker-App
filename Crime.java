import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores all details
 */
public class Crime {
    String pattern = "dd-MM-yyyy HH:mm";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private int caseNumber;
    private TypesOfCrimes type;
    private String description;
    private SimpleDateFormat date;
    private String address;
    private String assignedId;
    private List<Criminal> criminals;
    private List<Suspect> suspects;
    private List<Witness> witnesses;
    private List<Victim> victims;
    private List<Evidence> evidence;
    private boolean isSolved;

    /**
     * Constructor for Crime object
     */
    public Crime(int caseNumber, TypesOfCrimes type, String description, SimpleDateFormat date, String address,
            String assignedId, List<Criminal> criminals, List<Suspect> suspects, List<Witness> witnesses,
            List<Victim> victims, List<Evidence> evidence) {
        this.caseNumber = caseNumber;
        this.type = type;
        this.description = description;
        this.date = date;
        this.address = address;
        this.assignedId = assignedId;
        this.criminals = criminals;
        this.suspects = suspects;
        this.witnesses = witnesses;
        this.victims = victims;
        this.evidence = evidence;
        isSolved = false;
    }

    /** from scratch */
    public Crime(int caseNumber, TypesOfCrimes type, String description, SimpleDateFormat date, String address,
            String assignedId) {
        this.caseNumber = caseNumber;
        this.type = type;
        this.description = description;
        this.date = date;
        this.address = address;
        this.assignedId = assignedId;
        this.criminals = new ArrayList<>();
        this.suspects = new ArrayList<>();
        this.witnesses = new ArrayList<>();
        this.victims = new ArrayList<>();
        this.evidence = new ArrayList<>();
        isSolved = false;
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
     * Accessor for type of crime enum
     * 
     * @return type of crime
     */
    public TypesOfCrimes getType() {
        return this.type;
    }

    /**
     * Accessor for description of crime
     * 
     * @return description of crime
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Accessor for date of crime
     * 
     * @return date of crime
     */
    public SimpleDateFormat getDate() {
        return date;
    }

    /**
     * Accessor for address of crime
     * 
     * @return address of crime
     */
    public String getAddress() {
        return address;
    }

    /**
     * Accessor for assigned officer/detective
     * 
     * @return assigned officer/detective for crime
     */
    public String getAssignedId() {
        return assignedId;
    }

    /**
     * Accessor for criminals
     * 
     * @return list of persons of interest for a specific case
     */
    public List<Criminal> getCriminals() {
        return criminals;
    }

    /**
     * Accessor for suspects
     * 
     * @return list of persons of interest for a specific case
     */
    public List<Suspect> getSuspects() {
        return suspects;
    }

    /**
     * Accessor for witnesses
     * 
     * @return list of witnesses for a specific case
     */
    public List<Witness> getWitnesses() {
        return witnesses;
    }

    /**
     * Accessor for victims
     * 
     * @return list of victims for a specific case
     */
    public List<Victim> getVictims() {
        return victims;
    }

    /**
     * Accessor for evidence
     * 
     * @return list of evidence for a specific case
     */
    public List<Evidence> getEvidence() {
        return evidence;
    }

    /**
     * Accessor for boolean value isSolved
     * 
     * @return isSolved boolean value
     */
    public boolean getIsSolved() {
        return isSolved;
    }

    /**
     * Mutator for boolean value isSolved
     * 
     * @param isSolved input whether crime is solved or not
     */
    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    /**
     * Add criminal to crime
     * 
     * @param personOfInterest associated to crime
     */
    public void addCriminal(Criminal criminal) {
        criminals.add(criminal);
    }

    /**
     * Add suspect to crime
     * 
     * @param personOfInterest associated to crime
     */
    public void addSuspect(Suspect suspect) {
        suspects.add(suspect);
    }

    /**
     * Add witness to crime
     * 
     * @param witness associated to crime
     */
    public void addWitness(Witness witness) {
        witnesses.add(witness);
    }

    /**
     * Add victim to crime
     * 
     * @param victim associated to crime
     */
    public void addVictim(Victim victim) {
        victims.add(victim);
    }

    /**
     * Add evidence to crime
     * 
     * @param evidence associate to crime
     */
    public void addEvidence(Evidence evidenceItem) {
        evidence.add(evidenceItem);
    }

    /**
     * Mutator for boolean isSolved
     */
    public void setSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    /**
     * May delete crime for possible errors. Only Admins may use this
     */
    private void deleteCrime() {
        // future functionality
    }
}
