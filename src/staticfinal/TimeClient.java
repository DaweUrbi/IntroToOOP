package staticfinal;

public class TimeClient {
    public static void main(String[] args) {
        Time t1 = new Time(23);
        Time t2 = new Time(9, 33, 20);
        Time t3 = new Time(23, 2, 5);
        Time[] times = {t1, t2, t3};
        System.out.println("I created Time objects " + Time.instanceCount + " times.");

        for (Time time : times) {
            System.out.println(time.toStandardForm());
            System.out.println(time.toUniversalForm());
        }

//        for (int i = 0; i < times.length; i++) {
//            Time time = times[i];
//            System.out.println(time.toStandardForm());
//            System.out.println(time.toUniversalForm());
//        }

//        try {
//            Time t4 = new Time(25, 50, 5);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Invalid arguments");
//        }
//         Time t5 = new Time(21, 65, 20);

    }
}
