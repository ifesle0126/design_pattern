package command;

import java.util.List;

public class Write implements IExecute {

    private List<String> contentList;

    public Write(List<String> contentList) {
        this.contentList = contentList;
    }

    public Write write(String content) {
        contentList.add(content);
        return this;
    }

    @Override
    public void execute() {
        for (String content : contentList) {
            System.out.println(content);
        }
    }
}
