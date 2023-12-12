package lab6;
import java.util.Scanner;
public class Panel{
    public boolean on;
    public int temperatura;
    public int czas1;
    public int czas2;
    public boolean plukanie;
    public int predkosc;

    public Panel(){
        on=false;
        temperatura=0;
        czas1=0;
        czas2=0;
        plukanie=false;
        predkosc=0;
    }
    
    public void menu(Sterownik sterownik){
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Wybierz typ prania:");
            System.out.println("1.jakies?");
            System.out.println("2.tez jakies");
            System.out.println("3.codzienne");
            System.out.println("4.bawelna");
            System.out.println("5.szybkie");
            System.out.println("6.Wlasny");
            System.out.println("7.Wylacz pralke");
            switch (s.nextInt()) {
                case 1:
                    temperatura=30;
                    czas1=30;
                    czas2=120;
                    plukanie=false;
                    predkosc=800;
                    break;
                case 2:
                    temperatura=40;
                    czas1=60;
                    czas2=240;
                    plukanie=true;
                    predkosc=1000;
                    break;
                case 3:
                    temperatura=50;
                    czas1=0;
                    czas2=180;
                    plukanie=false;
                    predkosc=1600;
                    break;
                case 4:
                    temperatura=25;
                    czas1=120;
                    czas2=240;
                    plukanie=true;
                    predkosc=600;
                    break;
                case 5:
                    temperatura=45;
                    czas1=30;
                    czas2=60;
                    plukanie=false;
                    predkosc=1600;
                    break;
                case 6:
                    System.out.println("Podaj temperature: (stopnie Celcjusza)");
                    int userInput = s.nextInt();
                    if((userInput >= 20) && (userInput <= 90)) temperatura = userInput;
                    else{
                        System.out.println("Niewlasciwa temperatura. Wybierz ponownie:");
                        continue;
                    }
                    System.out.println("Podaj czas prania wstepnego: (min)");
                    userInput = s.nextInt();
                    if((userInput >= 0) && (userInput <= 240)) czas1 = userInput;
                    else{
                        System.out.println("Niewlasciwy czas. Wybierz ponownie:");
                        continue;
                    }
                    System.out.println("Podaj czas prania zasadniczego: (min)");
                    userInput = s.nextInt();
                    if((userInput >= 1) && (userInput <= 240)) czas2 = userInput;
                    else{
                        System.out.println("Niewlasciwy czas. Wybierz ponownie:");
                        continue;
                    }
                    System.out.println("Czy chcesz dodatkowe plukanie? tak/nie");
                    plukanie = s.next().equals("tak");
                    System.out.println("Podaj predkosc: (obroty/min)");
                    userInput = s.nextInt();
                    if((userInput >= 1) && (userInput <= 2000)) predkosc = userInput;
                    else{
                        System.out.println("Niewlasciwa predkosc. Wybierz ponownie:");
                        continue;
                    }
                    break;
                case 7:
                    sterownik.onoff=false;
                    break;
                default:
                    System.out.println("Niewlasciwy tryb prania. Wybierz ponownie:");
                    continue;
            }
            break;
        }
    }
    public void start(){
        Scanner s = new Scanner(System.in);
        System.out.println("Chcesz rozpoczac pranie z aktualnymi ustawieniami? tak/nie");
        System.out.println("Temperatura: "+temperatura+"\nCzas wstepny: "+czas1+"\nCzas zasadniczy: "+czas2+"\nPlukanie: "+plukanie+"\nPredkosc: "+predkosc);
        on=s.next().equals("tak");
    }
}