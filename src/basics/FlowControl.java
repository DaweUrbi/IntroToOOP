package basics;

public class FlowControl {
    public static void main(String[] args) {
        // if-else statement
        // (): parenthesis
        // {}: curly braces
        // []: square brackets
        int age = 21;
        if (age > 50) {
            System.out.println("Age is greater than 50");
        } else if (age > 30 && age <= 50) {
            System.out.println("30 < age <= 50");
        } else {
            System.out.println("age <= 30");
        }

        // switch statement
        int salary = 1_000_000;
        switch (salary) {
            case 1_000_000:
                System.out.println("Million");
                break; // falls through without break
            case 50_000:
                System.out.println("Fifty Thousand");
                break;
            default:
                System.out.println("else");
                break;
        }
    }
}
