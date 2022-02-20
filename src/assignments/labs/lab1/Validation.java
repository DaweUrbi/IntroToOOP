package assignments.labs.lab1;

/**
 * @author David Urban
 */

public class Validation {

    /**
     * @param firstName Check length of first name
     */
    public static void checkFirstName (String firstName) {
        if (firstName.length() < 3 || firstName.length() > 20) {
            throw new IllegalArgumentException("First name must have 3 to 20 characters!");
        }
    }

    /**
     * @param lastName Check length of last name
     */
    public static void checkLastName (String lastName) {
        if (lastName.length() < 3 || lastName.length() > 20) {
            throw new IllegalArgumentException("Last name must have 3 to 20 characters!");
        }
    }

    /**
     * @param height Check height in inches
     */
    public static void checkHeight (int height) {
        if (height < 24 || height > 84) {
            throw new IllegalArgumentException("Height have to be between 24 to 84 inches!");
        }
    }

    /**
     * @param weight Check height in inches
     */
    public static void checkWeight (double weight) {
        if (weight < 80 || weight > 280) {
            throw new IllegalArgumentException("Weight have to be between 80 to 280 pounds!");
        }
    }


}


