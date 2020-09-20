package consoleUI.commands;

import usersbucket.UsersBucket;

public abstract class FormOrderCommand implements ConsoleCommand {
    UsersBucket userBucket = UsersBucket.getInstance();

    @Override
    public void execute() {

    }

    abstract void orderForm(String FIO, String address, String phone);

    abstract void payOrder(String cardNumber, String date);

    abstract void decreaseCountFromDB();

    abstract void writeLastOrderToFile(String filePath);
}
