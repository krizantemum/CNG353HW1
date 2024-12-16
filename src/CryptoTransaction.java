public class CryptoTransaction implements Crypto {

    @Override
    public String bitcoinValue() {return "Crypto bitcoin value";}

    @Override
    public void shareTranscript(String val) {System.out.println(val +" is the value");}
}
