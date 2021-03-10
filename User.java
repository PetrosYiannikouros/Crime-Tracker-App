/**
 * User class
 * serves as a base for all
 * types of users for this app
 * collects user info
 */
import java.util.List;
public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String precint;
    private String department;
    private List<Crime> crimeList;

    public User() {

    }
    //getter section
    /**
     * first name getter
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * last name getter
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * user name getter
     * @return user name
     */
    public String getUserName() {
        return userName;
    }
    /**
     * password getter
     * @return password
     */
    public String getPassword() {
        return password;
    }
    /**
     * precint getter
     * @return precint
     */
    public String getPrecint() {
        return precint;
    }
    /**
     * department getter
     * @return department
     */
    public String getDepartment() {
        return department;
    }
    /**
     * crime list getter
     * @return crime list
     */
    public List<Crime> getCrimeList() {
        return crimeList;
    }

    //setter section
    /**
     * first name setter
     * @param String firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * last name setter 
     * @param String lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * username setter
     * @param String userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * password setter
     * @param String password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * precitn setter
     * @param String precint
     */
    public void setPrecint(String precint) {
        this.precint = precint;
    }
    /**
     * department setter
     * @param String department
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    /**
     * Crime list setter
     * not sure if this is needed
     * @param crimeList
     */
    public void setCrimeList(List<Crime> crimeList) {
        this.crimeList = crimeList;
    }

    //this is going to have to be changed to append to list
    //but fine for now
    public String append() {
        return null;
    }

    /**
     * void method for viewing stuff
     */
    private void view() {

    }

    /**
     * void method for removing edits
     */
    private void removeEdit(){
        
    }
}
