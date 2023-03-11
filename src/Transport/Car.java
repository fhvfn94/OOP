package Transport;

public class Car extends Transport implements TransportMethods {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля");
    }

    @Override
    public void check() {
        System.out.println("Проверяем двигатель");
    }
}
