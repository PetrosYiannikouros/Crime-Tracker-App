import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*;
public class DataLoader extends DataConstants{

    /**
     * 
     * @return
     */
    public static ArrayList<Officer> loadOfficers() {
        ArrayList<Officer> officers = new ArrayList<Officer>();

        try {
            FileReader reader = new FileReader(OFFICER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray officersJSON = (JSONArray)new JSONParser().parse(reader);

            for (int i = 0; i < officersJSON.size(); ++i) {
                JSONObject officerJSON = (JSONObject)officersJSON.get(i);
                String firstName = (String)officerJSON.get(OFFICER_FIRST_NAME);
                String lastName = (String)officerJSON.get(OFFICER_LAST_NAME);
                String userName = (String)officerJSON.get(OFFICER_USERNAME);
                String password = (String)officerJSON.get(OFFICER_PASSWORD);
                String precint = (String)officerJSON.get(OFFICER_PRECINT);
                String department = (String)officerJSON.get(OFFICER_DEPARTMENT);
                int yearsServed = (Integer)officerJSON.get(OFFICER_YEARS_SERVED);
                String rank = (String)officerJSON.get(OFFICER_RANK);
                String badgeNumber = (String)officerJSON.get(OFFICER_BADGE_NUMBER);
                officers.add(new Officer(firstName, lastName, userName, password,
                precint, department, yearsServed, rank, badgeNumber));
            }
            return officers;
        }   catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
