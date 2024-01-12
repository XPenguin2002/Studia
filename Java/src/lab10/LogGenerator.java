package lab10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogGenerator extends Thread {
    private final String logFileName;

    public LogGenerator(String logFileName) {
        this.logFileName = logFileName;
    }

    @Override
    public void run() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFileName))) {

            for (int i = 1; i <= 100; i++) {
                writer.println("id_filmu: " + i + ", id_uzytkownika: " + (i * 2) + ", ocena: " + (i % 5 + 1) + ", data_glosowania: " + dateFormat.format(new Date()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}