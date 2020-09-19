package ConsoleUI.Commands;

import ConsoleUI.Menu;

import java.util.concurrent.atomic.AtomicInteger;

public class ShowMenuCommand implements ConsoleCommand {
    Menu menu = Menu.getInstance();

    @Override
    public void execute() {
        AtomicInteger i = new AtomicInteger(1);
        menu.getMenuList().forEach(m -> System.out.println(i.getAndIncrement() + ". " + m));
    }
}
