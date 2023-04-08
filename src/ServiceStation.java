public class ServiceStation {
    public void check(Car car, Truck truck, Bicycle bicycle) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                Transport.updateTyre();
            }
            Transport.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                Transport.updateTyre();
            }
            Transport.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
           for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                Transport.updateTyre();
           }
      }
   }
}
