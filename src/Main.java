import Transport.Transport;
import Transport.Truck;
import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("b1", 2);
        Bicycle bicycle2 = new Bicycle("b2", 2);
        Car car = new Car("C1", 4);
        Car car2 = new Car("C2", 4);
        Truck truck = new Truck("T1", 6);
        Truck truck2 = new Truck("T2", 8);
        Transport[] transports = {bicycle,car2, truck2};
        for (Transport transport : transports) {
            System.out.println(transport);
        }
    }
}