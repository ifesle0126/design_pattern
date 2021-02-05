package bridge;

public class OnlineSale implements ISale {

    @Override
    public void doSale(IGoods goods) {
        System.out.println("online sale: " + goods.getName() + " " + goods.getPrice());
    }
}
