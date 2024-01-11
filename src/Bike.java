public class Bike extends Vehicle {

    public Bike(String name) {
        super(name, "Pedalized");
    }

    @Override
    public void soundWarning() {
        System.out.println("Pling-pling");
    }
}
