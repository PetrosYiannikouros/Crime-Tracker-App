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
            Officer assigned, boolean isSolved) {
        this.type = type;
        this.description = description;
        this.date = date;
        this.address = address;
        this.caseNumber = caseNumber;
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
     * Will display all contents of a particular crime
     */
    public void displayCrime() {
        System.out.println("Case number: " + caseNumber);
        System.out.println("Type: " + this.type);
        System.out.println("Description: " + this.description);
        System.out.println("Date occurred: " + this.date);
        System.out.println("Location occurred: " + this.address);
        System.out.println("Officer assigned: " + this.assigned);
        System.out.println("Person(s) of Interest:");
        if (personsOfInterest.isEmpty())
            System.out.println("None");
        else
            for (Person personOfInterest : personsOfInterest)
                System.out.println("Details from display or toString of class");
        System.out.println("Witness(es):");
        if (witnesses.isEmpty())
            System.out.println("None");
        else
            for (Person witness : witnesses)
                System.out.println("Details from display or toString of class");
        System.out.println("Victim(s):");
        if (victims.isEmpty())
            System.out.println("None");
        else
            for (Person victim : victims)
                System.out.println("Details from display or toString of class");
        System.out.println("Evidence:");
        if (witnesses.isEmpty())
            System.out.println("None");
        else
            for (Evidence evidence : evidenceList)
                System.out.println("Details from display or toString of class");
        String answer = isSolved ? "Yes" : "No";
        System.out.println("Is case solved? " + answer);
    }

    /**
     * May delete crime for possible errors. Only Admins may use this
     */
    private void deleteCrime() {
        // future functionality
    }
}
