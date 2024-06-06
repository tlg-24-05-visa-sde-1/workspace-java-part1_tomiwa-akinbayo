package com.hoops.client;

import com.hoops.BasketballPlayer;
import com.hoops.Position;

/**
 * JR: usage banner is flawed.  Since command line arguments are space-delimited,
 * the example should include quotes ("") around "Miami Heat" and "Shaquille O'neal".
 * Running the app with the example usage results in program crash:
 *  You've provided 8 arguments
 *  Exception in thread "main" java.lang.NumberFormatException: For input string: "Shaquille"
 *         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
 *         at java.base/java.lang.Integer.parseInt(Integer.java:668)
 *         at java.base/java.lang.Integer.parseInt(Integer.java:786)
 *         at com.hoops.client.BasketballPlayerClientArgs.main(BasketballPlayerClientArgs.java:31)
 *
 * Does work as intended if correct arguments are provided.
 */
class BasketballPlayerClientArgs {
    public static void main(String[] args) {
        if (args.length < 6) {
            String usage = "Usage: java BasketballPlayerClientArgs <jerseyNumber> <teamName>" +
                    " <playerName> <numberOfChips> <heightInInches> <position>";

            // JR: no commas in the example usage, command line arguments are space-delimited in Java
            String example = "Example: java BasketballPlayerClientArgs 33 'Miami Heat' 'Shaquille O'neal'" +
                    " 4 85 C";
            // JR: don't hardcode the positions, use Position.values()
            String note = "Note: supported positions are PG SG SF PF C position-less-player\n" +
                    "Jersey number must be between " + BasketballPlayer.MIN_JERSEY_NUMBER + " and " +
                    BasketballPlayer.MAX_JERSEY_NUMBER + " inclusive\n" +
                    "Number of chips must be between " + BasketballPlayer.MIN_JERSEY_NUMBER + " and " +
                    BasketballPlayer.MAX_NUMBER_OF_CHIPS + " inclusive";

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;

        }

        System.out.println("You've provided " + args.length + " arguments");

        int jerseyNumber = Integer.parseInt(args[0]);
        String teamName = args[1];
        String playerName = args[2];
        int numberOfChips = Integer.parseInt(args[3]);
        int heightInInches = Integer.parseInt(args[4]);
        Position position = Position.valueOf(args[5].toUpperCase());

        BasketballPlayer hooper = new BasketballPlayer(jerseyNumber, teamName, playerName,
                numberOfChips, heightInInches, position);

        // JR: BasketballPlayers can be ordered, like on Amazon?
        // Televisions maybe, BasketballPlayers not likely.
        // Although these days, who knows...  :)
        System.out.println("Thanks for your order!");
        System.out.println(hooper);

    }
}