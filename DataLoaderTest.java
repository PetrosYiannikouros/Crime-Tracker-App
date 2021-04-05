import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLoaderTest {
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
        officerList.clear();
        detectiveList.clear();
        suspectList.clear();
        criminalList.clear();
        victimList.clear();
        witnessList.clear();
        crimeList.clear();
        evidenceList.clear();
        officerList.add(new Officer("Sam", "Smith", "sammy", "boy1234!", "North Columbia", "State Troopers", 5,
                "Corporal", "4810"));
        officerList.add(new Officer("Keenan", "Stone", "kstone", "mountian56", "West Columbia", "City Police", 3,
                "Deputy", "6918"));
        detectiveList.add(new Detective("John", "Johnson", "JJshepherd", "csce146", "Downtown Columbia",
                "County Sherriffs", 15, "Sergeant", "6823", 0, 0));
        detectiveList.add(new Detective("Chris", "Farley", "kungfu", "fighting", "Uptown Columbia", "DEA", 13, "Chief",
                "8401", 0, 0));
        suspectList.add(new Suspect("Joey", "Pearson", "555-555-3983", "4016 Pooh Bear Lane", "Smokey", 25, 200,
                "6'1\"", "White", "Male", "Blue", 11.0, "Blonde", "Short", "Clean", "Baggy", true, true,
                "2004 Honda Civic", "LV9-Z4D"));
        suspectList.add(new Suspect("Vincent", "Howard", "555-717-4475", "465 Camden Place", nickName, age, weight,
                height, race, gender, eyeColor, shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc,
                tattoed, hasCar, carDescription, licensePlate));
        criminalList.add(new Criminal(firstName, lastName, phoneNumber, address, nickName, age, weight, height, race,
                gender, eyeColor, shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, hasCar,
                carDescription, licensePlate, inJail));
        criminalList.add(new Criminal(firstName, lastName, phoneNumber, address, nickName, age, weight, height, race,
                gender, eyeColor, shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc, tattoed, hasCar,
                carDescription, licensePlate, inJail));
        victimList.add(new Victim(firstName, lastName, phoneNumber, address, story, criminalDesc));
        victimList.add(new Victim(firstName, lastName, phoneNumber, address, story, criminalDesc));
        witnessList.add(new Witness(firstName, lastName, phoneNumber, address, proof, story));
        witnessList.add(new Witness(firstName, lastName, phoneNumber, address, proof, story));
        crimeList.add(new Crime(caseNumber, type, description, date, address, assignedId));
        crimeList.add(new Crime(caseNumber, type, description, date, address, assignedId));
        evidenceList.add(new Evidence(type, description, amount));
        evidenceList.add(new Evidence(type, description, amount));
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
        Users.getInstance().getUsers().clear();
        DataWriter.saveUsers();
    }

    @Test
    void testGetUsersSize() {
        userList = DataLoader.getUsers();
        assertEquals(2, userList.size());
    }

    @Test
    void testGetUsersSizeZero() {
        Users.getInstance().getUsers().clear();
        DataWriter.saveUsers();
        assertEquals(0, userList.size());
    }

    @Test
    void testGetUserFirstUserName() {
        userList = DataLoader.getUsers();
        assertEquals("asmith", userList.get(0).getUserName());
    }
}