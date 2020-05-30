public class Tractor extends Mashine {
    String type;

    public Tractor(String name, double weight, double maxSpeed) {
        super(name, weight, maxSpeed);
    }

    public Tractor(String name, double weight, double maxSpeed, String type) {
        this(name, weight, maxSpeed);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
