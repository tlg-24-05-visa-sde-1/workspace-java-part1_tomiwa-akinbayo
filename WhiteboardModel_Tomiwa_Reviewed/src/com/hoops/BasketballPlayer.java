package com.hoops;

/**
 * JR: Demonstrates good understanding of program concepts, but is incomplete and
 * flawed in some areas.
 *  - ClientArgs usage banner needs improvement, example usage does not work.
 *  - ValidationTest class not thorough enough.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been very good, keep it up.
 *
 * Class names, package names, and overall structure are correct.
 */
public class BasketballPlayer {

    public static final int GOOD_REBOUNDER= 80;
    public static final int MIN_JERSEY_NUMBER = 0;
    public static final int MAX_JERSEY_NUMBER = 99;
    public static final int MIN_NUMBER_OF_CHIPS = 0;
    public static final int MAX_NUMBER_OF_CHIPS = 11;

    // Fields or instance variables
    private int jerseyNumber;
    private String teamName;
    private String playerName;
    private int numberOfChips;
    private int heightInInches;
    private Position position = Position.PG;    //constraint (PG, SG, SF, PF, C, position-less-player)

     //constructors
    public BasketballPlayer() {
    }

    public BasketballPlayer(int jerseyNumber,String teamName, String playerName,
                            int numberOfChips, int heightInInches,  Position position) {
        setJerseyNumber(jerseyNumber);
        setTeamName(teamName);
        setPlayerName(playerName);
        setNumberOfChips(numberOfChips);
        setPosition(position);
        setHeightInInches(heightInInches);
    }

    // Business Methods

    // JR: NEVER do string comparisons with == !
    // And generally better to call your own getters instead of direct field access.
    // Better impl might be:
    //  getName() was a great scorer with getNumberOfChips() rings [+ signs omitted]
    //  because if 'playerName' is not Kobe or Michael nothing is done,
    //  and the output speaks of Lebron, when 'playerName' might be "Caitlin Clark."
    public void scores (){
        if(playerName.equals("Kobe Bryant")){
            System.out.println("Kobe was a great scorer with " + numberOfChips + " rings.");
        } else if(playerName.equals("Michael Jordan")){
            System.out.println("MJ was a great scorer with " + numberOfChips + " rings.");
        } else {
            System.out.println("Lebron is more of an all-around player with " + numberOfChips + " rings.");
        }
    }

    // JR: call your own getters instead of direct field access
    public void defends() {
        System.out.println(playerName + " was a good defender for the " + getTeamName());
    }

    // JR: like the creativity here, simple but effective
    public void rebounds() {
        if(getHeightInInches() >= GOOD_REBOUNDER){
            System.out.printf("%s is an above average rebounder\n", getPlayerName());
        } else {
            System.out.printf("%s had better things to do on the court\n", getPlayerName());
        }
    }

    public boolean isValidJerseyNumber(int jerseyNumber) {
        boolean isValid = false;
        if(jerseyNumber >= MIN_JERSEY_NUMBER && jerseyNumber <= MAX_JERSEY_NUMBER) {
            isValid = true;
        }
        return isValid;
    }

    public boolean isAccurateChampRings(int numberOfChips) {
        boolean isCorrect = false;
        if(numberOfChips >= MIN_NUMBER_OF_CHIPS && numberOfChips <= MAX_NUMBER_OF_CHIPS){
            isCorrect = true;
        }
        return isCorrect;
    }

    // Accessor Methods
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    // JR: no magic numbers (1,99) in the error message, use the class constants
    // MIN/MAX_JERSEY_NUMBER
    public void setJerseyNumber(int jerseyNumber) {
        if(isValidJerseyNumber(jerseyNumber)){
            this.jerseyNumber = jerseyNumber;
        } else {
            System.out.println("invalid Jersey Number: " + jerseyNumber +
                    ", Please input a number between " + MIN_JERSEY_NUMBER + " and " + MAX_JERSEY_NUMBER);
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNumberOfChips() {
        return numberOfChips;
    }

    public void setNumberOfChips(int numberOfChips) {
        if(isAccurateChampRings(numberOfChips)) {
            this.numberOfChips = numberOfChips;
        }
        else {  // JR: not indented correctly
            // JR: typo: no player has 'won', not 'one' more than 11 rings
            System.out.println("Invalid entry " + numberOfChips + ". No NBA player has won more than 11 rings.");
        }
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    // toString()
    // JR: 'heightInInches' is missing
    // Keep toString() to "just the facts", not like an English description.
    // If you want a more descriptive string, add new method getDescription().
    public String toString() {
        return getPlayerName() + " is a " + getPosition() + " who is " + getHeightInInches() + " inches tall"
                + " and wore number " + getJerseyNumber() + " and played for the "
                + getTeamName() + " winning " + getNumberOfChips() + " rings.";
    }
}
