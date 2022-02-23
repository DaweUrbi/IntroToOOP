package assignments.labs.lab2;

public class Canada {

    private Province[] provinces;
    private long[] population;

    public Canada() {
        Province x = new Province();
        this.provinces = new Province[10];
        this.provinces[0] = new Province("Ontario", "Toronto", 14_223_942);
        this.provinces[1] = new Province("Quebec", "Quebec City", 8_501_833);
        this.provinces[2] = new Province("British Columbia", "Victoria", 5_000_879);
        this.provinces[3] = new Province("Alberta", "Edmonton", 4_262_635);
        this.provinces[4] = new Province("Manitoba", "Winnipeg", 1_342_153);
        this.provinces[5] = new Province("Saskatchewan", "Regina", 1_132_505);
        this.provinces[6] = new Province("Nova Scotia", "Halifax", 969_383);
        this.provinces[7] = new Province("New Brunswick", "Fredericton", 775_610);
        this.provinces[8] = new Province("Newfoundland and Labrador", "St. John's", 510_550);
        this.provinces[9] = new Province("Prince Edward Island", "Charlottetown", 154_331);

        this.population = new long[]{14_223_942, 8_501_833, 5_000_879, 4_262_635, 1_342_153, 1_132_505, 969_383, 775_610,
                510_550, 154_331};
    }

    public void displayAllProvinces() {
        for (Province p : provinces) {
            System.out.println(p.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
        int numb = 0;
        int minNumb = min * 1_000_000;
        int maxNumb = max * 1_000_000;

        for (int x = 0; x < population.length; x++) {
            if (population[x] >= minNumb && population[x] <= maxNumb) {
                numb++;
            }
        }
        return numb;
    }
}


