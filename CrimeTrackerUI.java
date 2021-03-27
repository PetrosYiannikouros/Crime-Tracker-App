import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.Scanner;

public class CrimeTrackerUI {
    private static final String WELCOME_MESSAGE = "Welcome to Crime Tracker";
    private String[] menuOptions = {"Login","Add Crime","Add Person","Display Crime"};
    private static Scanner scanner;
    private static CrimeTracker crimeTrack;

    /**
     * Default construct
     */
    CrimeTrackerUI() {
        scanner = new Scanner(System.in);
        crimeTrack = new CrimeTracker();
    }

    /**
     * runs the bulk of code
     */
    public void run() {
        System.out.println(WELCOME_MESSAGE);

        //would loop until user is finished
        while(true) {
            displayMenuOptions();

            int userChoice = getUserChoice(menuOptions.length);

            if(userChoice == -1) {
                System.out.println("Not a valid choice");
                continue;
            }

            if (userChoice == menuOptions.length -1) {
                break;
            }

            switch(userChoice) {
                case(0):
                    promptForUsernameAndPassword();
                    break;
                case(1):
                    addCrime();
                    break;
                case(2):
                    promtForPerson();
                    break;
                case(3):
                    promptForCrime();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Goodbye");
    }




    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
        Crimes crimes = Crimes.getInstance();
        for (Crime crime : crimes)
            crime.getDate();
        // Criminals criminals = Criminals.getInstance();
        // criminals.addCriminal("Burt", "Harbinson", "555-847-1845", "Flabum", 33, 190,
        // "5'5", "White", 7.0, "Dark Brown",
        // "Short and balding", "clean shaven", "unknown", false, true, "2008 Saab
        // Turbo", "AIG712", false);
        // Detectives detectives = Detectives.getInstance();
        // detectives.addDetective("Tom", "Johnson", "jtom54", "hello8*", "Lexington",
        // "Traffic", 15, "Detective", "863",
        // 0, 0);
        // Officers officers = Officers.getInstance();
        // officers.addOfficer("Sam", "Smith", "Sammyboy", "asdf1234", "North Columbia",
        // "State", 10, "Sergeant", "513");
    }

    /**
     * displays all options for user to select
     */
    private void displayMenuOptions() {
        System.out.println("\n-----------Menu-----------");
        for(int i=0;i<menuOptions.length;i++) {
            System.out.println((i+1) + ". " + menuOptions[i]);
        }
        System.out.println("\n");
    }

    /**
     * obtains the choice of action the user wants to take
     * @param numChoices integer of how many total choices there are
     * @return integer for switch case to display and run correct methods
     */
    private int getUserChoice(int numChoices) {
        System.out.println("What would you like to do?");

        String input = scanner.nextLine();
        int choice = Integer.parseInt(input) - 1;

        if(choice >= 0 && choice <= numChoices -1) {
            return choice;
        }
        return -1;
    }

    /**
     * prompts for username and password from user if login is selected
     * calls CrimeTracker method to check validity
     */
    public static void promptForUsernameAndPassword() {
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();

        System.out.println("\nPlease enter your password: ");
        String passwrd = scanner.nextLine();

        crimeTrack.loginAccount(username, passwrd);
        return;

    }

    /**
     * prompts for all variables of Crime, setting a new crime through
     * CrimeTracker methods
     */
    public static void addCrime() {
        System.out.println("Please enter the case number: ");
        String caseNumString = scanner.nextLine();
        int caseNum = Integer.parseInt(caseNumString);

        System.out.println("Enter type of crime: Personal, Property, Inchoate, Statutoru, Financial, Other");
        String typeString = scanner.nextLine();



        /*

            and so on with all variables in Crime
            add UUID
            then create new crime
            add crime to crime list 

        */
    }

    /**
     * prompts user for person
     */
    public static void promtForPerson() {
        /*
            Maybe ask for type of person, officer, admin, etc...
        */
        System.out.println("What is the id of the person you wish to track?\n");
        String id = scanner.nextLine();


    }

    /**
     * prompts user for ID associated with a crime, then checks if it exists in
     * CrimeTracker and calls display if valid
     */
    public static void promptForCrime() {
        System.out.println("Please enter the Crime ID");

        String input = scanner.nextLine();
        
        if(!crimeTrack.checkCrimeID(input)) {
            System.out.println("Crime does not exist");
            return;
        }
        displayCrime(input);
        return;

    }

    /**
     * displays crime by calling CrimeTracker to display through
     * Crimelist
     * @param id String of the id associated with a crime
     */
    private static void displayCrime(String id) {
        System.out.println("\n-----------Crime-----------");

        crimeTrack.dispCrime(id);
    }
}