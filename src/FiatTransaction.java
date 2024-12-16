public class FiatTransaction implements Fiat {
    @Override
    public String fiatValue() {
        return "Fiat value";
    }

    @Override
    public void shareTranscript(String val) {
        System.out.println(val +" is the value");
    }
}
