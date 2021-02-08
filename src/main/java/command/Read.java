package command;

import java.util.List;

public class Read implements IExecute {

    private List<String> contentList;
    private int index;

    public Read(List<String> contentList) {
        this.contentList = contentList;
        this.index = 0;
    }

    public Read index(int index) {
        this.index = index;
        return this;
    }

    @Override
    public void execute() {
        for (int i = index; i < contentList.size(); i++) {
            System.out.println(contentList.get(i));
        }
    }
}
