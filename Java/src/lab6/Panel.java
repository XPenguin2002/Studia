package lab6;
import java.util.Scanner;
public class Panel{
    public int temperatura;
    public int czas1;
    public int czas2;
    public boolean plukanie;
    public int predkosc;
    public Panel(){
        this.temperatura=0;
        this.czas1=0;
        this.czas2=0;
        this.plukanie=false;
        this.predkosc=0;
    }
    public int getTemp(){
        return temperatura;
    }
    public int getCzas(){
        return czas1+czas2;
    }
    public void ustaw(){
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Wybierz typ prania:");
            System.out.println("1.jakies?");
            System.out.println("2.tez jakies");
            System.out.println("3.codzienne");
            System.out.println("4.bawelna");
            System.out.println("5.szybkie");
            System.out.println("6.Wlasny");
            int liczba = s.nextInt();
            switch (liczba) {
                case 1:
                    this.temperatura=30;
                    this.czas1=30;
                    this.czas2=120;
                    this.plukanie=false;
                    this.predkosc=800;
                    break;
                case 2:
                    this.temperatura=40;
                    this.czas1=60;
                    this.czas2=240;
                    this.plukanie=true;
                    this.predkosc=1000;
                    break;
                case 3:
                    this.temperatura=50;
                    this.czas1=0;
                    this.czas2=180;
                    this.plukanie=false;
                    this.predkosc=1600;
                    break;
                case 4:
                    this.temperatura=25;
                    this.czas1=120;
                    this.czas2=240;
                    this.plukanie=true;
                    this.predkosc=600;
                    break;
                case 5:
                    this.temperatura=45;
                    this.czas1=30;
                    this.czas2=60;
                    this.plukanie=false;
                    this.predkosc=1600;
                    break;
                case 6:
                    System.out.println("Podaj temperature: (°C)");
                    int userInput = s.nextInt();
                    if((userInput >= 20) && (userInput <= 90)) this.temperatura = userInput;
                    else{
                        System.out.println("Niewłaściwa temperatura. Wybierz ponownie:");
                        continue;
                    }
                    System.out.println("Podaj czas prania wstepnego: (min)");
                    userInput = s.nextInt();
                    if((userInput >= 0) && (userInput <= 240)) this.czas1 = userInput;
                    else{
                        System.out.println("Niewłaściwy czas. Wybierz ponownie:");
                        continue;
                    }
                    System.out.println("Podaj czas prania zasadniczego: (min)");
                    userInput = s.nextInt();
                    if((userInput >= 1) && (userInput <= 240)) this.czas2 = userInput;
                    else{
                        System.out.println("Niewłaściwy czas. Wybierz ponownie:");
                        continue;
                    }
                    System.out.println("Czy chcesz dodatkowe plukanie? tak/nie");
                    this.plukanie = s.next().equals("tak");
                    System.out.println("Podaj predkosc: (obroty/min)");
                    userInput = s.nextInt();
                    if((userInput >= 1) && (userInput <= 2000)) this.predkosc = userInput;
                    else{
                        System.out.println("Niewłaściwa predkosc. Wybierz ponownie:");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Niewłaściwy tryb prania. Wybierz ponownie:");
                    continue;
            }
            break;
        }

    }
    public void start(){
        System.out.println("aktualne ustawienia prania:");
        System.out.println("Temperatura: "+temperatura);
        System.out.println("Czas prania wstepnego w minutach "+czas1);
        System.out.println("Czas prania zasadniczego w minutach "+czas2);
        System.out.println("Dodatkowe plukanie: ");
        if(plukanie){System.out.print("tak");}else{System.out.print("nie");}
        System.out.println("Predkosc: "+predkosc);
        Scanner s = new Scanner(System.in);
        System.out.println("Czy chcesz rozpoczac pranie? tak/nie");
        if(s.next().equals("nie")){
            ustaw();
            start();
        }
    }
}