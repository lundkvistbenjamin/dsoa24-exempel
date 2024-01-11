public class Car extends Vehicle {

    public Car(String name) {
        super(name, "Motorized");
    }

    @Override
    public void soundWarning() {
        System.out.println("Tut-tut");
    }

}
