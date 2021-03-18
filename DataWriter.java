import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    public static void saveOfficers() {
        Officers officers = Officers.getInstance();
        ArrayList<Officer> officerList = officers.getOfficers();
        JSONArray jsonOfficers = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < officerList.size(); i++) {
            jsonOfficers.add(getUserJSON(officerList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(OFFICER_FILE_NAME)) {

            file.write(jsonOfficers.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getUserJSON(Officer officer) {
        JSONObject officerDetails = new JSONObject();
        officerDetails.put(OFFICER_FIRST_NAME, officer.getFirstName());
        officerDetails.put(OFFICER_LAST_NAME, officer.getLastName());
        officerDetails.put(OFFICER_USERNAME, officer.getUserName());
        officerDetails.put(OFFICER_PASSWORD, officer.getPassword());
        officerDetails.put(OFFICER_PRECINCT, officer.getPrecint());
        officerDetails.put(OFFICER_DEPARTMENT, officer.getDepartment());
        officerDetails.put(OFFICER_YEARS_SERVED, officer.getYearsServed());
        officerDetails.put(OFFICER_RANK, officer.getRank());
        officerDetails.put(OFFICER_BADGE_NUMBER, officer.getBadgeNumber());

        return officerDetails;
    }
}
