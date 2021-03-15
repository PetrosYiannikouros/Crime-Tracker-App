import java.util.List;

/**
 * Person class
 * used for creating people
 * going to be an extension to many
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private boolean deceased;
    protected List<Integer> caseNums;

    /**
     * default constructor for person
     */
    protected Person() 
    {

    }
    protected Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        //default is not deceased
        this.deceased = false;
        
    }

    //getter section
    /**
     * get First Name
     * @return String firstName
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * get Last Name
     * @return String lastName
     */
    public String getLastName() {
        return this.lastName;
    }
    /**
     * is Deceased boolean
     * @return deceased status 
     * true = dead
     * false = alive
     */
    public boolean isDeceased() {
        return this.deceased;
    }

    public List<Integer> getCases () {
        return caseNums;
    }

    //setter section
    /**
     * set First Name
     * @param String firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * set Last Name
     * @param String lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * set deceased status
     * @param boolean deceased
     */
    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }
    

    public void addCase(Integer caseNum){
            caseNums.add(caseNum);
    }
    /**
     * toString for person
     */
    public String toString() {
        return "";
    }
}
