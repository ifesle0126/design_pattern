package visitor;

import java.util.LinkedList;
import java.util.List;

public class Disk implements HardWare {

    private List<String> commands;

    public Disk(String command) {
        addCommand(command);
    }

    public void addCommand(String command) {
        if (this.commands == null) {
            commands = new LinkedList<>();
        }
        this.commands.add(command);
    }

    @Override
    public void run() {
        System.out.println("disk run command");
        for (String command : this.commands) {
            System.out.println("disk:" + command);
        }
    }

    @Override
    public void update(String command) {
        addCommand(command);
    }
}
