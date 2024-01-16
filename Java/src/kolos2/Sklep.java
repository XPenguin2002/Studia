package kolos2;
import java.util.Scanner;
public class Sklep{
    public static void main(String[] args){
        Slodycze a = new Slodycze();
        Scanner s = new Scanner(System.in);
        a.setProducent(s.next());
        a.setNazwa(s.next());
        a.setCena(s.nextDouble());
        a.setTyp(s.next());
        s.close();
    }
}