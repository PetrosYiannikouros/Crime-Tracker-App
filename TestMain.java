import java.util.ArrayList;
import java.util.UUID;

public class TestMain {
        public static void main(String[] args) {
                // ArrayList<Criminal> results = Criminals.search("", 30, "black", "6'2\"");
                // for (Criminal criminal : results) {
                // System.out.println(criminal.getId());
                // }

                // Crime crime = Crimes.search(139);
                // for (Evidence evidence : crime.getEvidence())
                // System.out.println(evidence.getDescription());

                // ArrayList<Crime> crimes = Crimes.getInstance().getCrimes();
                // for (Crime crime : crimes)
                // System.out.println(crime.getDate());

                Detectives test = Detectives.getInstance();
                test.getDetectives();
                // Crimes crimes = Crimes.getInstance();
                // crimes.addCrime(100, TypesOfCrimes.INCHOATE, "Theft of X Gaming Console and
                // 20 games", "03-03-2021 19:00",
                // "1725 Harbinson Blvd", "edf66144-0dcb-40d1-b4f2-6cc1d60b1bc6");
                // Crime crime = Crimes.search(100);
                // crime.addSuspect(new Suspect("", "", "", "", 18, 150, "5'9\"", "White",
                // "Male", 10, "Brown", "Shoulder length",
                // "", "Gray hoodie", false, false, "", ""));
                // crime.addVictim(new Victim("Henry", "Clemont", "803-898-7766", "123 Gervais
                // St., Columbia SC, 29210",
                // "Was at the front of the store when the suspect conducted his crime. He said
                // that the man came in with the gun, and Henry hid behind the cash register. He
                // saw him leaving in a blue mini-van.",
                // ""));
        }
}
