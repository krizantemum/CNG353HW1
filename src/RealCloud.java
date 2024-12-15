public class RealCloud implements Cloud{
    @Override
    public void uploadData(String data) {
        System.out.println("Uploading something to the cloud database: " + data);
    }

    @Override
    public String fetchData() {
        System.out.println("Fetching data from the cloud database");
        return "Fetched some data for you";
    }
}
