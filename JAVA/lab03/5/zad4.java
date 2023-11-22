import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean a = true;
        int iloczyn = 1;
        System.out.println("Podawaj po kolei liczby. Aby zakonczyc podaj liczbe 5:");
        while(a){
            int liczba = s.nextInt();
            iloczyn *= liczba;
            if (liczba==5)a=false;
        }
        iloczyn /= 5;
        s.close();
        System.out.println("Iloczyn podanych liczb wynosi: "+iloczyn);
    }
}