public class Time {
    int hour;
    int minute;
    int second;

    // Constructor with no arguments
    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // Constructor with one argument
    public Time(int hour) {
        this.hour = hour;
        minute = 0;
        second = 0;
    }

    // Constructor with two arguments
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        second = 0;
    }

    // Constructor with three arguments
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to display the time
    public void displayTime() {
        System.out.println("Time: " + hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Time t1 = new Time();
        Time t2 = new Time(10);
        Time t3 = new Time(12, 30);
        Time t4 = new Time(15, 45, 30);

        // Displaying the time
        t1.displayTime();
        t2.displayTime();
        t3.displayTime();
        t4.displayTime();
    }
}

