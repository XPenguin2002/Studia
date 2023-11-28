package lab2;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj a:");
        double a = s.nextInt();
        System.out.println("Podaj b:");
        double b = s.nextInt();
        System.out.println("Podaj c:");
        double c = s.nextInt();
        s.close();
        double delta=(b*b)-(4*a*c);
        if(delta<0){
            System.out.println("Brak miejsc zerowych");
        }else if(delta==0){
            double x=(-b)/(2*a);
            System.out.println("X = "+x);
        }else{
            double x1=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("X1 = "+x1);
            double x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("X2 = "+x2);
        }
    }
}
