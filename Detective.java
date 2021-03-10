/**
 * class for Detective
 * extention of Officer
 */
import java.util.List;
public class Detective extends Officer{
    private int activeCases;
    private int solvedCases;
    private boolean activeCase;
    private List<Crime> activeCaseList;

    /**
     * Default Constructor
     */
    public Detective() {
         
    }

    //getter section
    /**
     * Getter for active cases
     * @return int activeCases
     */
    public int getActiveCases() {
        return activeCases;
    }
    /**
     * get number of solved cases by detective
     * @return int solvedCases
     */
    public int getSolvedCases() {
        return solvedCases;
    }
    /**
     * get status of whether a detective has an active case
     * @return boolean activeCase
     */
    public boolean isActiveCase() {
        return activeCase;
    }
    /**
     * get the list of active cases for a detective
     * @return activeCaseList
     */
    public List<Crime> getActiveCaseList() {
        return activeCaseList;
    }

    //setter section
    /**
     * setter for number of active cases for a detective
     * @param int activeCases
     */
    public void setActiveCases(int activeCases) {
        this.activeCases = activeCases;
    }
    /**
     * setter for number of solved cases by a detective
     * @param solvedCases
     */
    public void setSolvedCases(int solvedCases) {
        this.solvedCases = solvedCases;
    }
    /**
     * setter for active case status 
     * @param boolean activeCase
     */
    public void setActiveCase(boolean activeCase) {
        this.activeCase = activeCase;
    }
    /**
     * this isnt right
     * we are going to need an append
     * @param activeCaseList
     */
    public void setActiveCaseList(List<Crime> activeCaseList) {
        this.activeCaseList = activeCaseList;
    }
}
