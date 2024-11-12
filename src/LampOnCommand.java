import javax.sound.sampled.Control;

public class LampOnCommand implements Command {
    Light light;
    public LampOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
