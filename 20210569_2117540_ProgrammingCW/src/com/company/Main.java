package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Toss.tossPossibleOutputs;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	System.out.println(
                    "-----------------------Welcome to T20 Cricket Tournament!!!!!----------------------\n" +
                            "Option 1: Edit/View Player Information\n" +
                            "Option 2: Generate random match between 2 Teams\n" +
                            "Option 3:Exit ");
            System.out.println("");
//            System.out.println("Enter the required option to Start!!: ");
//            int optionChoiceOfTheUser = scan.nextInt();

//            switch(optionChoiceOfTheUser){
//                case 1:
//                    //editPlayer();
//                    break;
//                case 2:
//
//
//
        ArrayList<CricketPlayer> playerInfo = new ArrayList<>("");



























            String firstBattingTeam,secondBattingTeam;
            //Randomly Generating the Teams for a match
            Team teamSelection1 = new Team();
            teamSelection1.teamSelection();

            //Randomly Generating the Toss Outcome
            Toss t1 = new Toss();
            t1.tossGeneration();
            if (t1.getTossOutcome() == tossPossibleOutputs[0]) {
                System.out.println(teamSelection1.getFirstTeam() + " will bat first");
                firstBattingTeam = teamSelection1.getFirstTeam();
                secondBattingTeam = teamSelection1.getSecondTeam();

            }
            else {
                System.out.println(teamSelection1.getSecondTeam() + " will bat first");
                firstBattingTeam = teamSelection1.getSecondTeam();
                secondBattingTeam = teamSelection1.getFirstTeam();
            }
            System.out.println("-------------------------------------------------First Innings---------------------------------------------------");
            Match firstInnings = new Match();
            firstInnings.match();
            System.out.println("");
            System.out.println("------------------------------------------------Second Innings---------------------------------------------------");
            Match secondInnings = new Match();
            secondInnings.match();
            //Finding the team that won
            int scoreOfFirstBattingTeam = firstInnings.getTotalRuns();
            int scoreOfSecondBattingTeam = secondInnings.getTotalRuns();
            System.out.println("------------------------------------------Displaying Team that Won---------------------------------------------------");
            if(scoreOfFirstBattingTeam>scoreOfSecondBattingTeam){
                System.out.println(firstBattingTeam+" won the match!!!!");
            }
            else if (scoreOfFirstBattingTeam<scoreOfSecondBattingTeam){
                System.out.println(secondBattingTeam +"  won the match!!!!");

            }
            else{
                System.out.println("It's a tie!!!");

            }







        }





    }

