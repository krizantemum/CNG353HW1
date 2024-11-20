public class Residents implements Observer{

    private String name;
    private String surname;

    public Residents(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void getSecurityNotification(String message) {
        System.out.println(name + " " + surname + " " + message + " Seek shelter immediately!");
    }
}
