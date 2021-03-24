
import java.util.ArrayList;
import java.util.List;
public class Evidences {
    private static Evidences evidences = null;
    private static ArrayList<Evidence> evidenceList = new ArrayList<>();

    private Evidences() {
        evidenceList = DataLoader.loadEvidences();
    }

    public static Evidences getInstance() {
        if (evidences == null) {
            evidences = new Evidences();
        }
        return evidences;
    }

    public ArrayList<Evidence> getEvidences() {
        return evidenceList;
    }

    public void addEvidence(String type, String description, int amount) {
        evidenceList.add(new Evidence(type, description, amount));
        DataWriter.saveEvidences();
    }
}



