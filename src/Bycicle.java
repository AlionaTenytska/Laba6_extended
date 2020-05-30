public class Bycicle implements Run {
    int id;

    Bycicle(){}

    public void setId(int id){
        this.id=id;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getMaxSpeed() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("Велосипед - выехал.");
    }
}
