public class PublicUtilityServices {
    private static PublicUtilityServices utilityServices = new PublicUtilityServices();
    private PublicUtilityServices() {}
    public static PublicUtilityServices getUtility() {
        return utilityServices;
    }
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void invoke() {
        command.execute();
    }
}
