package lab2;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj mile:");
        double mile = s.nextInt();
        s.close();
        double km = mile*1.61;
        System.out.println("wartosc w kilometrach wyniosla:"+km);
    }
}
