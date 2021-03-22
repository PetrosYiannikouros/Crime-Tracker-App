/**
 * Victims class
 * used for data processing
 */
import java.util.ArrayList;
import java.util.List;
public class Victims {
    private static Victims victims = null;
    private static ArrayList<Victim> victimList = new ArrayList<Victim>();

    private Victims() {
        victimList = DataLoader.loadVictims();
    }

    public static Victims getInstance() {
        if (victims == null) {
            victims = new Victims();
        }
        return victims;
    }

    public ArrayList<Victim> getVictims() {
        return victimList;
    }

    public void addVictim(String firstName, String lastName, String phoneNumber,
        List<String> familyMembers, String criminalDesc) {
        victimList.add(new Victim(firstName, lastName, phoneNumber, 
        familyMembers, criminalDesc));
        DataWriter.saveVictims();
    }
}