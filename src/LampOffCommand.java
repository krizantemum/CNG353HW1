public class LampOffCommand implements Command{
    Light light;
    public LampOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
