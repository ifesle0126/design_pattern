package visitor;

public class CommandVisitor implements IVisitor {

    @Override
    public void upgradeCPU(Computer computer, String command) {
        computer.getCPU().addCommand(command);
    }

    @Override
    public void upgradeDisk(Computer computer, String command) {
        computer.getDisk().addCommand(command);
    }
}
