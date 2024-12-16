public class Adapter implements Crypto {

    private Crypto crypto;

    public Adapter(Crypto crypto) {
        this.crypto = crypto;
    }

    @Override
    public String bitcoinValue() {
        return crypto.bitcoinValue() + "Converted to crypto now";
    }

    @Override
    public void shareTranscript(String val) {
        System.out.println(val +" is the value");
    }
}
