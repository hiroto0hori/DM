import java.util.Random;

public class Dice {

    public void playDiceGame() {
        System.out.println("Rolling Dice...");        
        Random random = new Random();
        int sum = 0;
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        sum = dice1 + dice2;
        System.out.println("Die 1 : "+dice1);
        System.out.println("Die 2 : "+dice2);
        System.out.println("Total : "+sum);
    }

    public static void main(String[] args) {
        Dice diceGame = new Dice();
        diceGame.playDiceGame();
    }
}
