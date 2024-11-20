public class ElectricityOn implements Command{
    ElectricitySystem electricitySystem;

    public ElectricityOn(ElectricitySystem electricitySystem) {
        this.electricitySystem = electricitySystem;
    }

    @Override
    public void execute() {
        electricitySystem.on();
    }
}
