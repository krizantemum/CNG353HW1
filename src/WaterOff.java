public class WaterOff implements Command{
    WaterSystem waterSystem;

    public WaterOff(WaterSystem waterSystem) {
        this.waterSystem = waterSystem;
    }

    @Override
    public void execute() {
        waterSystem.off();
    }
}
