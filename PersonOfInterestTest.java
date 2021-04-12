import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonOfInterestTest {
    private PersonOfInterests personOfInterests= PersonOfInterests.getInstance();
    private ArrayList<PersonOfInterest> personOfInterestsList = personOfInterests.getPersonOfInterest();

    @BeforeEach
	public void setup() {
		personOfInterestList.clear();
		// reset, check
        		personOfInterestList.add(new PersonOfInterest());
        		personOfInterestList.add(new PersonOfInterest());
		DataWriter.savePersonOfInterests();
	}
	
	@AfterEach
	public void tearDown() {
		PersonOfInterests.getInstance().getPersonOfInterests().clear();
		DataWriter.savePersonOfInterests();
	}
	
    //Tattoo adding test
	@Test
	void testAddTattoo() {
        String tattoo = "Red Snake";
		boolean isTattooAdded = PersonOfInterest.addTattoo(tattoo);
		assertTrue(isTattooAdded);
	}

    @Test
	void testNoTattooAdded() {
        String tattoo = "";
		boolean isTattooAdded = PersonOfInterest.addTattoo(tattoo);
		assertFalse(isTattooAdded);
	}

}
