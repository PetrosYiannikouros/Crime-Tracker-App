import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class PersonOfInterest extends Person {
    String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private int id;
    private String nickName;
    private int age;
    private int weight;
    //i think height should be a string
    private String height;
    private String race;
    private SimpleDateFormat dateOfBirth;
    private String naturalHairColor;
    private String hairLength;
    private boolean facialHair;
    private String facialHairDesc;
    private String clothesDesc;
    private boolean tattooed;
    //why is this not just list
    private List<String> tattoos;
    private boolean hasCar;
    private String carSpecs;
    private String licensePlate;
    private String story;
    private List<String> infoProvided;

    /**
     * default constructor for POI
     */
    public PersonOfInterest() 
    {

    }
    public PersonOfInterest(String firstName, String lastName, 
                    String pattern, Integer id, String nickName, int age, int weight, 
                    String height, String race, String naturalHairColor, String hairLength, 
                    boolean facialHair, String facialHairDesc, String clothesDesc,
                    boolean hasCar, String carSpecs, String licensePlate, String story) {
        super(firstName, lastName);
        this.pattern = pattern;
        this.id = id;
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.race = race;
        this.naturalHairColor = naturalHairColor;
        this.hairLength = hairLength;
        this.facialHair = facialHair;
        if(facialHair) {
            this.facialHairDesc = facialHairDesc;
        }

        this.clothesDesc = clothesDesc;
        this.hasCar = hasCar;
        if(hasCar)
        {
            this.carSpecs = carSpecs;
            this.licensePlate = licensePlate;
        }
        this.story = story;
    }

    //getter section -----------------------------------------------
    /**
     * get POI's id
     * @return Integer id
     */
    public Integer getID() {
        return this.id;
    }

    /**
     * get POI's nickname
     * @return string nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     *get POI's age
     * @return int age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * get POI's weight
     * @return double weight
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * get POI's height
     * @return double height
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * get POI's race
     * @return String race
     */
    public String getRace() {
        return this.race;
    }

    /**
     * get POI's date of birth
     * @return date dateOfBirth
     */
    public SimpleDateFormat getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * 
     * @return
     */
    public String getNaturalHairColor() {
        return this.naturalHairColor;
    }

    /**
     * 
     * @return
     */
    public String getHairLength() {
        return this.hairLength;
    }

    /**
     * 
     * @return
     */
    public boolean isFacialHair() {
        return this.facialHair;
    }

    /**
     * 
     * @return
     */
    public String getFacialHairDesc() {
        return this.facialHairDesc;
    }

    /**
     * 
     * @return
     */
    public String getClothesDesc() {
        return this.clothesDesc;
    }

    /**
     * get status or whether POI is tattoed or not
     * @return boolean tattooed
     */
    public boolean isTattooed() {
        return this.tattooed;
    }

    /**
     * get list of POI's tattoos
     * @return ArrayList tattoos
     */
    public List<String> getTattoos() {
        return this.tattoos;
    }

    /**
     * get status of whether POI has car or not
     * @return boolean hasCar
     */
    public boolean isHasCar() {
        return hasCar;
    }

    /**
     * get POI's car specifications
     * @return String desription of carSpecs
     */
    public String getCarSpecs() {
        return this.carSpecs;
    }

    /**
     * 
     * @return
     */
    public String getLicense() {
        return this.licensePlate;
    }

    /**
     * get story/alibi from POI
     * @return String story
     */
    public String getStory() {
        return story;
    }

    /**
     * get info provided about POI
     * @return
     */
    public List<String> getInfoProvided() {
        return infoProvided;
    }

    //setter section -----------------------------------------------

    /**
     * 
     * @param id
     */
    public void setID(Integer id) {
        this.id = id;
    }

    /**
     * set nick name for POI
     * @param String nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * set age for POI
     * @param int age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * set weight for POI
     * @param double weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * set height for POI
     * @param double height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * set race for POI
     * @param String race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * set date of birth for POI
     * @param date dateOfBirth
     */
    public void setDateOfBirth(SimpleDateFormat dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * 
     * @param naturalHairColor
     */
    public void setNaturalHairColor(String naturalHairColor) {
        this.naturalHairColor = naturalHairColor;
    }

    /**
     * 
     * @param hairLength
     */
    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    /**
     * 
     * @param facialHair
     */
    public void setFacialHair(boolean facialHair) {
        this.facialHair = facialHair;
    }

    /**
     * 
     * @param facialHairDesc
     */
    public void setFacialHairDesc(String facialHairDesc) {
        this.facialHairDesc = facialHairDesc;
    }

    /**
     * 
     * @param clothesDesc
     */
    public void setClothesDesc(String clothesDesc) {
        this.clothesDesc = clothesDesc;
    }

    /**
     * set tattoo status for POI
     * true = tattooed
     * false = no tattoos
     * @param booleam tattooed
     */
    public void setTattooed(boolean tattooed) {
        this.tattooed = tattooed;
    }

    /**
     * create array list of tatttoos
     * probably not needed
     * an append would be more apporpiate
     * @param ArrayList tattoos
     */
    public void setTattoos(List<String> tattoos) {
        this.tattoos = tattoos;
    }

    /**
     * set status of wheter POI has a vehicle or not
     * @param boolean hasCar
     */
    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    /**
     * set License plate for POI
     * @param String licensePlate
     */
    public void setCarSpecs(String carSpecs) {
        this.carSpecs = carSpecs;
    }

    /**
     * 
     * @param license
     */
    public void setLicense(String license) {
        this.licensePlate = license;
    }

    /**
     * set story for POI
     * an append would be more apporpiate
     * @param String story
     */
    public void setStory(String story) {
        this.story = story;
    }

    /**
     * setter info provided about POI
     * an append would be morea apporpiate
     * @param List<String> infoProvided
     */
    public void setInfoProvided(List<String> infoProvided) {
        this.infoProvided = infoProvided;
    }
}
