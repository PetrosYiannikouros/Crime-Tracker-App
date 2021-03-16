import java.util.List;

/**
 * Victim class
 * creates victim
 * adds stories and family members
 * extends class person
 */
public class Victim extends Person {
    private String story;
    private List<String> familyMembers;
    private String phoneNumber;

    /**
     * default constructor
     */
    public Victim() 
    {

    }
    public Victim (String firstName, String lastName, 
                boolean deceased, List<Integer> caseNums, String story,
                List<String> familyMembers,  String phoneNumber)
    {
        super(firstName, lastName, deceased, caseNums);
        this.story = story;
        this.familyMembers = familyMembers;
        this.phoneNumber = phoneNumber;
    }

    /**
     * going to have to come back too later. I dont think just a normal list
     * is going in the parameters.
     * @param list
     * @return list of description of criminal
     */
    public List<String> descriptionOfCriminal(List<String> list) {
        return;
    }

}
