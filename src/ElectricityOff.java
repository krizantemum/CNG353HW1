public class ElectricityOff implements Command{
    ElectricitySystem electricitySystem;

    public ElectricityOff(ElectricitySystem electricitySystem) {
        this.electricitySystem = electricitySystem;
    }

    @Override
    public void execute() {
        electricitySystem.on();
    }
}
