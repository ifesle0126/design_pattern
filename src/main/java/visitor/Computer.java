package visitor;

public class Computer {

    private CPU cpu;
    private Disk disk;

    public Computer(CPU cpu, Disk disk) {
        this.cpu = cpu;
        this.disk = disk;
    }

    public void run() {
        this.cpu.run();
        this.disk.run();
    }

    public CPU getCPU() {
        return cpu;
    }

    public Disk getDisk() {
        return disk;
    }
}
