import java.util.Random;
import java.util.Scanner;

public class Utils {

    static double getRandomPrice() {
        Random rnd = new Random();
        return rnd.nextInt(100, 999);
    }

    static boolean isInteger(String val) {
        return val.matches("-?\\d+");
    }

    static double getIntInput(String question) {
        Scanner strInput = new Scanner(System.in);

        while (true) {
            try {
                System.out.println(question);
                String userInput = strInput.nextLine();

                if (Utils.isInteger(userInput)) {
                    return Integer.parseInt(userInput);
                }

            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            } catch (Exception e) {
                System.out.println("Någonting gick fel");
            }
        }
    }

}
