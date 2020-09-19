package Logs;

import UserBucket.UserBucket;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleLogger implements Logger {
    UserBucket userBucket = UserBucket.getInstance();

    @Override
    public void log(String msg) {
        String filePath = "src\\Source\\Logs";
        File file = new File(filePath);
        try (FileWriter fw = new FileWriter(file, true)) {
            userBucket.getBucket().forEach(p -> {
                try {
                    fw.write(p.toString() + " в колличестве " + msg);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearLog() throws IOException {
        String filePath = "src\\Source\\Logs";
        File file = new File(filePath);
        try (FileWriter fw = new FileWriter(file, false)) {
            fw.write("");
        }
    }
}
