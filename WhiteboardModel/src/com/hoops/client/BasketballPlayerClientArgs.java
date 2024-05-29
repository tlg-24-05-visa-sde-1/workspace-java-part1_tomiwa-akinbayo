package com.hoops.client;

import com.hoops.BasketballPlayer;
import com.hoops.Position;

class BasketballPlayerClientArgs {
    public static void main(String[] args) {
        if (args.length < 6) {
            String usage = "Usage: java BasketballPlayerClientArgs <jerseyNumber> <teamName>" +
                    " <playerName> <numberOfChips> <heightInInches> <position>";
            String example = "Example: java BasketballPlayerClientArgs 33 Miami Heat Shaquille O'neal " +
                    "4, 85, C";
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

        System.out.println("Thanks for your order!");
        System.out.println(hooper);

    }
}