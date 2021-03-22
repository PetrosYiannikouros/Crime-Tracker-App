import java.util.ArrayList;
import java.util.List;
public class Administrators {
    private static Administrators administrators = null;
    private static ArrayList<Administrator> administratorList = new ArrayList<>();

    private Administrators() {
        administratorList = DataLoader.loadAdministrators();
    }

    public static Administrator getInstance() {
        if (administrators == null) {
            administrators = new Administrators();
        }
        return administrators;
    }

    public ArrayList<Administrator> getAdministrators() {
        return administratorList;
    }

    public void addAdministrator(String firstName, String lastName, String userName, String password, String precint, String department, String phoneNumber, String email) {
        administratorList.add(new Administrator(firstName, lastName, userName, password, precint, department, phoneNumber, email));
        DataWriter.saveAdministrators();
    }
}




    


