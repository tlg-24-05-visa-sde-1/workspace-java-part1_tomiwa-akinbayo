package com.hoops.test;

import com.hoops.BasketballPlayer;
import com.hoops.Position;

/**
 * JR: not thorough enough.
 *   setJerseyNumber() and setNumberOfChips() need to be tested as follows:
 *     For jerseyNumber, range [0-99], you need to test:
 *      -1,0  and  99,100
 *     For numberOfChips, range [0-11], you need to test:
 *      -1,0  and  11, 12
 *     That is, you check the edges of the valid range, and values just outside it.
 */
class BasketballValidationTest {
    public static void main(String[] args) {
        BasketballPlayer shaq = new BasketballPlayer(33, "Miami Heat", "Shaquille O'neal",
                4, 85, Position.C );

        System.out.println(shaq);
        shaq.setJerseyNumber(100);
        shaq.setNumberOfChips(13);
        System.out.println(shaq);

    }
}