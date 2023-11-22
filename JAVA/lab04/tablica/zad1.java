import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[30];
        for (int i = 0; i < 30; i++) {
            tab[i] = random.nextInt(51) + 99;
        }
        int[] tab2 = new int[30];
        System.arraycopy(tab, 0, tab2, 0, 30);
        for (int i = 0; i < 30; i++) {
            System.out.println(tab[i]+" "+tab2[i]);
        }
    }
}