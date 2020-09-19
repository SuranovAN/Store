package ConsoleUI.Commands;

import Filters.FilterByManufacturer;
import Filters.FilterByName;
import Filters.FilterByPrice;
import Filters.FilterByType;

import java.util.Scanner;

public class FilterCommand implements ConsoleCommand {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        while (true) {
            System.out.println("Выберите тип фильтра или 5 для выхода");
            int i = Integer.parseInt(scanner.nextLine());
            switch (i) {
                case 1:
                    System.out.println("Введите наименование производителя");
                    String manufacturerName = scanner.nextLine();
                    new FilterByManufacturer().filter(manufacturerName.toLowerCase());
                    break;
                case 2:
                    System.out.println("Введите наименование продукта");
                    String productName = scanner.nextLine();
                    new FilterByName().filter(productName.toLowerCase());
                    break;
                case 3:
                    System.out.println("Введите максимальную сумму продукта");
                    String productPrice = scanner.nextLine();
                    new FilterByPrice().filter(productPrice);
                    break;
                case 4:
                    System.out.println("Введите тип продукта");
                    String typeName = scanner.nextLine();
                    new FilterByType().filter(typeName.toLowerCase());
                    break;
                case 5:
                    break;
            }
            if (i == 5) {
                break;
            }
        }
    }
}
