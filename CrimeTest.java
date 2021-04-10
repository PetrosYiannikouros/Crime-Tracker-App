//package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrimeTest {
    private Crimes crimes = Crimes.getInstance();
    private ArrayList<Crime> crimeList = crimes.getCrimes();

    @BeforeEach
	public void setup() {
		crimeList.clear();
		crimeList.add(new Crime(673, TypesOfCrimes.PERSONAL, "Robbery at gunpoint", "03-30-2021 02:00 - 02:30",
                "Hillview Street", "none"));
        crimeList.add(new Crime(830, TypesOfCrimes.PROPERTY, "Shoplifting conspiracy", "04-04-2021 11:30 - 12:30",
                "3511 Mill Street", "none"));
		DataWriter.saveCrimes();
	}
	
	@AfterEach
	public void tearDown() {
		Crimes.getInstance().getCrimes().clear();
		DataWriter.saveCrimes();
	}
	
	
	@Test
	void testHaveUserValidFirstItem() {
		Crime crime = crimes.search(673);
		assertTrue(crime);
	}
	
	@Test
	void testHaveUserValidLastItem() {
		boolean hasBob = crimes.search("bwhite");
		assertTrue(hasBob);
	}
	
	@Test
	void testHaveUserInValid() {
		boolean hasJoe = crimes.search("jsmith");
		assertFalse(hasJoe);
	}
	
	@Test
	void testHaveUserEmpty() {
		boolean hasEmpty = crimes.search("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveUserNull() {
		boolean hasNull = crimes.search(null);
		assertFalse(hasNull);
	}
}