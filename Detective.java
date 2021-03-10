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
}
