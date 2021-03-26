import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Criminal> results = Criminals.search("", 30, "black", "6'2\"");
        for (Criminal criminal : results) {
            System.out.println(criminal.getId());
        }
    }
}
