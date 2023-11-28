package lab3;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int a1 = s.nextInt();
        s.close();
        boolean b=true;
        System.out.println("Oto dzielniki twojej liczby:");
        for(int i=1;i<=a1;i++){
            if(a1%i==0){
                b=false;
                System.out.print(i+" ");
            }
        }
        if(b){
            System.out.println("Brak dzielnikow");
        }
    }
}
