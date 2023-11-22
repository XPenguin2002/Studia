import java.util.Scanner;
import java.util.Random;
public class zad3 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 200;
        int randomInRange = random.nextInt(max - min) + min;
        System.out.println("Zgadnij liczbe od 1 do 200");
        boolean a=true;
        Scanner s = new Scanner(System.in);
        while(a) {
            int a1 = s.nextInt();
            if (a1==randomInRange) a=false;
            if (a1<randomInRange){
                System.out.println("Za malo");
            }else if(a1>randomInRange){
                System.out.println("Za duzo");
            }
        }
        s.close();
        System.out.println("Udalo ci sie");
    }
}