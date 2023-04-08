public class Car extends Transport{

    @Override
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            Transport.updateTyre();
        }
        Transport.checkEngine();
    }

}
