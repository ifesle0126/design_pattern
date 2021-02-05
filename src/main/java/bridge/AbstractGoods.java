package bridge;

public abstract class AbstractGoods implements IGoods {

    private ISale iSale;

    public AbstractGoods(ISale iSale) {
        this.iSale = iSale;
    }

    public void sale() {
        iSale.doSale(this);
    }
}
