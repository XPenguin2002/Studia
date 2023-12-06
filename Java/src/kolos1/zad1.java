package kolos1;
import java.util.Scanner;
public class zad1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int rok = s.nextInt();
        if (rok >= 18){
            System.out.println("Ile wynosi ciebie OC?");
            double oc = s.nextInt();
            System.out.println("Od ilu lat nie miales wypadku?");
            int l = s.nextInt();
            double noc;
            if (l>=5){
                noc=oc-(oc*30/100);
                System.out.println("Twoja znizka to 30%, wiec twoja nowa cena wynosi: "+noc+" zl");
            }else if(l==4){
                noc=oc-(oc*22/100);
                System.out.println("Twoja znizka to 22%, wiec twoja nowa cena wynosi: "+noc+" zl");
            }else if(l==3){
                noc=oc-(oc*17/100);
                System.out.println("Twoja znizka to 17%, wiec twoja nowa cena wynosi: "+noc+" zl");
            }else if(l==2){
                noc=oc-(oc*15/100);
                System.out.println("Twoja znizka to 15%, wiec twoja nowa cena wynosi: "+noc+" zl");
            }else if(l==1){
                noc=oc-(oc*10/100);
                System.out.println("Twoja znizka to 10%, wiec twoja nowa cena wynosi: "+noc+" zl");
            }else{
                System.out.println("Nie przysluguje ci znizka");
            }
        }else{
            System.out.println("Musisz byc pelnoletni by skorzystac z aplikacji");
        }
        s.close();
    }
}
