package lab6;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        while(1==1) {
            Scanner s = new Scanner(System.in);
            System.out.println("Wybierz typ prania:");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.Wlasny");
            int liczba = s.nextInt();
            switch (liczba) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("Niewłaściwy tryb prania. Wybierz ponownie:");
                    continue;
            }
            s.close();
            break;
        }
    }
}