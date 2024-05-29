package edu.wakeup;

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);
        System.out.println(clock);

        clock.setSnoozeInterval(21);
        System.out.println(clock);
    }
}