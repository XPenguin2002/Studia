package lab10;

import java.io.IOException;

public class LogReader implements Runnable {
    private final String logFileName;

    public LogReader(String logFileName) {
        this.logFileName = logFileName;
    }

    @Override
    public void run() {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get(logFileName);
            java.util.List<String> lines = java.nio.file.Files.readAllLines(path);

            for (int i = 0; i < Math.min(10, lines.size()); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}