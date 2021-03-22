import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Crimes {
    private static Crimes crimes = null;
    private static ArrayList<Crime> crimeList = new ArrayList<>();

    private Crimes() {
        crimeList = DataLoader.loadCrimes();
    }

    public static Crimes getInstance() {
        if (crimes == null) {
            crimes = new Crimes();
        }
        return crimes;
    }

    public ArrayList<Crime> getCrimes() {
        return crimeList;
    }

    public void addCrime(int caseNumber, TypesOfCrimes type, String description,
    SimpleDateFormat date, String address,
    Officer assigned) {
        crimeList.add(new Crime(caseNumber, type, description, date, address, assigned));
        DataWriter.saveCrimes();
    }
}
