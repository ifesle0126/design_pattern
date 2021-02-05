package composite;

public class Leaf implements ILeaf {

    private int count;

    public Leaf(int count) {
        this.count = count;
    }

    @Override
    public int count() {
        return count;
    }
}
