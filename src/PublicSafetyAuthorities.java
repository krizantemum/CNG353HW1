public class PublicSafetyAuthorities implements Observer {

    @Override
    public void getSecurityNotification(String message) {
        System.out.println(message);
    }
}
