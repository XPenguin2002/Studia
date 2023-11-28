package lab2;
import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj pierwszq cyfre:");
        double a = s.nextInt();
        System.out.println("Podaj drugq cyfre:");
        double b = s.nextInt();
        System.out.println("Podaj operator matematyczny (+, -, *, /, ^): ");
        char c = s.next(".").charAt(0);
        s.close();
        switch (c) {
            case '+':
                double suma=a+b;
                System.out.println(a+"+"+b+"="+suma);
                break;
            case '-':
                double różnica=a-b;
                System.out.println(a+"-"+b+"="+różnica);
                break;
            case '*':
                double mnożenie=a*b;
                System.out.println(a+"*"+b+"="+mnożenie);
                break;
            case '/':
                if(b==0){System.out.println("u stupid");}
                else {
                    double dzielenie=a/b;
                    System.out.println(a+"/"+b+"="+dzielenie);
                }
                break;
            case '^':
                double pot=Math.pow(a,b);
                System.out.println(a+"^"+b+"="+pot);
                break;
            default:
                System.out.println("Podano nieprawidlowy operator");
        }

    }
}
