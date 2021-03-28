import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CrimeTrackerUI {
    private static final String WELCOME_MESSAGE = "Welcome to Crime Tracker";
    private String[] menuOptions = { "Login", "Add Crime", "Search Crime", "Search Criminal" };
    private static Scanner scanner;
    private static CrimeTracker crimeTrack;
    private static User currentUser;

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

        // would loop until user is finished
        while (true) {
            displayMenuOptions();

            int userChoice = getUserChoice(menuOptions.length);

            if (userChoice == -1) {
                System.out.println("Not a valid choice");
                continue;
            }

            if (userChoice == menuOptions.length - 1) {
                break;
            }

            switch (userChoice) {
            case (0):
                login();
                break;
            case (1):
                addCrime();
                break;
            case (2):
                promtForPerson();
                break;
            case (3):
                promptForCrime();
                break;
            default:
                break;
            }
        }
        System.out.println("Goodbye");
    }

    /**
     * displays all options for user to select
     */
    private void displayMenuOptions() {
        System.out.println("\n-----------Menu-----------");
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println((i + 1) + ". " + menuOptions[i]);
        }
        System.out.println("\n");
    }

    /**
     * obtains the choice of action the user wants to take
     * 
     * @param numChoices integer of how many total choices there are
     * @return integer for switch case to display and run correct methods
     */
    private int getUserChoice(int numChoices) {
        System.out.println("What would you like to do?");

        String input = scanner.nextLine();
        int choice = Integer.parseInt(input) - 1;

        if (choice >= 0 && choice <= numChoices - 1)
            return choice;

        return -1;
    }

    /**
     * prompts for username and password from user if login is selected calls
     * CrimeTracker method to check validity
     */
    public static void login() {
        System.out.println("Are you a detective or officer?");
        String option = scanner.nextLine();

        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        if (option.equalsIgnoreCase("detective"))
            while (!CrimeTracker.loginAccountDetective(username, password)) // continue asking user for login details
                continue;
        else if (option.equalsIgnoreCase("officer"))
            while (!CrimeTracker.loginAccountOfficer(username, password)) // continue asking user for login details
                continue;
        else
            while (!CrimeTracker.loginAccountUser(username, password)) // continue asking user for login details
                continue;
        currentUser = CrimeTracker.getCurrentUser();
    }

    /**
     * prompts for all variables of Crime, setting a new crime through CrimeTracker
     * methods
     */
    public static void addCrime() {
        Crimes crimes = Crimes.getInstance();

        System.out.println("Please enter the case number: ");
        String caseNumString = scanner.nextLine();
        int caseNum = Integer.parseInt(caseNumString);

        TypesOfCrimes type = TypesOfCrimes.OTHER;
        System.out.println("Enter type of crime: Personal, Property, Inchoate, Statutoru, Financial, Other");
        String typeString = scanner.nextLine();
        switch (typeString.toUpperCase()) {
        case "PERSONAL":
            type = TypesOfCrimes.PERSONAL;
            break;
        case "PROPERTY":
            type = TypesOfCrimes.PROPERTY;
            break;
        case "INCHOATE":
            type = TypesOfCrimes.INCHOATE;
            break;
        case "STATUTORY":
            type = TypesOfCrimes.STATUTORY;
            break;
        case "FINANCIAL":
            type = TypesOfCrimes.FINANCIAL;
            break;
        case "OTHER":
            type = TypesOfCrimes.OTHER;
            break;
        default:
            System.out.println("Not a valid selection.");
        }

        System.out.println("Please enter description of crime: ");
        String description = scanner.nextLine();

        System.out.println("Please enter date of crime (follow this format dd-mm-yy hh:mm): ");
        String date = scanner.nextLine();

        System.out.println("Please enter the address of crime: ");
        String address = scanner.nextLine();

        Crime crime = new Crime(caseNum, type, description, date, address, currentUser.getId().toString());

        System.out.println("Please enter how many criminals involved: ");
        int criminalNum = scanner.nextInt();
        scanner.nextLine(); // absorb new space
        while (criminalNum > 0) {
            System.out.println("Enter Criminal #" + criminalNum + " first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " nick name: ");
            String nickName = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " age: ");
            int age = scanner.nextInt();
            System.out.println("Enter Criminal #" + criminalNum + " weight: ");
            int weight = scanner.nextInt();
            System.out.println("Enter Criminal #" + criminalNum + " height: ");
            String height = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " race: ");
            String race = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " gender: ");
            String gender = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " shoe size: ");
            double shoeSize = scanner.nextDouble();
            System.out.println("Enter Criminal #" + criminalNum + " hair color: ");
            String hairColor = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " hair length: ");
            String hairLength = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " facial hair description: ");
            String facialHair = scanner.nextLine();
            System.out.println("Enter Criminal #" + criminalNum + " clothes description: ");
            String clothesDescription = scanner.nextLine();
            /*
             * System.out.println("Is Criminal #" + criminalNum + " tattooed?"); boolean
             * tattooed =
             */
            /*
             * System.out.println("Does Criminal #" + criminalNum + " have car?"); boolean
             * hasCar =
             */
            /*
             * System.out.println("Describe criminal#" + criminalNum + " vehicle: "); String
             * vehicleDescription =
             */
            /*
             * System.out.println(Enter Criminal #" + criminalNum + " license plate #: ");
             * String licensePlate =
             */
            System.out.println("Is Criminal #" + criminalNum + " in Prison?");
            boolean inJail = scanner.nextBoolean();
            Criminal criminal = new Criminal(firstName, lastName, phoneNumber, nickName, age, weight, height, race,
                    gender, shoeSize, hairColor, hairLength, facialHair, clothesDescription, false, false, "", "",
                    inJail);

            crime.addCriminal(criminal);
            criminalNum--;
        }

        System.out.println("Please enter how many suspects involved: ");
        int suspectNum = scanner.nextInt();
        scanner.nextLine(); // absorb new space
        while (suspectNum > 0) {
            System.out.println("Enter Suspect #" + suspectNum + " first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " nick name: ");
            String nickName = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // absorb new space
            System.out.println("Enter Suspect #" + suspectNum + " weight: ");
            int weight = scanner.nextInt();
            scanner.nextLine(); // absorb new space
            System.out.println("Enter Suspect #" + suspectNum + " height: ");
            String height = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " race: ");
            String race = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " gender: ");
            String gender = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " shoe size: ");
            double shoeSize = scanner.nextDouble();
            scanner.nextLine(); // absorb new space
            System.out.println("Enter Suspect #" + suspectNum + " hair color: ");
            String hairColor = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " hair length: ");
            String hairLength = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " facial hair description: ");
            String facialHair = scanner.nextLine();
            System.out.println("Enter Suspect #" + suspectNum + " clothes description: ");
            String clothesDescription = scanner.nextLine();
            /*
             * System.out.println("Is Criminal #" + criminalNum + " tattooed?"); boolean
             * tattooed =
             */
            System.out.println("Does Suspect #" + criminalNum + " have car? (enter true or false)");
            boolean hasCar = scanner.nextBoolean();
            scanner.nextLine(); // absorb new space
            System.out.println("Describe Suspect #" + suspectNum + " vehicle: ");
            String carDescription = scanner.nextLine();
            /*
             * System.out.println(Enter Criminal #" + criminalNum + " license plate #: ");
             * String licensePlate =
             */
            Suspect suspect = new Suspect(firstName, lastName, phoneNumber, nickName, age, weight, height, race, gender,
                    shoeSize, hairColor, hairLength, facialHair, clothesDescription, false, hasCar, carDescription, "");

            crime.addSuspect(suspect);
            suspectNum--;
        }

        System.out.println("Please enter how many witnesses involved: ");
        int witnessNum = scanner.nextInt();
        scanner.nextLine(); // absorb new space
        while (witnessNum > 0) {
            System.out.println("Enter Witness #" + witnessNum + " first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter Witness #" + witnessNum + " last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter Witness #" + witnessNum + " phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter Witness #" + witnessNum + " account of events: ");
            String story = scanner.nextLine();
            System.out.println("Does Witness #" + witnessNum + " have proof? (enter true or false");
            boolean proof = scanner.nextBoolean();
            scanner.nextLine(); // absorb new space
            System.out.println("Enter Witness #" + witnessNum + " location: ");
            String location = scanner.nextLine();
            Witness witness = new Witness(firstName, lastName, phoneNumber, proof, story, location);
            crime.addWitness(witness);
            witnessNum--;
        }

        System.out.println("Please enter how many victims involved: ");
        int victimNum = scanner.nextInt();
        scanner.nextLine(); // absorb new space
        while (victimNum > 0) {
            System.out.println("Enter Victim #" + victimNum + " first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter Victim #" + victimNum + " last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter Victim #" + victimNum + " phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter Victim #" + victimNum + " account of events: ");
            String story = scanner.nextLine();
            System.out.println("Enter Victim #" + victimNum + " location: ");
            String location = scanner.nextLine();
            System.out.println("Enter Victim #" + victimNum + " description of criminal: ");
            String criminalDesc = scanner.nextLine();
            Victim victim = new Victim(firstName, lastName, phoneNumber, location, story, criminalDesc);
            crime.addVictim(victim);
            victimNum--;
        }

        System.out.println("Please enter how much pieces of evidence gathered: ");
        int evidenceNum = scanner.nextInt();
        while (evidenceNum > 0) {
            System.out.println("Enter Evidence #" + evidenceNum + " type: ");
            String evidenceType = scanner.nextLine();
            System.out.println("Enter Evidence #" + evidenceNum + " description: ");
            String evidenceDescription = scanner.nextLine();
            System.out.println("Enter Evidence #" + evidenceNum + " amount: ");
            int amount = scanner.nextInt();
            scanner.nextLine(); // absorb new space
            Evidence evidence = new Evidence(evidenceType, evidenceDescription, amount);
            crime.addEvidence(evidence);
            evidenceNum--;
        }

        crimes.addCrime(crime); // adds the crime after filling object with user-desired information
    }

    /**
     * prompts user for person
     */
    public static void promtForPerson() {
        /*
         * Maybe ask for type of person, officer, admin, etc...
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

        if (!crimeTrack.checkCrimeID(input)) {
            System.out.println("Crime does not exist");
            return;
        }
        displayCrime(input);
        return;

    }

    public void crimeSearch() {
        System.out.println("What is the case number of the crime you are trying to search?");
        int caseNum = scanner.nextInt();
        if (CrimeTracker.existingCrime(caseNum)) {
            // System.out.println("asfga");
        } else {
            System.out.println("Case Number doesn't exist");
        }
    }

    /**
     * displays crime by calling CrimeTracker to display through Crimelist
     * 
     * @param id String of the id associated with a crime
     */
    private static void displayCrime(String id) {
        System.out.println("\n-----------Crime-----------");
        crimeTrack.dispCrime(id);
    }

    public static void main(String[] args) {
        CrimeTrackerUI crimeTrackerInterface = new CrimeTrackerUI();
        crimeTrackerInterface.run();
        // CrimeTrackerUI ui = new CrimeTrackerUI();
        // ui.crimeSearch();
    }
}