
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Observer authorities = new PublicSafetyAuthorities();
        WaterSystem waterSystem = new WaterSystem();
        ElectricitySystem electricitySystem = new ElectricitySystem();
        TrafficLights trafficLights = new TrafficLights();
        CityController cityController = CityController.getController();
        Observable observable = new SecuritySystem();
        PublicUtilityServices utilityServices = PublicUtilityServices.getUtility();
        CloudClient client = new CloudClient();
        client.handleValidProxy();
        client.handleInvalidProxy();

        observable.addSubscriber(authorities);

        Observer observer =  new Residents("Yurekce", "Altin");
        observable.addSubscriber(observer);
        observer =  new Residents("Emre", "Altinok");
        observable.addSubscriber(observer);
        observer =  new Residents("Ali Dogac", "Duman");
        observable.addSubscriber(observer);
        observer =  new Residents("Onur", "Oney");
        observable.addSubscriber(observer);
        observer =  new Residents("Ardahan", "Bilican");
        observable.addSubscriber(observer);

        utilityServices.setCommand(new WaterOn(waterSystem));
        utilityServices.invoke();

        utilityServices.setCommand(new WaterOff(waterSystem));
        utilityServices.invoke();

        utilityServices.setCommand(new ElectricityOn(electricitySystem));
        utilityServices.invoke();

        utilityServices.setCommand(new ElectricityOff(electricitySystem));
        utilityServices.invoke();

        cityController.setCommand(new LampOnCommand(light));
        cityController.invoke();

        cityController.setCommand(new LampOffCommand(light));
        cityController.invoke();

        cityController.setCommand(new TrafficManager(trafficLights));
        cityController.invoke();

        observable.sendNotification();

    }

}