abstract public class Transport {
    private   String modelName;
    private int wheelsCount;

    public static void updateTyre() { System.out.println("Меняем покрышку");

    }

    static void checkEngine() {
        System.out.println("Проверяем двигатель");
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

    public abstract void check();
}
