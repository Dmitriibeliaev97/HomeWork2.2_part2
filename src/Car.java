public class Car extends Transport{

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

    @Override
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            UpdateTyre.updateTyre();
        }
        UpdateTyre.checkEngine();
    }

    @Override
    public void check(Bicycle bicycle) {

    }

    @Override
    public void check(Truck truck) {

    }
}
