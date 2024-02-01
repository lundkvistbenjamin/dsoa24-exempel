import java.io.Serializable;

abstract class Vehicle implements Serializable {
    // Super class oftast abstract!


    // Vi deklarerar instansvariabeln name
    private String name;
    private String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void soundWarning() {
        System.out.println("Default sound");
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
