import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.UUID;
public class CrimeTracker {
	private static Users users;
    private static User user;

    private static Administrators admins;
    private static Administrator admin;

    private static Crimes crimes;
    private static Crime crime;

    private static Officers officers;
    private static Officer officer;

    private static Detectives detectives;
    private static Detective detective;

    /**
     * logging into account boolean
     * tests to see if username is found
     * then if passeword matches password associated with username
     * @param userName
     * @param password
     * @return true if username and password were valid
     * false if there was a trouble not finding username/ 
     * if password didn't match
     */
    public static boolean loginAccount(String userName, String password) {
        users = Users.getInstance();
        ArrayList<User> userList = users.getUsers();
        for(int i =0; i < userList.size(); ++i){
            user = userList.get(i);
            if(user.getUserName().equals(userName)) {
                if(user.getPassword().equals(password)){
                    System.out.println("Logging you in...");
                    return true;
                }
                else {
                    System.out.println("Invalid password for username: " +
                    userName);
                    return false;
                }
            }
        }
        System.out.println("Username not found");
        return false;
    }

    /**
     * checks to see if userName already exists amongst users
     * @param userName
     * @return true if username wasnt found in database
     * false, if username already exists amongst users
     */
    public static boolean existingUserName(String userName) {
        users = Users.getInstance();
        ArrayList<User> userList = users.getUsers();
        for(int i =0; i < users.getUsers().size(); ++i) {
            user = userList.get(i);
            if (user.getUserName().equals(userName)) {
                System.out.println("User Name is taken...");
                return false;
            }
        }
        return true;
    }

    /**
     * checks to see if email already exists amongst users
     * @param email
     * @return true if email not found
     * false, if email already exists amongst users
     */
    public static boolean existingEmail(String email) {
        admins = Administrators.getInstance();
        ArrayList<Administrator> adminList = admins.getAdministrators();
        for(int i =0; i < adminList.size(); ++i) {
            admin = adminList.get(i);
            if (admin.getEmail().equals(email)) {
                System.out.println("Email is taken...");
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * @param email
     * @return status of whether an email is proper syntax or not
     * true if yes
     * false if not
     */
    public static boolean validEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        //return true if valid email
        if(pat.matcher(email).matches()) {
            return pat.matcher(email).matches();
        }
        //else, return false
        else {
            System.out.println("invalid email syntax");
            return false;
        }
    }
    
    /**
     * boolean to check existing phone numbers amongst admins
     * @param phoneNumber
     * @return true if phonenumber isn't already in system
     * false if phoner number is already in account 
     */ 
    public static boolean existingPhoneNumber(String phoneNumber) {
        admins = Administrators.getInstance();
        ArrayList<Administrator> adminList = admins.getAdministrators();
        for(int i =0; i < adminList.size(); ++i) {
            admin = adminList.get(i);
            if (admin.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Phone Number already associated with an account...");
                return false;
            }
        }
        return true;
    }
    
    /**
     * boolean that checks if assigned ID is already registered
     * @param assingedId
     * @return true if id isn't already regisered with crime
     * false if id is already registered to a crime
     */
    public static boolean checkCrimeID(String assingedId) {
        crimes = Crimes.getInstance();
        ArrayList<Crime> crimeList = crimes.getCrimes();
        for(int i = 0; i < crimeList.size(); ++i) {
            crime = crimeList.get(i);
            if(crime.getAssignedId().equals(assingedId)) {
                System.out.println("ID already associated with another Case");
                return false;
            }
        }
        return true;
    }

    /**
     * method that checks to see if officer exists
     * should be used in the process of creating crime
     * with regards to officer first on scene 
     * may have to be switched to id??
     * @param badgeNumber
     * @return true if officer exists, allowing that test to pass
     * false if officer doesn't exist in system, not
     * allowing for the creation of a crime
     */
    public static boolean existingOfficer(String badgeNumber) {
        officers = Officers.getInstance();
        ArrayList<Officer> officerList = officers.getOfficers();
        for(int i = 0; i < officerList.size(); ++i) {
            officer = officerList.get(i);
            if(officer.getBadgeNumber().equals(badgeNumber)) {
                //officer found
                return true;
            }
        }
        System.out.println("Officer not found");
        return false;
    }

    /**
     * method that checks to see if detective exists 
     * should be used in the process of creating crime
     * with regards to detective of the case
     * @param id
     * @return true, if detective exists in system.
     * false, if detevtive doesn't exist inside of system.
     */
    public static boolean existingDetective(String id) {
        detectives = Detectives.getInstance();
        ArrayList<Detective> detectiveList = detectives.getDetectives();
        for(int i = 0; i < detectiveList.size(); ++i) {
            detective = detectiveList.get(i);
            if(detective.getId().equals(UUID.fromString(id))){
                //detective found
                return true;
            }
        }
        System.out.println("Detective not found");
        return false;
    }
}

