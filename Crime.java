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
    private Officer assigned;
    private List<Person> personsOfInterest;
    private List<Person> witnesses;
    private List<Person> victims;
    private List<Evidence> evidenceList;
    private boolean isSolved;

    /**
     * Constructor for Crime object
     */
    public Crime(int caseNumber, TypesOfCrimes type, String description, SimpleDateFormat date, String address,
            Officer assigned) {
        this.caseNumber = caseNumber;
        this.type = type;
        this.description = description;
        this.date = date;
        this.address = address;
        this.assigned = assigned;
        personsOfInterest = new ArrayList<>();
        witnesses = new ArrayList<>();
        victims = new ArrayList<>();
        evidenceList = new ArrayList<>();
        personsOfInterest = new ArrayList<>();
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
     * Accessor for assigned officer
     * 
     * @return assigned officer for crime
     */
    public Officer getAssigned() {
        return assigned;
    }

    /**
     * Accessor for persons of interest
     * 
     * @return list of persons of interest for a specific case
     */
    public List<Person> getPersonsOfInterest() {
        return personsOfInterest;
    }

    /**
     * Accessor for witnesses
     * 
     * @return list of witnesses for a specific case
     */
    public List<Person> getWitnesses() {
        return witnesses;
    }

    /**
     * Accessor for victims
     * 
     * @return list of victims for a specific case
     */
    public List<Person> getVictims() {
        return victims;
    }

    /**
     * Accessor for evidence
     * 
     * @return list of evidence for a specific case
     */
    public List<Evidence> getEvidenceList() {
        return evidenceList;
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
    public void addPersonOfInterest(Person personOfInterest) {
        personsOfInterest.add(personOfInterest);
    }

    /**
     * Add witness to crime
     * 
     * @param witness associated to crime
     */
    public void addWitness(Person witness) {
        witnesses.add(witness);
    }

    /**
     * Add victim to crime
     * 
     * @param victim associated to crime
     */
    public void addVictim(Person victim) {
        victims.add(victim);
    }

    /**
     * Add evidence to crime
     * 
     * @param evidence associate to crime
     */
    public void addEvidence(Evidence evidence) {
        evidenceList.add(evidence);
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
