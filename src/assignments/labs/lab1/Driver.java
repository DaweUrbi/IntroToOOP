package assignments.labs.lab1;

/**
 * @author David Urban
 */

public class Driver {
    public static void main(String[] args) {
        try {
            Model model1 = new Model("Susan", "Smith", 70, 120.0, false, true);
            Model model2 = new Model("Tiger", "Woods", 72, 190.0, true, false);

            model1.printDetails();
            model2.printDetails();

            model1.setTravel(true);
            model1.setSmoke(false);
            model1.displayModelDetails();
            model2 = model1;
            model2.displayModelDetails();

        } catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
        }

    }


}