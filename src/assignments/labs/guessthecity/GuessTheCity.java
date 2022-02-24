package assignments.labs.guessthecity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GuessTheCity {

    private  String randomCity = RandomCity.pickRandomCity();
    private StringBuilder display = showRandomCity(randomCity);

    private StringBuilder showRandomCity(String randomCity) {
        StringBuilder displayRandomCity = new StringBuilder();
        for (int x = 0; x < randomCity.length(); x++) {
            if (randomCity.charAt(x) != ' ') {
                displayRandomCity.append("_");
            } else {
                displayRandomCity.append(" ");
            }
        } return displayRandomCity;
    }

    public static class RandomCity {
        static String pickRandomCity() {
            String randomCity = "";
            try {
                File file = new File("src/assignments/labs/guessthecity/cities.txt");
                Scanner scan = new Scanner(file);
                List<String> city = new ArrayList<>();

                while (scan.hasNextLine()) {
                    city.add(scan.nextLine());
                }
                String[] cities = city.toArray(new String[0]);
                int rnd = new Random().nextInt(cities.length);
                randomCity = cities[rnd];

            } catch (FileNotFoundException e) {
                System.out.println("Error - file does not exist!");
            }
            return randomCity;
        }
    }

    void game(){
        int count = 0;
        StringBuilder wrong = new StringBuilder();
        System.out.println("Guess random city!");
        System.out.println(display);

        while (count < 10 && !display.toString().equals(randomCity)) {
            Scanner guess = new Scanner(System.in);
            System.out.print("Guess a letter: ");
            String letter = guess.nextLine();
            if (!randomCity.contains(letter)) {
                if (letter.length() > 1) {
                    System.out.println("Invalid input - must be a letter");
                } else if (wrong.toString().contains(letter)) {
                    System.out.println("Already guessed " + letter);
                    count++;
                } else {
                    wrong.append(" ").append(letter);
                    count++;
                }
            } else {
                for (int x = 0; x < randomCity.length(); x++) {
                    if (String.valueOf(randomCity.charAt(x)).equals(letter.toLowerCase())) {
                        display.setCharAt(x, letter.toLowerCase().charAt(0));
                    }
                    if (String.valueOf(randomCity.charAt(x)).equals(letter.toUpperCase())) {
                        display.setCharAt(x, letter.toUpperCase().charAt(0));
                    }
                }
            }
            System.out.println("Your letter is: " + display);
            System.out.println("You guessed (" + count + ") wrong letters:" + wrong);
        }
        if (display.toString().equals(randomCity)) {
            System.out.println("You WIN!\nYou have guessed '" + randomCity + "' correctly!");
        } else {
            System.out.println("You LOSE!\nThe city was '" + randomCity + "'!");
        }
    }
}
