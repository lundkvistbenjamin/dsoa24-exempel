public class Main {
    public static void main(String[] args) {

        // Instansiering av objekt
        Car car = new Car("Toyota");
        Car anotherCar = new Car("Ford");

        // Skriv ut namnet via getter-metoden
        System.out.println(car.getName());

        // Getter och setter
        System.out.println(anotherCar.getName());
        anotherCar.setName("Fiat");
        System.out.println(anotherCar.getName());

    }
}