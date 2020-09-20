package logs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BucketLogger implements Logger, CleanerLogs {

    @Override
    public void log(String msg) {
        String filePath = "src\\Source\\Logs";
        File file = new File(filePath);
        try (FileWriter fw = new FileWriter(file, true)) {
            try {
                fw.write(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void clean() {
        String filePath = "src\\Source\\Logs";
        File file = new File(filePath);
        try (FileWriter fw = new FileWriter(file, false)) {
            fw.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
