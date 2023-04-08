public class Truck extends Transport{

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            Transport.updateTyre();
        }
        Transport.checkEngine();
        truck.checkTrailer();
    }
}
