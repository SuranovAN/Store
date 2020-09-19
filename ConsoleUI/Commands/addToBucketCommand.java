package ConsoleUI.Commands;

import Logs.ConsoleLogger;
import Product.ProductEntity;
import Product.ProductsDB;
import UserBucket.UserBucket;

import java.util.Scanner;

public class addToBucketCommand implements ConsoleCommand {
    UserBucket userBucket = UserBucket.getInstance();
    ProductsDB productsDB = ProductsDB.getInstance();

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите через пробел id товара и количество или пустую строку для возврата в меню");
            String str = scanner.nextLine();
            if ("".equals(str)){
                break;
            }
            String[] arr = str.split(" ");
            ProductEntity productEntity = productsDB.getProductsList()
                    .stream()
                    .filter((p -> p.getId() == Integer.parseInt(arr[0]))).findFirst().get();
            userBucket.getBucket().add(productEntity);
            new ConsoleLogger().log(arr[1] + "\n");
            userBucket.getSummary()
                    .append(productEntity.getName())
                    .append(" x ")
                    .append(arr[1])
                    .append(" ")
                    .append("= ")
                    .append(Integer.parseInt(arr[1]) * productEntity.getPrice())
                    .append("\n");
            System.out.println("Позиция добавлена");
        }
    }
}