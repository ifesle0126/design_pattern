package bridge;

public class GoodsA extends AbstractGoods {

    private String name;
    private double price;

    public GoodsA(String name, double price, ISale sale) {
        super(sale);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
