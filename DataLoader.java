import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class DataLoader extends DataConstants {

    /**
     * 
     * @return
     */
    public static ArrayList<Officer> loadOfficers() {
        ArrayList<Officer> officers = new ArrayList<Officer>();

        try {
            FileReader reader = new FileReader(OFFICER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray officersJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < officersJSON.size(); ++i) {
                JSONObject officerJSON = (JSONObject) officersJSON.get(i);
                String id = (String) officerJSON.get(OFFICER_ID);
                String firstName = (String) officerJSON.get(OFFICER_FIRST_NAME);
                String lastName = (String) officerJSON.get(OFFICER_LAST_NAME);
                String userName = (String) officerJSON.get(OFFICER_USERNAME);
                String password = (String) officerJSON.get(OFFICER_PASSWORD);
                String precinct = (String) officerJSON.get(OFFICER_PRECINCT);
                String department = (String) officerJSON.get(OFFICER_DEPARTMENT);
                int yearsServed = ((Long) officerJSON.get(OFFICER_YEARS_SERVED)).intValue();
                String rank = (String) officerJSON.get(OFFICER_RANK);
                String badgeNumber = (String) officerJSON.get(OFFICER_BADGE_NUMBER);
                officers.add(new Officer(firstName, lastName, userName, password, precinct, department, yearsServed,
                        rank, badgeNumber));
                System.out.println(OFFICER_ID + ": " + id + "\n" + OFFICER_FIRST_NAME + ": " + firstName + "\n"
                        + OFFICER_LAST_NAME + ": " + lastName + "\n" + OFFICER_USERNAME + ": " + userName + "\n"
                        + OFFICER_PASSWORD + ": " + password + "\n" + OFFICER_PRECINCT + ": " + precinct + "\n"
                        + OFFICER_DEPARTMENT + ": " + department + "\n" + OFFICER_YEARS_SERVED + ": " + yearsServed
                        + "\n" + OFFICER_RANK + ": " + rank + "\n" + OFFICER_BADGE_NUMBER + ": " + badgeNumber + "\n"
                        + "***************************");
            }
            return officers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Detective> loadDetectives() {
        ArrayList<Detective> detectives = new ArrayList<>();

        try {
            FileReader reader = new FileReader(DETECTIVE_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray detectivesJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < detectivesJSON.size(); ++i) {
                JSONObject detectiveJSON = (JSONObject) detectivesJSON.get(i);
                String id = (String) detectiveJSON.get(DETECTIVE_ID);
                String firstName = (String) detectiveJSON.get(DETECTIVE_FIRST_NAME);
                String lastName = (String) detectiveJSON.get(DETECTIVE_LAST_NAME);
                String userName = (String) detectiveJSON.get(DETECTIVE_USERNAME);
                String password = (String) detectiveJSON.get(DETECTIVE_PASSWORD);
                String precinct = (String) detectiveJSON.get(DETECTIVE_PRECINCT);
                String department = (String) detectiveJSON.get(DETECTIVE_DEPARTMENT);
                int yearsServed = ((Long) detectiveJSON.get(DETECTIVE_YEARS_SERVED)).intValue();
                String rank = (String) detectiveJSON.get(DETECTIVE_RANK);
                String badgeNumber = (String) detectiveJSON.get(DETECTIVE_BADGE_NUMBER);
                int activeCases = ((Long) detectiveJSON.get(DETECTIVE_ACTIVE_CASES)).intValue();
                int solvedCases = ((Long) detectiveJSON.get(DETECTIVE_SOLVED_CASES)).intValue();
                ArrayList<Crime> activeCasesList = (ArrayList<Crime>) detectiveJSON.get(DETECTIVE_ACTIVE_CASES_LIST);
                detectives.add(new Detective(firstName, lastName, userName, password, precinct, department, yearsServed,
                        rank, badgeNumber, activeCases, solvedCases));
                System.out.println(DETECTIVE_ID + ": " + id + "\n" + DETECTIVE_FIRST_NAME + ": " + firstName + "\n"
                        + DETECTIVE_LAST_NAME + ": " + lastName + "\n" + DETECTIVE_USERNAME + ": " + userName + "\n"
                        + DETECTIVE_PASSWORD + ": " + password + "\n" + DETECTIVE_PRECINCT + ": " + precinct + "\n"
                        + DETECTIVE_DEPARTMENT + ": " + department + "\n" + DETECTIVE_YEARS_SERVED + ": " + yearsServed
                        + "\n" + DETECTIVE_RANK + ": " + rank + "\n" + DETECTIVE_BADGE_NUMBER + ": " + badgeNumber
                        + "\n" + DETECTIVE_ACTIVE_CASES + ": " + activeCases + "\n" + DETECTIVE_SOLVED_CASES + ": "
                        + solvedCases + "\n" + DETECTIVE_ACTIVE_CASES_LIST + ": " + activeCasesList + "\n"
                        + "***************************");
            }
            return detectives;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Criminal> loadCriminals() {
        ArrayList<Criminal> criminals = new ArrayList<>();

        try {
            FileReader reader = new FileReader(CRIMINAL_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray criminalsJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < criminalsJSON.size(); ++i) {
                JSONObject criminalJSON = (JSONObject) criminalsJSON.get(i);
                String id = (String) criminalJSON.get(CRIMINAL_ID);
                String firstName = (String) criminalJSON.get(CRIMINAL_FIRST_NAME);
                String lastName = (String) criminalJSON.get(CRIMINAL_LAST_NAME);
                boolean deceased = ((Boolean) criminalJSON.get(CRIMINAL_DECEASED)).booleanValue();
                String phoneNumber = (String) criminalJSON.get(CRIMINAL_PHONE_NUMBER);
                String nickName = (String) criminalJSON.get(CRIMINAL_NICK_NAME);
                int age = ((Long) criminalJSON.get(CRIMINAL_AGE)).intValue();
                int weight = ((Long) criminalJSON.get(CRIMINAL_WEIGHT)).intValue();
                String height = (String) criminalJSON.get(CRIMINAL_HEIGHT);
                String race = (String) criminalJSON.get(CRIMINAL_RACE);
                double shoeSize = ((Double) criminalJSON.get(CRIMINAL_SHOE_SIZE)).doubleValue();
                String naturalHairColor = (String) criminalJSON.get(CRIMINAL_NATURAL_HAIR_COLOR);
                String hairLength = (String) criminalJSON.get(CRIMINAL_HAIR_LENGTH);
                String facialHairDesc = (String) criminalJSON.get(CRIMINAL_FACIAL_HAIR_DESCRIPTION);
                String clothesDesc = (String) criminalJSON.get(CRIMINAL_CLOTHES_DESCRIPTION);
                boolean tattoed = ((Boolean) criminalJSON.get(CRIMINAL_TATTOOED)).booleanValue();
                ArrayList<String> tattooList = (ArrayList<String>) criminalJSON.get(CRIMINAL_TATTOO_LIST);
                boolean hasCar = ((Boolean) criminalJSON.get(CRIMINAL_HAS_CAR)).booleanValue();
                String carDescription = (String) criminalJSON.get(CRIMINAL_CAR_DESCRIPTION);
                String licensePlate = (String) criminalJSON.get(CRIMINAL_LICENSE_PLATE_NUM);
                boolean inJail = ((Boolean) criminalJSON.get(CRIMINAL_IN_JAIL)).booleanValue();
                ArrayList<String> convictions = (ArrayList<String>) criminalJSON.get(CRIMINAL_CONVICTIONS);
                criminals.add(new Criminal(firstName, lastName, phoneNumber, nickName, age, weight, height, race,
                        shoeSize, naturalHairColor, hairLength, facialHairDesc, clothesDesc, hasCar, carDescription,
                        licensePlate, inJail));
                System.out.println(CRIMINAL_ID + ": " + id + "\n" + CRIMINAL_FIRST_NAME + ": " + firstName + "\n"
                        + CRIMINAL_LAST_NAME + ": " + lastName + "\n" + CRIMINAL_DECEASED + ": " + deceased + "\n"
                        + CRIMINAL_PHONE_NUMBER + ": " + phoneNumber + "\n" + CRIMINAL_NICK_NAME + ": " + nickName
                        + "\n" + CRIMINAL_AGE + ": " + age + "\n" + CRIMINAL_WEIGHT + ": " + weight + "\n"
                        + CRIMINAL_HEIGHT + ": " + height + "\n" + CRIMINAL_RACE + ": " + race + "\n"
                        + CRIMINAL_SHOE_SIZE + ": " + shoeSize + "\n" + CRIMINAL_NATURAL_HAIR_COLOR + ": "
                        + naturalHairColor + "\n" + CRIMINAL_HAIR_LENGTH + ": " + hairLength + "\n"
                        + CRIMINAL_FACIAL_HAIR_DESCRIPTION + ": " + facialHairDesc + "\n" + CRIMINAL_CLOTHES_DESCRIPTION
                        + ": " + clothesDesc + "\n" + CRIMINAL_TATTOOED + ": " + tattoed + "\n" + CRIMINAL_TATTOO_LIST
                        + ": " + tattooList + "\n" + CRIMINAL_HAS_CAR + ": " + hasCar + "\n" + CRIMINAL_CAR_DESCRIPTION
                        + ": " + carDescription + "\n" + CRIMINAL_LICENSE_PLATE_NUM + ": " + licensePlate + "\n"
                        + CRIMINAL_IN_JAIL + ": " + inJail + "\n" + CRIMINAL_CONVICTIONS + ": " + convictions + "\n"
                        + "***************************");
            }
            return criminals;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static ArrayList<Victim> loadVictims() {
        ArrayList<Victim> victims = new ArrayList<Victim>();

        try {
            FileReader reader = new FileReader(VICTIM_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray victimsJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < victimsJSON.size(); ++i) {
                JSONObject victimJSON = (JSONObject) victimsJSON.get(i);
                String firstName = (String) victimJSON.get(VICTIM_FIRST_NAME);
                String lastName = (String) victimJSON.get(VICTIM_LAST_NAME);
                String phoneNumber = (String) victimJSON.get(VICTIM_PHONE_NUMBER);
                List<String> listData = new List<String>();
                JSONArray fam = (JSONArray) victimJSON.get(VICTIM_FAMILY_MEMBER);
                listdata.add("asd");
                victims.add(new Victim(firstName, lastName));
                System.out.println(OFFICER_FIRST_NAME + ": " + firstName + "\n"
                        + OFFICER_LAST_NAME + ": " + lastName + "\n"
                        + "***************************");
            }
            return officers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
String firstName, String lastName, String phoneNumber, List<String> familyMembers,
            String criminalDesc