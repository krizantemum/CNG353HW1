public class EthereumTransaction implements Ethereum {
    @Override
    public double ethereumValue() {
        return 0;
    }

    @Override
    public void shareTranscript(double val) {
        System.out.println(val +" is the value");
    }
}
