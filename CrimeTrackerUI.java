import java.util.Date;
import java.util.List;

public class CrimeTrackerUI {
    public static void main(String[] args) {
        System.out.println("Compiled!");
    }

    public static void promptForUsernameAndPassword() {
    }

    public static void addCrime() {
    }

    public static void promtForPerson() {
    }

    private static void displayCrime(Crime crime) {
        System.out.println("Case number: " + crime.getCaseNumber());
        System.out.println("Type: " + crime.getType());
        System.out.println("Description: " + crime.getDescription());
        String date = crime.getDate().format(new Date());
        System.out.println("Date occurred: " + date);
        System.out.println("Location occurred: " + crime.getAddress());
        System.out.println("Officer assigned: " + crime.getAssigned());
        System.out.println("Person(s) of Interest:");
        List<Person> personsOfInterest = crime.getPersonsOfInterest();
        if (personsOfInterest.isEmpty())
            System.out.println("None");
        else
            for (Person personOfInterest : personsOfInterest)
                System.out.println("Details from display or toString of class");
        System.out.println("Witness(es):");
        List<Person> witnesses = crime.getWitnesses();
        if (witnesses.isEmpty())
            System.out.println("None");
        else
            for (Person witness : witnesses)
                System.out.println("Details from display or toString of class");
        System.out.println("Victim(s):");
        List<Person> victims = crime.getVictims();
        if (victims.isEmpty())
            System.out.println("None");
        else
            for (Person victim : victims)
                System.out.println("Details from display or toString of class");
        System.out.println("Evidence:");
        List<Evidence> evidenceList = crime.getEvidenceList();
        if (witnesses.isEmpty())
            System.out.println("None");
        else
            for (Evidence evidence : evidenceList)
                System.out.println("Details from display or toString of class");
        String answer = crime.getIsSolved() ? "Yes" : "No";
        System.out.println("Is case solved? " + answer);
    }
}