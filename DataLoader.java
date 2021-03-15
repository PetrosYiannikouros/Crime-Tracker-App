import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
public class DataLoader extends DataConstants{
    public static ArrayList<Officer> loadOfficers() {
        ArrayList<Officer> officers = new ArrayList<Officer>();

        try {
            FileReader reader = new FileReader(OFFICER_FILE_NAME);
            JSONParser parser = new JSONParser();
        }
    }
}
