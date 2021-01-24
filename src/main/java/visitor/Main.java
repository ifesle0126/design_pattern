package visitor;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("1");
        Disk disk = new Disk("a");
        Computer computer = new Computer(cpu, disk);
        computer.run();
        CommandVisitor visitor = new CommandVisitor();
        visitor.upgradeCPU(computer, "2");
        visitor.upgradeDisk(computer, "b");
        computer.run();
    }
}
