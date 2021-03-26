
/**
 * class for Detective
 * extention of Officer
 */
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Detective extends Officer {
    private int activeCases;
    private int solvedCases;
    private List<Integer> caseNumbers;

    /**
     * Default Constructor
     */
    public Detective(String firstName, String lastName, String userName, String password, String precint,
            String department, int yearsServed, String rank, String badgeNumber, int activeCases, int solvedCases) {
        super(firstName, lastName, userName, password, precint, department, yearsServed, rank, badgeNumber);
        this.activeCases = activeCases;
        this.solvedCases = solvedCases;
        this.caseNumbers = new ArrayList<>();
    }

    public Detective(UUID id, String firstName, String lastName, String userName, String password, String precint,
            String department, int yearsServed, String rank, String badgeNumber, int activeCases, int solvedCases,
            ArrayList<Integer> caseNumbers) {
        super(id, firstName, lastName, userName, password, precint, department, yearsServed, rank, badgeNumber);
        this.activeCases = activeCases;
        this.solvedCases = solvedCases;
        this.caseNumbers = caseNumbers;
    }

    // getter section
    /**
     * Getter for active cases
     * 
     * @return int activeCases
     */
    public int getActiveCases() {
        return activeCases;
    }

    /**
     * get number of solved cases by detective
     * 
     * @return int solvedCases
     */
    public int getSolvedCases() {
        return solvedCases;
    }

    /**
     * get the list of active cases for a detective
     * 
     * @return activeCaseList
     */
    public List<Crime> getCaseNumbers() {
        return this.caseNumbers;
    }

    // setter section
    /**
     * setter for number of active cases for a detective
     * 
     * @param int activeCases
     */
    public void setActiveCases(int activeCases) {
        this.activeCases = activeCases;
    }

    /**
     * setter for number of solved cases by a detective
     * 
     * @param solvedCases
     */
    public void setSolvedCases(int solvedCases) {
        this.solvedCases = solvedCases;
    }

    /**
     * 
     * 
     * @param activeCaseList
     */
    public void addCase(Crime activeCase) {
        this.activeCasesList.add(activeCase);
    }
}
