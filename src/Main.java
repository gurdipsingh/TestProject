public class Main {

    public static void main (String[] args) {

        printNTimes("Hello", 8);
        printOTimes("Gurdip", 7);
        Weekdays.printWeekdays();

    }

    /**
     * Create a message multiple Time
     * @param content show what should display
     * @param numberOfTimes show how often it should repeat
     */
    private static void printOTimes(String content, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(content);
        }
    }

    /**
     * Display message, numTimes times, one message per line.
     * @param message the message to be displayed
     * @param numTimes number of times to display message
     */
    private static void printNTimes(String message, int numTimes) {
        for (int i = 0; i < numTimes; i++) {
            System.out.println(message);
        }
    }

}
