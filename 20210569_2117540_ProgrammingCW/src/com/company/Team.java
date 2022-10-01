package com.company;

import java.util.Random;

public class Team {

    private String playerName;

    public Team(){

    }


        String[] groups = {"Group A", "Group B"};
        String[] groupA = {"Team A1", "Team A2", "Team A3", "Team A4"};
        String[] groupB = {"Team B1", "Team B2", "Team B3", "Team B4"};




    private String firstTeam,secondTeam;

        Random randInt = new Random();
    public void teamSelection() {
        int randomlyGeneratedGroupIndex = randInt.nextInt(2);
        String randomlyGeneratedGroup = groups[randomlyGeneratedGroupIndex];
        if(randomlyGeneratedGroup==groups[0]) {
            firstTeam = groupA[0];
            int randomTeamIndexFromGroupA = randInt.nextInt(3) + 1;
            String randomlyGeneratedTeamFromA = groupA[randomTeamIndexFromGroupA];
            if (randomlyGeneratedTeamFromA == groupA[0]) {
                secondTeam = groupA[0];
            } else if (randomlyGeneratedTeamFromA == groupA[1]) {
                secondTeam = groupA[1];
            } else {
                secondTeam = groupA[2];
            }
        }
       else {
            firstTeam = groupB[0];
            int randomTeamIndexFromGroupB = randInt.nextInt(3) + 1;
            String randomlyGeneratedTeamFromB = groupB[randomTeamIndexFromGroupB];
            if (randomlyGeneratedTeamFromB == groupB[0]) {
                secondTeam = groupB[0];
            } else if (randomlyGeneratedTeamFromB == groupB[1]) {
                secondTeam = groupB[1];
            } else {
                secondTeam = groupB[2];
            }

        }
        System.out.println("First Team Selected: "+ firstTeam);
        System.out.println("Second Team Selected: " + secondTeam);

    }
    //Getters and Setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }



    public String getFirstTeam() {
            return firstTeam;
        }

        public void setFirstTeam(String firstTeam) {
            this.firstTeam = firstTeam;
        }

        public String getSecondTeam() {
            return secondTeam;
        }

        public void setSecondTeam(String secondTeam) {
            this.secondTeam = secondTeam;
        }



    }


