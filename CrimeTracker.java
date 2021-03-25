/**
 * 
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
public class CrimeTracker {
	private Users users;
    private User user;

    private Administrators admins;
    private Administrator admin;

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
    public boolean loginAccount(String userName, String password) {
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
    public boolean existingUserName(String userName) {
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
    public boolean existingEmail(String email) {
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
    public boolean validEmail(String email) {
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
}

