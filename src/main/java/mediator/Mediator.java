package mediator;

public class Mediator implements IMediator {


    @Override
    public String accept(IComponent component) {
        int priority = component.getPriority();
        if (component instanceof ComponentA) {
            return "A" + priority;
        } else if (component instanceof ComponentB) {
            return "B" + priority;
        } else {
            throw new RuntimeException("wrong object");
        }
    }
}
