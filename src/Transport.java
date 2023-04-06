abstract public class Transport {
    protected  String modelName;
    protected int wheelsCount;

    public abstract void check(Car car);

    public abstract void check(Bicycle bicycle);

    public abstract void check(Truck truck);
}
