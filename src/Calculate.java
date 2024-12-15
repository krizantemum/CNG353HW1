public class Calculate {
    private Strategy strategy;

    public Calculate(Strategy strategy){
        this.strategy = strategy;
    }

    public void algorithm(){
        strategy.algorithm();
    }
}
