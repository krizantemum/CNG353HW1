public class WaterOn implements Command{
    WaterSystem waterSystem;

    public WaterOn(WaterSystem waterSystem) {
        this.waterSystem = waterSystem;
    }

    @Override
    public void execute() {
        waterSystem.on();
    }
}
