import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataWriterTest {
    private Officers officers = Officers.getInstance();
    private ArrayList<Officer> officerList = officers.getOfficers();
    private Detectives detectives = Detectives.getInstance();
    private ArrayList<Detective> detectiveList = detectives.getDetectives();
    private Suspects suspects = Suspects.getInstance();
    private ArrayList<Suspect> suspectList = suspects.getSuspects();
    private Criminals criminals = Criminals.getInstance();
    private ArrayList<Criminal> criminalList = criminals.getCriminals();
    private Victims victims = Victims.getInstance();
    private ArrayList<Victim> victimList = victims.getVictims();
    private Witnesses witnesses = Witnesses.getInstance();
    private ArrayList<Witness> witnessList = witnesses.getWitnesses();
    private Crimes crimes = Crimes.getInstance();
    private ArrayList<Crime> crimeList = crimes.getCrimes();
    private Evidences evidences = Evidences.getInstance();
    private ArrayList<Evidence> evidenceList = evidences.getEvidences();

    @BeforeEach
    public void setup() {
        Officers.getInstance().getOfficers().clear();
        Detectives.getInstance().getDetectives().clear();
        Suspects.getInstance().getSuspects().clear();
        Criminals.getInstance().getCriminals().clear();
        Victims.getInstance().getVictims().clear();
        Witnesses.getInstance().getWitnesses().clear();
        Crimes.getInstance().getCrimes().clear();
        Evidences.getInstance().getEvidences().clear();
        DataWriter.saveOfficers();
        DataWriter.saveDetectives();
        DataWriter.saveSuspects();
        DataWriter.saveCriminals();
        DataWriter.saveVictims();
        DataWriter.saveWitnesses();
        DataWriter.saveCrimes();
        DataWriter.saveEvidences();
    }

    @AfterEach
    public void tearDown() {
        Officers.getInstance().getOfficers().clear();
        Detectives.getInstance().getDetectives().clear();
        Suspects.getInstance().getSuspects().clear();
        Criminals.getInstance().getCriminals().clear();
        Victims.getInstance().getVictims().clear();
        Witnesses.getInstance().getWitnesses().clear();
        Crimes.getInstance().getCrimes().clear();
        Evidences.getInstance().getEvidences().clear();
        DataWriter.saveOfficers();
        DataWriter.saveDetectives();
        DataWriter.saveSuspects();
        DataWriter.saveCriminals();
        DataWriter.saveVictims();
        DataWriter.saveWitnesses();
        DataWriter.saveCrimes();
        DataWriter.saveEvidences();
    }

    // Officer Test
    @Test
    void testWritingZeroOfficers() {
        officerList = DataLoader.loadOfficers();
        assertEquals(0, officerList.size());
    }

    @Test
    void testWritingOneOfficer() {
        officerList.add(new Officer("Sam", "Smith", "sammy", "boy1234!", "North Columbia", "State Troopers", 5,
        "Corporal", "4810"));
        DataWriter.saveOfficers();
        assertEquals("sammy", DataLoader.loadOfficers().get(0).getUserName();
    }

    @Test
    void testWritingFiveOfficers() {
        officerList.add(new Officer("Sam", "Smith", "sammy", "boy1234!", "North Columbia", "State Troopers", 5,
                "Corporal", "4810"));
        officerList.add(new Officer("Sam", "Smith", "sammy1", "boy1234!", "North Columbia", "State Troopers", 5,
                "Corporal", "4810"));
        officerList.add(new Officer("Sam", "Smith", "sammy2", "boy1234!", "North Columbia", "State Troopers", 5,
                "Corporal", "4810"));
        officerList.add(new Officer("Sam", "Smith", "sammy3", "boy1234!", "North Columbia", "State Troopers", 5,
                "Corporal", "4810"));
        officerList.add(new Officer("Sam", "Smith", "sammy4", "boy1234!", "North Columbia", "State Troopers", 5,
                "Corporal", "4810"));
        DataWriter.saveUsers();
        assertEquals("sammy4", DataLoader.loadOfficers().get(4).getUserName());
    }

    @Test
    void testWritingEmptyOfficer() {
        officerList.add(new Officer("", "", "", "!", "", "", 0, "", ""));
        DataWriter.saveUsers();
        assertEquals("", DataLoader.loadOfficers().get(0).getUserName());
    }

    @Test
    void testWritingNullOfficer() {
        officerList.add(new Officer("", "", null, "!", "", "", 0, "", ""));
        DataWriter.saveUsers();
        assertEquals(null, DataLoader.loadOfficers().get(0).getUserName());
    }

    // Detective Test
    @Test
    void testWritingZeroDetectives() {
        detectiveList = DataLoader.loadDetectives();
        assertEquals(0, detectiveList.size());
    }

    @Test
    void testWritingOneDetective() {
        detectiveList.add(new User("asmith", "Amy", "Smith", 19, "803-454-3344"));
        DataWriter.saveUsers();
        assertEquals("asmith", DataLoader.getUsers().get(0).getUserName());
    }

    @Test
    void testWritingTwoDetectives() {
        userList.add(new User("asmith", "Amy", "Smith", 19, "803-454-3344"));
        userList.add(new User("bsmith", "Amy", "Smith", 19, "803-454-3344"));
        userList.add(new User("csmith", "Amy", "Smith", 19, "803-454-3344"));
        userList.add(new User("dsmith", "Amy", "Smith", 19, "803-454-3344"));
        userList.add(new User("esmith", "Amy", "Smith", 19, "803-454-3344"));
        DataWriter.saveUsers();
        assertEquals("esmith", DataLoader.getUsers().get(4).getUserName());
    }

    @Test
    void testWritingEmptyDetective() {
        userList.add(new User("", "", "", 0, ""));
        DataWriter.saveUsers();
        assertEquals("", DataLoader.getUsers().get(0).getUserName());
    }

    @Test
    void testWritingNullDetective() {
        userList.add(new User(null, "", "", 0, ""));
        DataWriter.saveUsers();
        assertEquals(null, DataLoader.getUsers().get(0).getUserName());
    }
}