package visitor;

public interface IVisitor {

    void upgradeCPU(Computer computer, String command);

    void upgradeDisk(Computer computer, String command);

}
