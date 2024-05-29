package edu.wakeup;/*
class definition to model the workings of an alarm clock
This is sometimes called a business class, or system class or application class.
It has no main() method
 */

class AlarmClock {
    // properties or attributes - called fields or instance variables

    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    private int snoozeInterval = 5; // default value when client does not specify.

    // constructors
    public AlarmClock() {
        // no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); // delegate to setter for validation/conversion
    }

    // functions or behaviors - called "methods" in java
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // "accessor" methods - provide controlled access to the objects fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval +
                    ". Must be between " + MIN_INTERVAL +  " and " + MAX_INTERVAL + "(inclusive).");
        }

    }

    /*
    returns a string representation of this AlarmClock object, describing
    it in a sentence. Generally include the name of the class (its type) and
    the value of its fields.
     */
    public String toString() {
        return "AlarmClock: snoozeInterval= " + getSnoozeInterval();
    }

}