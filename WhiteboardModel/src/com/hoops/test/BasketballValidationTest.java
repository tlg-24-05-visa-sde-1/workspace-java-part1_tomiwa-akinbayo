package com.hoops.test;

import com.hoops.BasketballPlayer;
import com.hoops.Position;

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