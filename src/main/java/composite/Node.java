package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node implements INode {

    private List<ICount> countList;
    private int count = 0;

    public Node(int count, ICount... iCounts) {
        this.count = count;
        countList = new ArrayList<>();
        Collections.addAll(countList, iCounts);
    }

    public Node(ICount... iCounts) {
        this.count = 0;
        countList = new ArrayList<>();
        Collections.addAll(countList, iCounts);
    }

    public void addNode(INode node) {
        if (countList == null) {
            countList = new ArrayList<>();
        }
        countList.add(node);
    }

    @Override
    public int sumCount() {
        int sum = this.count;
        for (ICount counter : countList) {
            sum += counter.count();
        }
        return sum;
    }

    @Override
    public int count() {
        int sum = this.count;
        for (ICount counter : countList) {
            sum += counter.count();
        }
        return sum;
    }
}
