package memento;

public class Document {

    private StringBuilder content;
    private History history;

    public Document() {
        this.content = new StringBuilder();
        this.history = new History();
    }

    public void add(String s) {
        content.append(s);
    }

    public void save() {
        history.add(new Backup(content.toString()));
    }

    public String resume() {
        String content = history.pop().getContent();
        this.content = new StringBuilder(content);
        return content;
    }

    public String content() {
        return content.toString();
    }
}
