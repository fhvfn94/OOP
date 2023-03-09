package Transport;

public class Transport extends ServiceStation{
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.setModelName(modelName);
        this.setWheelsCount(wheelsCount);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
