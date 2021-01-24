package visitor;

import java.util.LinkedList;
import java.util.List;

public class CPU implements HardWare {

    private List<String> commands;

    public CPU(String command) {
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
        System.out.println("cpu run command");
        for (String commmand : this.commands) {
            System.out.println("cpu: " + commmand);
        }
    }

    @Override
    public void update(String command) {
        addCommand(command);
    }
}
