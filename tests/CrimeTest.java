package tests;
import java.util.ArrayList;

public class CrimeTest {
    private Crime crime = Crime.getInstance();
    private ArrayList<Crime> crimeList = crime.getCrime();

    public void setup() {
        crimeList.clear();
        crimeList.add(new Crime());
        crimeList.add(new Crime());
        DataWriter.saveCrimes();
    }
}