package assignments.labs.lab2;

import java.util.Arrays;

public class Province {

    private String name;
    private String capital;
    private long population;

    private final static String DEFAULT_PROVINCE = "British Columbia" ;
    private final static String DEFAULT_CAPITAL = "Victoria";
    private final static long DEFAULT_POPULATION = 5_000_879;


    private String[] arrayName = {"Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan",
            "Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island" };

    private String[] arrayCapital = {"Toronto", "Quebec City", "Victoria", "Edmonton", "Winnipeg", "Regina", "Halifax",
            "Fredericton", "St. John's", "Charlottetown"};

    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(name))
                && (isValidCapitalCity(capital))) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.population = DEFAULT_POPULATION; }
    }
    public Province() {
        this.name = DEFAULT_PROVINCE;
        this.capital = DEFAULT_CAPITAL;
        this.population = DEFAULT_POPULATION; }

    private boolean isValidProvince(String name) {
        return Arrays.asList(arrayName).contains(name);
    }

    private boolean isValidCapitalCity(String capital) {
        return Arrays.asList(arrayCapital).contains(capital);
    }

    private boolean isValidPopulation(long population) {
        return population >= 30_000 && population <= 15_000_000;
    }

    public String getDetails() {
        return  String.format("The capital of %s (population. %d) is %s.", getName(), getPopulation(), getCapital());
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }
}
