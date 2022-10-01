package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Match {


        private int wickets = 0;
        private int finalScore = 0;
        private int totalRuns = 0;
        private int overs = 20;
        final int maximumScore = 720;
        String[] arr;

        int runsScored = 0;

       //array list to store all the scores of batsman scored during each match
        static List<Integer> scoresOfEachBatsman = new ArrayList<Integer>();



        Random random = new Random();

        public void match() {

            String[] outcome = {"out", "score=1", "score=2", "score = 3", "score=4", "score=5", "score=6"};
            String[] typesOfDismissal = {"Caught", "Bowled", "Leg Before Wicket", "Run Out", "Stumped"};
            Random random = new Random();
            for (int i = 1; i < 121; i++) {
                int outcomeInt = random.nextInt(7);
                String outcomeChoice = outcome[outcomeInt];
                System.out.println(outcomeChoice);

                if (outcomeChoice == outcome[0]) {
                    wickets += 1;
                    int methodOfDismissal = random.nextInt(5);
                    String outcomeMethodOfDismissal = typesOfDismissal[methodOfDismissal];
                    System.out.println("wicket due to: " + outcomeMethodOfDismissal);
                    scoresOfEachBatsman.add(runsScored);
                    System.out.println(scoresOfEachBatsman);
                    runsScored = 0;
                } else if (outcomeChoice == outcome[1]) {
                    totalRuns += 1;
                    runsScored += 1;
                    // finalScore += totalRuns;
                    System.out.println("Runs scored during the " + i + " ball is 1 ");
                } else if (outcomeChoice == outcome[2]) {
                    totalRuns += 2;
                    runsScored += 2;
                    //finalScore +=totalRuns;
                    System.out.println("Runs scored during the " + i + " ball is 2");

                } else if (outcomeChoice == outcome[3]) {
                    totalRuns += 3;
                    runsScored += 3;
                    //finalScore += 3;
                    System.out.println("Runs scored during the " + i + " ball is 4");
                } else if (outcomeChoice == outcome[4]) {
                    totalRuns += 4;
                    runsScored += 4;
                    //finalScore +=4;
                    System.out.println("Runs scored during the " + i + " ball is 4");
                } else if (outcomeChoice == outcome[5]) {
                    totalRuns += 5;
                    runsScored += 5;
                    // finalScore += +5;
                    System.out.println("Runs scored during the " + i + " ball is: 5");
                } else {
                    totalRuns += 6;
                    runsScored += 6;
                    //finalScore += 6;
                    System.out.println("Runs scored during the " + i + " ball is: 6");
                }
                if (i % 6 == 0) {
                    overs -= 1;
                    System.out.println("Remaining overs: " + overs);
                    System.out.println("Total Wickets: " + wickets);
                    System.out.println("Current Score: " + totalRuns);
                }
                if (wickets == 10 || overs == 0) {
                    break;
                } else {
                    continue;
                }
            }
            Collections.sort(scoresOfEachBatsman);

            System.out.println("----------------------------------------Displaying Match Summary: -------------------------------------------");
            System.out.println("Total Wickets: " + wickets + " Total score scored: " + totalRuns);

        }

//    private int wickets = 0;
//    private int finalScore = 0;
//    private int totalRuns = 0;
//    private int overs = 20;
//    final int maximumScore =720;
//    String[] outcome = {"not out","out"};
//    String[] typesOfDismissal = {"Caught", "Bowled", "Leg Before Wicket", "Run Out", "Stumped"};
//    int runsScored = 0;
//    ;
//    //List<Integer> allRunsScored = new ArrayList<~>();
//    List<Integer> scoresOfEachBatsman = new ArrayList<Integer>();
//
//
//    Random random = new Random();
//    public int match() {
//
//    }
//

        public int getMaximumScore() {
            return maximumScore;
        }

        public int getWickets() {
            return wickets;
        }

        public void setWickets(int wickets) {
            this.wickets = wickets;
        }

        public int getFinalScore() {
            return finalScore;
        }

        public void setFinalScore(int finalScore) {
            this.finalScore = finalScore;
        }

        public int getTotalRuns() {
            return totalRuns;
        }

        public void setTotalRuns(int totalRuns) {
            this.totalRuns = totalRuns;
        }

        public int getOvers() {
            return overs;
        }

        public void setOvers(int overs) {
            this.overs = overs;
        }
    }

