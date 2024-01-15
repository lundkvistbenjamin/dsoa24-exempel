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
}
