public class Main {
    public static void main(String[] args) {

        // Instansiering av objekt
        Car car = new Car("Toyota");

        Bike bike = new Bike("Nishiki");

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
    }
}