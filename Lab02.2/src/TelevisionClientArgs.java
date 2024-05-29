/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

import static java.lang.Character.getType;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: supported displays are LED, OLED, LCD, CRT, PLASMA\n" +
                    "Available brands are" + Arrays.toString(Television.VALID_BRANDS) + "\n" +
                    "Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME + " (inclusive)" + "\n" +
                    "Supported displays are " + Arrays.toString(DisplayType.values());


            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }
        System.out.println(Arrays.toString(Television.VALID_BRANDS));

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        // Step 1" convert from string into proper types if necessary
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        // Step 2: create a television object from these 3 values
        Television tv4 = new Television(brand, volume, display);

        // Step 3: congratulate them on their order, print the resulting television
        System.out.println("Thanks for your order!");
        System.out.println(tv4);
    }


}