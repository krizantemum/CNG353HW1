public class CloudClient {
    private Cloud proxy;
    private Cloud invalidProxy;
    public CloudClient() {
        this.proxy = new ProxyCloud("key");
        this.invalidProxy = new ProxyCloud("wrongKey");
    }

    public void handleValidProxy() {
        proxy.uploadData("Traffic analyse datas for 6 PM");
        System.out.println("Fetched Data: " + proxy.fetchData());
        System.out.println("Fetched Data: " + proxy.fetchData());
    }

    public void handleInvalidProxy() {
        invalidProxy.uploadData("Traffic analyse datas for 6 PM");
        System.out.println("Fetched Data: " + invalidProxy.fetchData());
    }

}
