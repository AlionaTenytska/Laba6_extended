public class Car implements Run{
    int id;
    Car(){
    }

    public void setID(int id){
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
        System.out.println("Автомобиль  - выехал.");
    }
}
