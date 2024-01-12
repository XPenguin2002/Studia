package lab10;

public class zad2 {
    public static void main(String[] args) {
        LogGenerator logGenerator = new LogGenerator("src\\lab10\\logs.txt");
        logGenerator.start();
        try {
            logGenerator.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LogReader logReader1 = new LogReader("src\\lab10\\logs.txt");
        LogReader logReader2 = new LogReader("src\\lab10\\logs.txt");
        new Thread(logReader1).start();
        new Thread(logReader2).start();
    }
}