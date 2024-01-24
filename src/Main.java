import java.util.Scanner;

public class Main {

    static final double GAME_VERSION = 1.0;

    public static void main(String[] args) {


        double userInput = Utils.getIntInput("What is 20+20?");
        if (userInput != 40) {
            System.out.println("Fel");
        } else {
            System.out.println("Rätt");
        }

    }
}