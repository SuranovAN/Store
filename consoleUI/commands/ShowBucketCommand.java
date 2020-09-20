package consoleUI.commands;

import usersbucket.UsersBucket;

public class ShowBucketCommand implements ConsoleCommand {
    @Override
    public void execute() {
        UsersBucket userBucket = UsersBucket.getInstance();
        System.out.println(userBucket.getSummary());
    }
}
