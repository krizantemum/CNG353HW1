import java.util.ArrayList;
import java.util.List;

public class SecuritySystem implements Observable{
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void addSubscriber(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void sendNotification() {
        for (Observer resident: observerList){
            resident.getSecurityNotification("seek closest shelter immediately!");
        }
    }
}
