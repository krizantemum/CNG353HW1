
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        WaterSystem waterSystem = new WaterSystem();
        TrafficLights trafficLights = new TrafficLights();
        CityController cityController = CityController.getController();
        Observable observable = new SecuritySystem();

        Observer observer =  new Residents("Yurekce", "Altin");
        observable.addSubscriber(observer);
        observer =  new Residents("Emre", "Altinok");
        observable.addSubscriber(observer);
        observer =  new Residents("Ali Dogac", "Duman");
        observable.addSubscriber(observer);
        observer =  new Residents("Onur", "Oney");
        observable.addSubscriber(observer);
        observer =  new Residents("Ardahan", "Bilcan");
        observable.addSubscriber(observer);

        cityController.setCommand(new WaterOn(waterSystem));
        cityController.invoke();

        cityController.setCommand(new WaterOff(waterSystem));
        cityController.invoke();

        cityController.setCommand(new LampOnCommand(light));
        cityController.invoke();

        cityController.setCommand(new LampOffCommand(light));
        cityController.invoke();

        cityController.setCommand(new TrafficManager(trafficLights));
        cityController.invoke();

        observable.sendNotification();

    }

}