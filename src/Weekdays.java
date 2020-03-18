/**
 * Weekdays
 */
public enum Weekdays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    
    static void printWeekdays() {
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day);
        }
    }
    
}
