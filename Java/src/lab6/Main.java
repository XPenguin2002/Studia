package lab6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kliknij jakikolwiek przycisk aby wlaczyc pralke");
        scanner.nextLine();
        Sterownik sterownik = new Sterownik();
        sterownik.start();
        scanner.close();
    }
}