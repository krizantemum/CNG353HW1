import java.util.Objects;

public class ProxyCloud implements Cloud{
    private RealCloud realCloud;
    private String APIKey;
    private String cachedData;

    public ProxyCloud(String APIKey) {
        this.realCloud = new RealCloud();
        this.APIKey = APIKey;
    }

    private boolean authenticateUser() {
        return Objects.equals(this.APIKey, "key");
    }

    @Override
    public void uploadData(String data) {
        if(authenticateUser()) {
            System.out.println("Authentication successful");
            realCloud.uploadData(data);
        }
        else
            System.out.println("Authentication failed, access denied");

    }

    @Override
    public String fetchData() {
        if (!authenticateUser()) {
            System.out.println("Authentication failed, access denied");
            return null;
        }

        if (cachedData == null) {
            System.out.println("Cache is empty, fetching from cloud database");
            cachedData = realCloud.fetchData();
        } else {
            System.out.println("Returning cached data");
        }

        return cachedData;    }
}
