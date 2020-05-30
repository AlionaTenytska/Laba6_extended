public class Main {
    public static void main(String[] args) {

        int size = 8;
        int limitVehicle = 10;
        Server server = new Server(size,limitVehicle);

        while (server.getCurrentCountVehicle() < server.getLimitVehicle())
        {
            int number = (int) (Math.random()*size);
            switch(number)
            {
                case 0:{
                    server.addTransport(0, new Car());
                }
                case 1:{
                    server.addTransport(1, new Bycicle());
                }
                case 2:{
                    server.addTransport(2, new RollerScates());
                }
                case 3:{
                    server.addTransport(3, new Jumpers());
                }
                case 4: {
                    server.addTransport(4,  new Bus("Богдан", 15000, 150));
                }
                case 5: {
                    server.addTransport(5, new TraсtorCrawler("Tractor", 12000, 60,"Crawler"));
                }
                case 6: {
                    server.addTransport(6, new TraсtorWheeled("Tractor", 20000, 50, "Wheeled"));
                }
            }
        }
        System.out.println();
        int[] countVehicles = server.getCountVehicles();

        for(int i = 0; i < 10; i++)
        {
            switch(i)
            {
                case 0:{
                    System.out.println("Машин -  " + countVehicles[i]);
                    break;
                }
                case 1:{
                    System.out.println("Велосипедов - " + countVehicles[i]);
                    break;
                }
                case 2:{
                    System.out.println("Человеков на роликах - " + countVehicles[i]);
                    break;
                }
                case 3:{
                    System.out.println("Джамперов - " + countVehicles[i]);
                    break;
                }
                case 4:{
                    System.out.println("Автобус - " + countVehicles[i]);
                    break;
                }
                case 5:{
                    System.out.println("TraсtorCrawler - " + countVehicles[i]);
                    break;
                }
                case 6:{
                    System.out.println("TraсtorWheeled - " + countVehicles[i]);
                    break;
                }
            }
        }
    }
}
