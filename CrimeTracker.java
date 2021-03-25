/**
 * 
 */
import java.util.ArrayList;
public class CrimeTracker {
	private Users users;
    private User user;

    /**
     * logging into account boolean
     * @param userName
     * @param password
     * @return true or false
     */
    public boolean loginAccount(String userName, String password) {
        users = Users.getInstance();
        ArrayList<User> userList = users.getUsers();
        for(int i =0; i < users.getUsers().size(); ++i){
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
}

