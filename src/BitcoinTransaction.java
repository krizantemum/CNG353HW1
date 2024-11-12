public class BitcoinTransaction implements Bitcoin{

    @Override
    public double bitcoinValue() {return 0;}

    @Override
    public void shareTranscript(double val) {System.out.println(val +" is the value");}
}
