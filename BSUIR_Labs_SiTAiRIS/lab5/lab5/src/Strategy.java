interface Strategy {
    Double getPrice(Double price);
}
class FullPrice implements Strategy {
    @Override
    public Double getPrice(Double price) {
        return price;
    }
}
class HalfPrice implements Strategy {
    @Override
    public Double getPrice(Double price) {
        return price * 0.5;
    }
}
class ContextStrategy {
    Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Double getPrice(Double price) {
        return strategy.getPrice(price);
    }
}

