package edu.wakeup;

/*
Client-side main class (class definition with the main method).
 */
class AlarmClockClient {
    public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // uses snooze interval constructor
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);

        AlarmClock clock3 = new AlarmClock();


        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println(clock1.toString());
        System.out.println(clock2);
        System.out.println(clock3);
    }
}
