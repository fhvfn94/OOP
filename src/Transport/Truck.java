package Transport;

public class Truck extends Car{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        System.out.println("Проверяем прицеп");
        System.out.println("Проверяем двигатель");
    }
}
