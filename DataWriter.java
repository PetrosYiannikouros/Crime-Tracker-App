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
            jsonOfficers.add(getOfficerJSON(officerList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(OFFICER_FILE_NAME)) {

            file.write(jsonOfficers.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getOfficerJSON(Officer officer) {
        JSONObject officerDetails = new JSONObject();
        officerDetails.put(OFFICER_ID, officer.getId().toString());
        officerDetails.put(OFFICER_FIRST_NAME, officer.getFirstName());
        officerDetails.put(OFFICER_LAST_NAME, officer.getLastName());
        officerDetails.put(OFFICER_USERNAME, officer.getUserName());
        officerDetails.put(OFFICER_PASSWORD, officer.getPassword());
        officerDetails.put(OFFICER_PRECINCT, officer.getPrecinct());
        officerDetails.put(OFFICER_DEPARTMENT, officer.getDepartment());
        officerDetails.put(OFFICER_YEARS_SERVED, officer.getYearsServed());
        officerDetails.put(OFFICER_RANK, officer.getRank());
        officerDetails.put(OFFICER_BADGE_NUMBER, officer.getBadgeNumber());

        return officerDetails;
    }

    public static void saveDetectives() {
        Detectives detectives = Detectives.getInstance();
        ArrayList<Detective> detectiveList = detectives.getDetectives();
        JSONArray jsonDetectives = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < detectiveList.size(); i++) {
            jsonDetectives.add(getDetectiveJSON(detectiveList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(DETECTIVE_FILE_NAME)) {

            file.write(jsonDetectives.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getDetectiveJSON(Detective detective) {
        JSONObject detectiveDetails = new JSONObject();
        detectiveDetails.put(DETECTIVE_ID, detective.getId().toString());
        detectiveDetails.put(DETECTIVE_FIRST_NAME, detective.getFirstName());
        detectiveDetails.put(DETECTIVE_LAST_NAME, detective.getLastName());
        detectiveDetails.put(DETECTIVE_USERNAME, detective.getUserName());
        detectiveDetails.put(DETECTIVE_PASSWORD, detective.getPassword());
        detectiveDetails.put(DETECTIVE_PRECINCT, detective.getPrecinct());
        detectiveDetails.put(DETECTIVE_DEPARTMENT, detective.getDepartment());
        detectiveDetails.put(DETECTIVE_YEARS_SERVED, detective.getYearsServed());
        detectiveDetails.put(DETECTIVE_RANK, detective.getRank());
        detectiveDetails.put(DETECTIVE_BADGE_NUMBER, detective.getBadgeNumber());
        detectiveDetails.put(DETECTIVE_ACTIVE_CASES, detective.getActiveCases());
        detectiveDetails.put(DETECTIVE_SOLVED_CASES, detective.getSolvedCases());
        detectiveDetails.put(DETECTIVE_ACTIVE_CASES_LIST, detective.getActiveCaseList());

        return detectiveDetails;
    }

    public static void saveCriminals() {
        Criminals criminals = Criminals.getInstance();
        ArrayList<Criminal> criminalList = criminals.getCriminals();
        JSONArray jsonCriminals = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < criminalList.size(); i++) {
            jsonCriminals.add(getCriminalJSON(criminalList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(CRIMINAL_FILE_NAME)) {

            file.write(jsonCriminals.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getCriminalJSON(Criminal criminal) {
        JSONObject criminalDetails = new JSONObject();
        criminalDetails.put(CRIMINAL_ID, criminal.getId().toString());
        criminalDetails.put(CRIMINAL_FIRST_NAME, criminal.getFirstName());
        criminalDetails.put(CRIMINAL_LAST_NAME, criminal.getLastName());
        criminalDetails.put(CRIMINAL_DECEASED, criminal.getIsDeceased());
        criminalDetails.put(CRIMINAL_PHONE_NUMBER, criminal.getPhoneNumber());
        criminalDetails.put(CRIMINAL_CASE_NUMS, criminal.getCases());
        criminalDetails.put(CRIMINAL_NICK_NAME, criminal.getNickName());
        criminalDetails.put(CRIMINAL_AGE, criminal.getAge());
        criminalDetails.put(CRIMINAL_WEIGHT, criminal.getWeight());
        criminalDetails.put(CRIMINAL_HEIGHT, criminal.getHeight());
        criminalDetails.put(CRIMINAL_RACE, criminal.getRace());
        criminalDetails.put(CRIMINAL_SHOE_SIZE, criminal.getShoeSize());
        criminalDetails.put(CRIMINAL_NATURAL_HAIR_COLOR, criminal.getNaturalHairColor());
        criminalDetails.put(CRIMINAL_HAIR_LENGTH, criminal.getHairLength());
        criminalDetails.put(CRIMINAL_FACIAL_HAIR_DESCRIPTION, criminal.getFacialHairDesc());
        criminalDetails.put(CRIMINAL_CLOTHES_DESCRIPTION, criminal.getClothesDesc());
        criminalDetails.put(CRIMINAL_TATTOOED, criminal.isTattooed());
        criminalDetails.put(CRIMINAL_TATTOO_LIST, criminal.getTattoos());
        criminalDetails.put(CRIMINAL_HAS_CAR, criminal.hasCar());
        criminalDetails.put(CRIMINAL_CAR_DESCRIPTION, criminal.getCarDesc());
        criminalDetails.put(CRIMINAL_LICENSE_PLATE_NUM, criminal.getLicense());
        criminalDetails.put(CRIMINAL_IN_JAIL, criminal.isInJail());
        criminalDetails.put(CRIMINAL_CONVICTIONS, criminal.getConvictions());

        return criminalDetails;
    }
}
