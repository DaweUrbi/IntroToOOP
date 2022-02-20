package assignments.labs.lab1;

import static assignments.labs.lab1.Validation.*;

/**
 * @author David Urban
 */
public class Model {

    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean travel;
    private boolean smoke;

    /**
     * default first constructor - do nothing
     */
    public Model() {
    }

    /**
     * second constructor with all six fields
     * @param firstName firstname of the model, with checking of length between 3-20 characters
     * @param lastName last name of the model, with checking of length 3-20 characters
     * @param height height of model, with checking height between 24-84 inches
     * @param weight weight of model, with checking weight between 80-280 pounds
     * @param travel boolean for traveling true or false
     * @param smoke boolean for smoking true or false
     */
    public Model(String firstName, String lastName, int height, double weight, boolean travel, boolean smoke) throws IllegalArgumentException {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkHeight(height);
        checkWeight(weight);

        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.travel = travel;
        this.smoke = smoke;
    }

    /**
     * third constructor with four fields and two default
     * @param firstName firstname of the model, with checking of length between 3-20 characters
     * @param lastName last name of the model, with checking of length 3-20 characters
     * @param height height of model, with checking height between 24-84 inches
     * @param weight weight of model, with checking weight between 80-280 pounds
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this(firstName, lastName, height, weight, true, false);
    }

    /**
     * @return first name - string
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Setter for first name
     * @param firstName firstname string, length between 3-20 characters
     */
    public void setFirstName (String firstName) {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    /**
     * @return last name - string
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Setter for last name
     * @param lastName last name string, length between 3-20 characters
     */
    public void setLastName (String lastName) {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    /**
     * @return height - int
     */
    public int getHeight() {
        return height;
    }
    /**
     * Setter for height
     * @param height int height between 24-84
     */
    public void setHeight (int height) {
        checkHeight(height);
        this.height = height;
    }

    /**
     * @return weight - double
     */
    public double getWeight() {
        return weight;
    }
    /**
     * Setter for weight
     * @param weight double weight between 80-280
     */
    public void setWeight (double weight) {
        checkWeight(weight);
        this.weight = weight;
    }

    /**
     * @return travel - boolean
     */
    public boolean isTravel() {
        return travel;
    }
    /**
     * Setter for travel
     * @param travel boolean for traveling true or false
     */
    public void setTravel (boolean travel) {
        this.travel = travel;
    }

    /**
     * @return smoke - boolean
     */
    public boolean isSmoke() {
        return smoke;
    }
    /**
     * Setter for smoke
     * @param smoke boolean for smoke true or false
     */
    public void setSmoke (boolean smoke) {
        this.smoke = smoke;
    }

    /**
     * @return return string full name (first name + last name)
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * @return return height string in inches
     */
    public String getHeightInches() {
        return getHeight() + " inches";
    }

    /**
     * @return return weight string in pounds
     */
    public String getWeightPounds() {
        return Math.round(getWeight()) + " pounds";
    }

    /**
     * @return return travel string if can travel or not
     */
    public String getTravel() {
        return isTravel() ? "Does travel" : "Does not travel";
    }

    /**
     * @return return smoke if smoking or not
     */
    public String getSmoke() {
        return isSmoke() ? "Does smoke" : "Does not smoke";
    }
    /**
     * @return return height in feet and inches
     */
    public String getHeightInFeetAndInches() {
        int feet = (int) getHeight() / INCHES_PER_FOOT;
        int inch = (int) getHeight() % INCHES_PER_FOOT;
        String feetAndInch = feet + " feet ";

        return inch > 0 ? feetAndInch + inch + " inches" : feetAndInch;
    }

    /**
     * @return return weight in kg
     */
    public long getWeightKg() {
        return Math.round(getWeight() / POUNDS_PER_KG);
    }
    /**
     * Setter for weight in kg
     * @param kilograms long weight in kg between 37-126
     */
    public void setWeight(long kilograms) {
        checkWeight(weight);
        this.weight = kilograms * POUNDS_PER_KG;
    }

    /**
     * Setter for height in inches and feet
     * @param inches int height part in inches
     * @param feet   int height part in feet
     */
    public void setHeight(int feet, int inches) {
        //double tempHeight = Double.parseDouble(feet + "." + inches);
        //checkHeight(tempHeight * INCHES_PER_FOOT, " Height");
        this.height = (feet * INCHES_PER_FOOT) + inches;
    }

    /**
     * prints details about models
     */
    public void printDetails() {
        System.out.println("Name: " + getFullName());
        System.out.println("Height: " + getHeightInches());
        System.out.println("Weight: " + getWeightPounds());
        System.out.println(getTravel());
        System.out.println(getSmoke());
        System.out.println();
    }

    /**
     * @return return int salary per hour
     */
    public int calculatePayDollarsPerHour() {
        int salaryHour = BASE_RATE_DOLLARS_PER_HOUR;

        if (this.getHeight() >= TALL_INCHES && this.getWeight() <= THIN_POUNDS) {
            salaryHour += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (this.isTravel()) {
            salaryHour += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (this.isSmoke()) {
            salaryHour -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return salaryHour;
    }

    /**
     * Displays all the model's information
     */
    public void displayModelDetails() {
        System.out.println("Name: " + getFullName()); //ok
        System.out.println("Height: " + getHeightInFeetAndInches()); //ok
        System.out.println("Weight: " + getWeight() + " pounds"); //ok
        System.out.println("Travels: " + (isTravel() ? "yep" : "nope")); //ok
        System.out.println("Smokes: " + (isSmoke() ? "yep" : "nope")); //ok
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
        System.out.println();
    }
}
