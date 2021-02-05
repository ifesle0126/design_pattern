package memento;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.add("1");
        doc.save();
        doc.add("2");

        System.out.println(doc.content());
        System.out.println(doc.resume());

    }
}
