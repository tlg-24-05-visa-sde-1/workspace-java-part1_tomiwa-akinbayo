package com.hoops;

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
    public void scores (){
        if(playerName == "Kobe Bryant"){
            System.out.println("Kobe was a great scorer with " + numberOfChips + " rings.");
        } else if(playerName == "Michael Jordan"){
            System.out.println("MJ was a great scorer with " + numberOfChips + " rings.");
        } else {
            System.out.println("Lebron is more of an all-around player with " + numberOfChips + " rings.");
        }
    }

    public void defends() {
        System.out.println(playerName + " was a good defender for the " + teamName);
    }

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

    public void setJerseyNumber(int jerseyNumber) {
        if(isValidJerseyNumber(jerseyNumber)){
            this.jerseyNumber = jerseyNumber;
        } else {
            System.out.println("invalid Jersey Number: " + jerseyNumber +
                    ", Please input a number between 1 and 99.");
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
         else {
            System.out.println("Invalid entry " + numberOfChips + ". No NBA player has one more than 11 rings.");
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
    public String toString() {
        return getPlayerName() + " is a " + getPosition()
                + " who wore number " + getJerseyNumber() + " and played for the "
                + getTeamName() + " winning " + getNumberOfChips() + " rings.";
    }
}
