package ConsoleUI;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Switch {
    private final Map<String, ConsoleCommand> commandMap = new HashMap<>();
//    private List<ConsoleCommand> consoleCommandsList = new ArrayList<>();

    public void register(String commandName, ConsoleCommand consoleCommand) {
        commandMap.put(commandName,consoleCommand);
    }

    public void execute(String commandName) {
        ConsoleCommand consoleCommand = commandMap.get(commandName);
        if (commandName == null) {
            throw new IllegalStateException("такой команды нет ");
        }
        consoleCommand.execute();
    }

    public Map<String, ConsoleCommand> getCommandMap() {
        return commandMap;
    }

    public void printMap(){
        AtomicInteger i = new AtomicInteger(1);
        commandMap.forEach((key, value) -> System.out.println(i.getAndIncrement() + ". " + key));
    }
}
