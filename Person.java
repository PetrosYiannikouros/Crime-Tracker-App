/**
 * Person class
 * used for creating people
 * going to be an extension to many
 */
public class Person {
    private String firstName;
    private String lastName;
    private boolean deceased;

    /**
     * default constructor for person
     */
    public Person() 
    {

    }
    public Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deceased = false;
    }

    //getter section
    /**
     * get First Name
     * @return String firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * get Last Name
     * @return String lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * is Deceased boolean
     * @return deceased status 
     * true = dead
     * false = alive
     */
    public boolean isDeceased() {
        return deceased;
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
    
    /**
     * toString for person
     */
    public String toString() {
        return null;
    }
}
