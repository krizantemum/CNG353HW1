public class CityController {
    private static CityController controller = new CityController();
    private CityController() {}
    public static CityController getController() {
        return controller;
    }
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void invoke() {
        command.execute();
    }
}
