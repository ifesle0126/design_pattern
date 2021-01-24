package mediator;

public interface IComponent {

    void send(IMediator mediator);

    void run();

    int getPriority();

}
