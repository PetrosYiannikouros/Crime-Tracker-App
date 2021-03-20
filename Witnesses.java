import java.util.ArrayList;

public class Witnesses {
    private static Witnesses witnesses;
    private ArrayList<Witness> witnessList;

    private Witnesses() {
        witnessList = DataLoader.getUsers();
    }

    public static Witnesses getInstance() {
        if(witnesses == null) {
            witnesses = new Witnesses();
        }

        return witnesses;
    }

    public boolean haveWitness(String user) {
        for(Witness witness : witnessList) {
            if(witness.getFirstName.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public Witness getWitness(String user) {
        for(Witness witness : witnessList) {
            if(witness.getFirstName().equals(user)) {
                return witness;
            }
        }
        return null;
    }

    public ArrayList<Witness> getWitness() {
        return witnessList;
    }

    public boolean addWitness(String firstName, String lastName, String phoneNumber, 
                        List<Integer> caseNums, boolean proof, String story, String location, 
                        SimpleDateFormat timeOfEvent) {
        if(haveWitness(firstName))return false;

        witnessList.add(new Witness(firstName, lastName, phoneNumber, caseNums, proof, story, location, timeOfEvent));
        return true;
    }

    public void saveWitnesses() {
        DataWriter.saveWitnesses();
    }


}
