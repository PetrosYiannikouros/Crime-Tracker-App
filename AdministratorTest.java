import java.util.List;
import java.util.UUID;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
public class AdministratorTest {
    

    @Test
    public void userCreationTest() {
        UUID id = UUID.randomUUID();
        String firstName = "Landon";
        String lastName = "Dowd";
        String username = "LandonDaBest";
        String password = "198";
        String precinct = "Columiba";
        String department = "Police";

        Administrator admin = new Administrator(firstName, lastName, userName, password,
         precint, department, phoneNumber, email)
        
        assertEquals(id, user.getId());
        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(username, user.getUserName());
        assertEquals(password, user.getPassword());
        assertEquals(precinct, user.getPrecinct());
        assertEquals(department, user.getDepartment());
}
