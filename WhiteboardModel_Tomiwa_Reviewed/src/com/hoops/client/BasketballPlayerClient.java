package com.hoops.client;

import com.hoops.BasketballPlayer;
import com.hoops.Position;

/**
 * JR: good test-drive of a few valid instances, but see comments
 * above scores() in BasketballPlayer.
 */
class BasketballPlayerClient {
    public static void main(String[] args) {
        BasketballPlayer mamba = new BasketballPlayer(24, "LA Lakers", "Kobe Bryant",
                5, 78, Position.SG);

        BasketballPlayer mj = new BasketballPlayer();
        mj.setJerseyNumber(23);
        mj.setTeamName("Chicago Bulls");
        mj.setPlayerName("Michael Jordan");
        mj.setNumberOfChips(6);
        mj.setPosition(Position.SG);
        mj.setHeightInInches(78);


        BasketballPlayer lebron = new BasketballPlayer();
        lebron.setJerseyNumber(6);
        lebron.setTeamName("Cleveland Cavaliers");
        lebron.setPlayerName("Lebron James");
        lebron.setNumberOfChips(4);
        lebron.setPosition(Position.POSITION_LESS_PLAYER);
        lebron.setHeightInInches(80);

        mamba.scores();
        mj.scores();
        lebron.scores();
        System.out.println("");

        mamba.defends();
        mj.defends();
        lebron.defends();
        System.out.println("");

        mamba.rebounds();
        mj.rebounds();
        lebron.rebounds();
        System.out.println();
        System.out.println(mamba);
        System.out.println(lebron);
        // JR: you probably want to print 'mj' too
    }
}
