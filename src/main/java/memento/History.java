package memento;

import java.util.Stack;

public class History {

    private Stack<Backup> stack = new Stack<>();

    public void add(Backup backup) {
        stack.add(backup);
    }

    public Backup pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }
}
