import java.util.ArrayList;
import java.util.List;

public interface Observable {
    List<Observer> observerList = new ArrayList<>();
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void sendNotification();
}
