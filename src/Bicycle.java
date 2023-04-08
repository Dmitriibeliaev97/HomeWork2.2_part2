public class Bicycle extends Transport{

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            Transport.updateTyre();
        }
    }

}
