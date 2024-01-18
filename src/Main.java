import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final double GAME_VERSION = 1.0;

    public static void main(String[] args) {

        // Vehicles

        // Instansiering av objekt
        Car car = new Car("Toyota");

        Bike bike = new Bike("Nishiki", 500);
        Bike bike2 = new Bike("KTM", 1000);

        Vehicle todaysRide = new Car("Ford");
        System.out.println(todaysRide.getName());
        // i morgon...
        todaysRide = new Bike("Jopo");
        System.out.println(todaysRide.getName());

        // Skriv ut namnet via getter-metoden
        System.out.println(car.getName() + " (" + car.getType() + ")");
        car.soundWarning();

        System.out.println(bike.getName() + " (" + bike.getType() + ")");
        bike.soundWarning();

        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(bike);
        bikeShop.addBike(bike2);

        for (int i = 0; i < bikeShop.getBikes().size(); i++) {
            System.out.printf("%d %s %.2f\n",
                    i,
                    bikeShop.getBikes().get(i).getName(),
                    bikeShop.getBikes().get(i).getPrice());
        }

        // Clothing

        Shirt nikeShirt = new Shirt("Nike", "Black", 49.90);
        System.out.println(("Brand: " + nikeShirt.getBrand()));
        System.out.println(("Color: " + nikeShirt.getColor()));
        System.out.println(("Price: " + nikeShirt.getPrice()));

        Shirt pumaShirt = new Shirt("Puma", "Grey", 29.90);
        System.out.println(("Brand: " + pumaShirt.getBrand()));
        System.out.println(("Color: " + pumaShirt.getColor()));
        System.out.println(("Price: " + pumaShirt.getPrice()));

        System.out.println(nikeShirt.getCondition());

        // Calculator, Scanner och Random

        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        Random random = new Random();

        System.out.println(random.nextInt(99));
        System.out.println(random.nextInt(100, 999));

        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(2, 2));
        System.out.println(calculator.multiply(2, 2, 2));

        //System.out.printf("Skriv ditt namn: ");
        // String userName = strInput.nextLine();
        //System.out.printf("Hej %s!\n", userName);


        while (true) {
            try {
                System.out.printf("Skriv ett tal att multiplicera med 5: ");
                // Integer.parseInt() konverterar text till heltal
                int userIntInput = Integer.parseInt(strInput.nextLine());
                System.out.printf("Svaret är %.0f\n",
                        calculator.multiply(userIntInput, 5));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal!");
            } catch (Exception e) {
                System.out.println("Något gick fel");
            }
        }

        // Code Challenge: Random Rundown



    }
}