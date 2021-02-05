package bridge;

public class Main {

    public static void main(String[] args) {
        OnlineSale online = new OnlineSale();
        OfflineSale offline = new OfflineSale();

        AbstractGoods aOnline = new GoodsA("AAA", 1D, online);
        AbstractGoods bOnline = new GoodsB("BBB", 2D, online);
        AbstractGoods aOffline = new GoodsA("AAA", 1.5D, offline);
        AbstractGoods bOffline = new GoodsB("BBB", 2.5D, offline);

        aOnline.sale();
        aOffline.sale();
        bOnline.sale();
        bOffline.sale();

    }
}
