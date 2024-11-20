public class Adapter implements Crypto {
    private Fiat ethereum;
    private Crypto bitcoin;
    private double value;

    public Adapter(Fiat ethereum) {
        this.ethereum = ethereum;
    }

    @Override
    public double bitcoinValue() {
        value = ethereum.ethereumValue() * 24.91;
        return value;
    }

    @Override
    public void shareTranscript(double val) {
        System.out.println(val +" is the value");
    }
}
