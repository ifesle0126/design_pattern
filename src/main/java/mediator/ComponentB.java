package mediator;

public class ComponentB implements IComponent {

    private String name;
    private int priority;
    private String road;

    public ComponentB(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public void send(IMediator mediator) {
        String road = mediator.accept(this);
        this.road = road;
    }

    @Override
    public void run() {
        System.out.println(this.name + " landing on road " + this.road);
    }

    @Override
    public int getPriority() {
        return this.priority;
    }
}
