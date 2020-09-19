package ConsoleUI.Commands;

import UserBucket.UserBucket;

public class ShowBucketCommand implements ConsoleCommand {
    @Override
    public void execute() {
        UserBucket userBucket = UserBucket.getInstance();
        System.out.println(userBucket.getSummary());
    }
}
