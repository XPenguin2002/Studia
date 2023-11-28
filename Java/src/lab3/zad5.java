package lab3;
import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe nieujemna zeby wyswietlic wszystkie wartosci potegi liczby 3 mniejsze niz wartosc wczytana.");
        Scanner s = new Scanner(System.in);
        boolean b=true;
        int a=0;
        while(b){
            a = s.nextInt();
            if(a<0){
                System.out.println("U retard");
            }else if(a<=1){
                System.out.println("Brak");
            }else{
                b=false;
            }
        }
        s.close();
        b=true;
        while(b){
            for(int i=0;i<a;i++){
                double c=Math.pow(3,i);
                if(c<a){
                    System.out.print(c+" ");
                }else{
                    b=false;
                }
            }
        }
    }
}
