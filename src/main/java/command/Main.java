package command;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> doc = new ArrayList<>();
        Read r = new Read(doc);
        Write w = new Write(doc);
        w.write("111").write("222").execute();
        r.index(1).execute();
    }
}
