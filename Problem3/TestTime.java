package Problem3;

public class TestTime {
    public static void main(String[] args) {
        // Create two time objects
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set their time using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Display the times before changes
        System.out.println("Initial Times:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        // Call nextSecond for t1 and previousSecond for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display the final times after changes
        System.out.println("Final Times:");
        System.out.println("t1 (after nextSecond): " + t1);
        System.out.println("t2 (after previousSecond): " + t2);
    }
}
