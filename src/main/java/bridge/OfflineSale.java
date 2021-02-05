package bridge;

public class OfflineSale implements ISale {

    @Override
    public void doSale(IGoods goods) {
        System.out.println("offline sale: " + goods.getName() + " " + goods.getPrice());
    }
}
