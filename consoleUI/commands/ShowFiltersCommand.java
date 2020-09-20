package consoleUI.commands;

import consoleUI.Menu;

import java.util.concurrent.atomic.AtomicInteger;

public class ShowFiltersCommand implements ConsoleCommand {
    Menu menu = Menu.getInstance();

    @Override
    public void execute() {
        AtomicInteger i = new AtomicInteger(1);
        menu.getFilterList().forEach(f -> System.out.println(i.getAndIncrement() + ". " + f));
    }
}
