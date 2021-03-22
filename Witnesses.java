import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.List;
public class Witnesses {
    private static Witnesses witnesses = null;
    private static ArrayList<Witness> witnessList = new ArrayList<Witness>();

    private Witnesses() {
        witnessList = DataLoader.loadWitnesses();
    }

    public static Witnesses getInstance() {
        if (witnesses == null) {
            witnesses = new Witnesses();
        }
        return witnesses;
    }

    public ArrayList<Witness> getWitnesses() {
        return witnessList;
    }

    public void addWitness(String firstName, String lastName, String phoneNumber, List<Integer> caseNums, 
    boolean proof, String story, String location, SimpleDateFormat timeOfEvent) {
        witnessList.add(new Witness(firstName, lastName, phoneNumber, caseNums,
        proof, story, location, timeOfEvent));
        DataWriter.saveWitnesses();
    }
}