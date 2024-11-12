public class Adapter implements Bitcoin{
    private Ethereum ethereum;
    private Bitcoin bitcoin;
    private double value;

    public Adapter(Ethereum ethereum) {
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
