import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrimeTrackerTest {
    private CrimeTracker crimeTracker = new CrimeTracker();
    private Detectives detectives = Detectives.getInstance();
    private ArrayList<Detective> detectiveList = detectives.getDetectives();
    private Officers officers = Officers.getInstance();
    private ArrayList<Officer> officerList = officers.getOfficers();

    @BeforeEach
    public void setup() {
    }

    @AfterEach
    public void tearDown() {
    }

    // Detective Test
    @Test
    public void testLoginExistingAccountDetective() {
        String userName = "shortstalky";
        String password = "baldman12";
        boolean isLoggedIn = CrimeTracker.loginAccountDetective(userName, password);
        assertTrue(isLoggedIn);
    }

    @Test
    public void testLoginInvalidAccountDetective() {
        String userName = "";
        String password = "";
        boolean isLoggedIn = CrimeTracker.loginAccountDetective(userName, password);
        assertFalse(isLoggedIn);
    }

    // Officer Test
    @Test
    public void testLoginExistingAccountOfficer() {
        String userName = "WopRe";
        String password = "offy246";
        boolean isLoggedIn = CrimeTracker.loginAccountOfficer(userName, password);
        assertTrue(isLoggedIn);
    }

    @Test
    public void testLoginInvalidAccountOfficer() {
        String userName = "";
        String password = "";
        boolean isLoggedIn = CrimeTracker.loginAccountOfficer(userName, password);
        assertFalse(isLoggedIn);
    }
}