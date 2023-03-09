package Transport;

public class ServiceStation implements TransportMethods {
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void checkTruck(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
    @Override
    public void checkCar(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }
    @Override
    public void checkBicycle(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
    @Override
    public void checkTransport(Transport[] transports) {

    }
}
