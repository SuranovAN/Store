package ConsoleUI;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static Menu menu;
    private final List<String> menuList = new ArrayList<>();
    private final List<String> filterList = new ArrayList<>();

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    private Menu() {
        menuList.add("Вывести список доступных продуктов");
        menuList.add("Вывести список фильтров");
        menuList.add("добавить продукты в корзину");
        menuList.add("Посмотреть корзину");
        menuList.add("сформировать заказ");
        menuList.add("повторить последний заказ");
        menuList.add("Выход");

        filterList.add("Фильтрация по Производителю");
        filterList.add("Фильтрация по Наименованию продукта");
        filterList.add("Фильтрация по цене продукта");
        filterList.add("Фильтрация по типу продукта");
        filterList.add("Вернуться к списку меню");
    }

    public List<String> getMenuList() {
        return menuList;
    }

    public List<String> getFilterList() {
        return filterList;
    }
}
