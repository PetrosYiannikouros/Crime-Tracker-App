import java.util.ArrayList;
import java.util.List;
public class Victims {
    private static Victim victims = null;
    private static ArrayList<Victim> victimList = new ArrayList<>();

    private Victims() {
        victimList = DataLoader.loadVictims();
    }

    public static Victim getInstance() {
        if (victims == null) {
            victims = new Victim();
        }
        return victims;
    }

    public ArrayList<Victim> getVictims() {
        return victimList;
    }

    public void addVictim(String firstName, String lastName, String phoneNumber, List<String> familyMembers, String criminalDesc) {
        victimList.add(new Victim(firstName, lastName, phoneNumber, familyMembers, criminalDesc));
        DataWriter.saveVictims();
    }
}



