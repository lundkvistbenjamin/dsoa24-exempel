import java.util.Random;

public class Bike extends Vehicle {

    private double price = 0;

    public Bike(String name) {
        super(name, "Pedalized");
    }

    public Bike(String name, double price) {
        super(name, "Pedalized");
        this.price = price;
    }

    @Override
    public void soundWarning() {
        System.out.println("Pling-pling");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        try {
            if (price <= 0) throw new IllegalArgumentException();
            this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println("Priset måste vara positivt!");
        }
    }

    // Static factory method
    static Bike createRandomBike(String name) {
        // Random rnd = new Random();
        return new Bike(name, Utils.getRandomPrice() + 100);
    }

    static Bike createExpensiveRandomBike(String name) {
        // Random rnd = new Random();
        return new Bike(name, (new Random()).nextInt(800, 1500));
    }

}
