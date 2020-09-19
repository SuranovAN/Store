package ConsoleUI.Commands;

import UserBucket.UserBucket;

public abstract class FormOrderCommand implements ConsoleCommand {
    UserBucket userBucket = UserBucket.getInstance();

    @Override
    public void execute() {

    }

    abstract void orderForm(String FIO, String address, String phone);

    abstract void payOrder(String cardNumber, String date);

    abstract void decreaseCountFromDB();

    abstract void writeLastOrderToFile(String filePath);
}
