package lab10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Watek1 extends Thread {
    static int idd=1;
    int id;
    String data;

    public Watek1() {
        this.id = idd++;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.data = dateFormat.format(new Date());
    }

    @Override
    public void run() {
        System.out.println("wątek: " + id + " - "+ data);

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
