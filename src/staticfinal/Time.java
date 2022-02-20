package staticfinal;

import static staticfinal.Validation.checkHour;
import static staticfinal.Validation.checkMinute;
import static staticfinal.Validation.checkSecond;

// universalForm = "21:45:20"
// standardForm = "9:45:20 PM"
public class Time {
    public static int instanceCount = 0;

    private int hour; // 0 <=   <= 23
    private int minute; // 0 <=  <= 59
    private int second; // 0 <=  <= 59

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        checkHour(hour);
        checkMinute(minute);
        checkSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        instanceCount++;
    }

    // universalForm = "21:45:20"
    public String toUniversalForm() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // standardForm = "9:45:20 PM"
    public String toStandardForm() {
        // ternary operator
        // (condition) ? true_value : false_value
        int h = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String unit = (hour < 12) ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", h, minute, second, unit);
    }

    // getter & setter
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        checkHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        checkMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        checkSecond(second);
        this.second = second;
    }
}
