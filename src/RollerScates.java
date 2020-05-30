public class RollerScates implements Run  {

    RollerScates(){ }

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
        System.out.println("Человек на роликах - выехал.");
    }
}
