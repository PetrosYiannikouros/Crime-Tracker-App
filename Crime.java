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
    private List<String> personsOfInterestIds;
    private List<String> witnessIds;
    private List<String> victimIds;
    private List<String> evidenceIds;
    private boolean isSolved;

    /**
     * Constructor for Crime object
     */
    public Crime(int caseNumber, TypesOfCrimes type, String description, SimpleDateFormat date, String address,
            String assignedId) {
        this.caseNumber = caseNumber;
        this.type = type;
        this.description = description;
        this.date = date;
        this.address = address;
        this.assignedId = assignedId;
        personsOfInterestIds = new ArrayList<>();
        witnessIds = new ArrayList<>();
        victimIds = new ArrayList<>();
        evidenceIds = new ArrayList<>();
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
     * Accessor for persons of interest
     * 
     * @return list of persons of interest for a specific case
     */
    public List<String> getPersonsOfInterestIds() {
        return personsOfInterestIds;
    }

    /**
     * Accessor for witnesses
     * 
     * @return list of witnesses for a specific case
     */
    public List<String> getWitnessIds() {
        return witnessIds;
    }

    /**
     * Accessor for victims
     * 
     * @return list of victims for a specific case
     */
    public List<String> getVictimIds() {
        return victimIds;
    }

    /**
     * Accessor for evidence
     * 
     * @return list of evidence for a specific case
     */
    public List<String> getEvidenceIds() {
        return evidenceIds;
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
     * Add person of interest to crime
     * 
     * @param personOfInterest associated to crime
     */
    public void addPersonOfInterestId(String personOfInterestId) {
        personsOfInterestIds.add(personOfInterestId);
    }

    /**
     * Add witness to crime
     * 
     * @param witness associated to crime
     */
    public void addWitnessId(String witnessId) {
        witnessIds.add(witnessId);
    }

    /**
     * Add victim to crime
     * 
     * @param victim associated to crime
     */
    public void addVictimId(String victimId) {
        victimIds.add(victimId);
    }

    /**
     * Add evidence to crime
     * 
     * @param evidence associate to crime
     */
    public void addEvidenceId(String evidenceId) {
        evidenceIds.add(evidenceId);
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
