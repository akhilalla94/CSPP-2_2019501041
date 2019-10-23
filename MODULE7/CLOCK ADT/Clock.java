/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */

public class Clock {
    int h;
    int m;
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    public Clock(int h, int m) {
        this.h=h;
        this.m=m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        this.h = Integer.parseInt(s.substring(0, 2));
        this.m = Integer.parseInt(s.substring(3, 5));

    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String h = this.h + "";
        String m = this.m+ "";
        if (this.h < 10) {
            h = "0" + h;
        }

        if (this.m < 10) {
            m = "0" + m;
        }
        return h + ":" + m;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (this.h < that.h) {
            return true;
        } else if (this.h== that.h && this.m < that.m) {
            return true;
        } else {
            return false;
        }
    }
    

    private void check() {
        
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        this.m = this.m + 1;

        if (this.m == 60) {
            this.m = 0;
            this.h++;
        }

        if (this.h == 24) {
            this.h = 0;
        }
    }
        
    

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        if (delta > 0) {

            int minutesToAdd = delta % 60; // 51 minute
            int hoursToAdd = (int) (Math.floor(delta / 60)); // 1 hours

            int minutesNow = this.m + minutesToAdd; // 02 + 51 -> 53
            int currentHours = this.h + hoursToAdd; // 18 + 1 -> 19

            if (minutesNow >= 60) {
                this.m = minutesNow - 60; /// final minutes on clock
                currentHours++;
            } else {
                this.m = minutesNow;
            }

            if (currentHours >= 24) {
                this.h = currentHours % 24;
            } else {
                this.h = currentHours;
            }
        }
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}
