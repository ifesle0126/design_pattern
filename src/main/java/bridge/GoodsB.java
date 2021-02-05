package bridge;

public class GoodsB extends AbstractGoods {

    private String name;
    private double price;

    public GoodsB(String name, double price, ISale iSale) {
        super(iSale);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
