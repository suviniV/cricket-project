package com.company;

import java.util.Random;

public class Toss {
    static final String[] tossPossibleOutputs = {"Heads", "Tails"};
    private String tossOutcome;

    public void tossGeneration() {

        Random rand = new Random();
        int tossOutcomeInt = rand.nextInt(2);
        tossOutcome = tossPossibleOutputs[tossOutcomeInt];
        System.out.println(tossOutcome);

    }

    public String getTossOutcome() {
        return tossOutcome;
    }
}
