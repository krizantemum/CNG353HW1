public class TrafficManager implements Command{
    TrafficLights trafficLights;
    public TrafficManager(TrafficLights trafficLights) {
        this.trafficLights = trafficLights;
    }
    @Override
    public void execute() {
        trafficLights.maintenance();
    }
}
