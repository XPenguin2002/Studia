import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] tab = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                tab[i][j] = random.nextInt(100);
            }
        }
        int[] max = new int[7];
        int[] min = new int[7];
        for (int i = 0; i < 7; i++){
            max[i]=0;
            min[i]=99;
            for (int j = 0; j < 7; j++){
                if (max[i] < tab[i][j])max[i]=tab[i][j];
                if (min[i] > tab[i][j])min[i]=tab[i][j];
            }
        }
        int minimum=100;
        int maximum=-1;
        int srednia=0;
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if (minimum>tab[i][j])minimum=tab[i][j];
                if (maximum<tab[i][j])maximum=tab[i][j];
                srednia+=tab[i][j];
            }
        }
        srednia/=49;
        int a=0;
        int b=0;
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                if (tab[i][j]>srednia)a++;
                if (tab[i][j]<srednia)b++;
            }
        }
        int[][] tab2 = new int[7][7];
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                tab2[6-i][6-j]=tab[i][j];
            }
        }
        for (int i = 0; i < 7; i++){
            System.out.println("Minimalna w kolumnie nr: "+i+" wynosi "+min[i]+" a maksymalna "+max[i]);
        }
        System.out.println("Max wynosi: "+maximum);
        System.out.println("Min wynosi: "+minimum);
        System.out.println("Srednia wynosi: "+srednia);
        System.out.println("liczb wiekszych niz srednia jest: "+a);
        System.out.println("Liczb mniejszych niz srednia jest: "+b);
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 7; j++){
                System.out.println(tab[i][j]+" "+tab2[6-i][6-j]);
            }
        }
    }
}