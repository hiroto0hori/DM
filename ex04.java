import java.util.Random;
import java.util.Scanner;

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
        if (sum >= 7) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
    public void whatYourName() {
        Scanner scannner = new Scanner(System.in);
        System.out.println("あなたの名前は何ですか？");
        String name = scannner.next();
        System.out.println("こんにちは！"+ name +"さん");
    }
    public static void main(String[] args) {
        Dice diceGame = new Dice();
        Dice yourName = new Dice();
        yourName.whatYourName();
        diceGame.playDiceGame();
    }
}
