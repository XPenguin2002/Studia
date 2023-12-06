package kolos1;
import java.util.Random;
public class zad2 {
    public static void main(String[] args){
        Random rand=new Random();
        int[] tab= new int[10];
        int[] kopia= new int[10];
        for(int i=0;i<10;i++){
            tab[i]=rand.nextInt((89-17)+1)+17;
            kopia[i]=tab[i];
            System.out.println(kopia[i]);
        }
    }
}
