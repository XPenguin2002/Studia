package lab4;
import java.util.Random;
public class zad3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[40];
        for (int i=0;i<=10;i++){
            tab[i] = random.nextInt(5) + 1;
        }
        for (int i=11;i<=20;i++){
            tab[i] = random.nextInt(5) + 6;
        }
        for (int i=21;i<=30;i++){
            tab[i] = random.nextInt(5) + 45;
        }
        for (int i=31;i<=39;i++){
            tab[i] = random.nextInt(16) + 60;
        }
        for (int i=0;i<40;i++){
            System.out.println(tab[i]);
        }
    }
}
