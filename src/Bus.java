public class Bus extends Mashine {

    int amount_of_pass;

    public Bus(String name, double weight, double maxSpeed) {
        super(name, weight, maxSpeed);
    }
    public Bus(String name, double weight, double maxSpeed, int passengersAmount) {
        this(name, weight, maxSpeed);
        this.amount_of_pass = passengersAmount;
    }

    public int getAmount_of_pass () {
        return amount_of_pass;
    }
}
