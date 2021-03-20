import java.util.ArrayList;

public class Suspects {
    private static Suspects suspects;
    private ArrayList<Suspect> suspectList;

    private Suspects() {
        suspectList = DataLoader.getUsers();
    }

    public static Suspects getInstance() {
        if(suspects == null) {
            suspects = new Suspects();
        }

        return suspects;
    }

    public boolean haveSuspect(String user) {
        for(Suspect suspect : suspectList) {
            if(suspect.getFirstName.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public Suspect getSuspect(String user) {
        for(Suspect suspect : suspectList) {
            if(suspect.getFirstName().equals(user)) {
                return suspect;
            }
        }
        return null;
    }

    public ArrayList<Suspect> getSuspect() {
        return suspectList;
    }

    public boolean addSuspect(String firstName, String lastName, String phoneNumber, int id, String nickName, int age, int weight,
                        String height, String race, String naturalHairColor, String hairLength, String facialHairDesc,
                        String clothesDesc, boolean hasCar, String carSpecs, String licensePlate, boolean inJail, double shoeSize) {
        if(haveSuspect(firstName))return false;

        suspectList.add(new Suspect(firstName, lastName, phoneNumber, id, nickName, age, weight, height, 
        race, naturalHairColor, hairLength, facialHairDesc, clothesDesc, hasCar, carSpecs, licensePlate, inJail, shoeSize));
        return true;
    }

    public void saveSuspects() {
        DataWriter.saveSuspects();
    }
}
