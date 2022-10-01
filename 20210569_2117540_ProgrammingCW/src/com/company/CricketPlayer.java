package com.company;
//this class is for bowlers and batsmen
public class CricketPlayer extends Player {
    //ilovegloves
    private String playerName;
    private int playerScore;
    private String teamName;
    //blahblah
    public CricketPlayer(String playerName,int playerScore,String teamName){
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.teamName = teamName;

    }
    //new

    @Override
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    @Override
    public String getPlayerName(){return playerName;}
    @Override
    public int getPlayerScore() {
        return playerScore;
    }
    @Override
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }
    @Override
    public String getTeamName() {return teamName;}
    @Override
    public void setTeamName(String teamName) {this.teamName = teamName;}

}
