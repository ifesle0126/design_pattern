package composite;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Leaf l1 = new Leaf(10);
        Leaf l2 = new Leaf(20);
        Node n2 = new Node(l1, l2);
        Node n3 = new Node(100);
        n1.addNode(n2);
        n1.addNode(n3);

        System.out.println(n1.sumCount());
    }
}
