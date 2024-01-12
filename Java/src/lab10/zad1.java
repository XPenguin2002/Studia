package lab10;

public class zad1 {
    public static void main(String[] args) {
        for (int i=0;i<15;i++) {
            try {
                Watek1 watek = new Watek1();
                watek.start();
                watek.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}