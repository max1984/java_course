package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String args[]) {
        int entireBordSize = 20;
        int rollsDieCount = 5;
        Random random = new Random();
        int advanceInGame = 0;

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for (int i = 0; i < rollsDieCount; i++) {
            int die = random.nextInt(6) + 1;
            advanceInGame += die;
            System.out.print("Roll #" + (i + 1) + ": You've rolled a " + die + ". ");
            if (advanceInGame == entireBordSize) {
                System.out.println("You have won !!! ");
                break;
            } else if (advanceInGame > entireBordSize) {
                System.out.println("Unfortunately, that takes you past " + entireBordSize + " spaces. You lose!");
                break;
            } else if (i == (rollsDieCount - 1) && advanceInGame < entireBordSize) {
                System.out.println("You're on space " + advanceInGame + ".");
                System.out.println("Unfortunately, you didn't make it to all " + entireBordSize + " spaces. You lose!");
            } else {
                System.out.println("You are now on space "
                        + advanceInGame + " and have " + (entireBordSize - advanceInGame) + " more to go.");
            }
        }
    }
}
