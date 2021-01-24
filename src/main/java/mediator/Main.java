package mediator;

public class Main {
    public static void main(String[] args) {
        ComponentA A = new ComponentA("A", 2);
        ComponentB B = new ComponentB("B", 4);
        Mediator mediator = new Mediator();
        A.send(mediator);
        B.send(mediator);
        A.run();
        B.run();
    }

}
