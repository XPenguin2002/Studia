package lab6;
public class Sterownik{
    public boolean onoff;
    public Panel panel;
    public Grzalka grzalka;
    public Pojemnik pojemnik;
    public Plyny plyny;
    public Filtr filtr;
    public Pompa pompa;
    public Czujniki czujniki;
    public Elektro elektro;
    public Silnik silnik;

    public Sterownik(){
        onoff = false;
        panel = new Panel();
        grzalka = new Grzalka();
        pojemnik = new Pojemnik();
        plyny = new Plyny();
        filtr = new Filtr();
        pompa = new Pompa();
        czujniki = new Czujniki();
        elektro = new Elektro();
        silnik = new Silnik();
    }

    public void start(){
        onoff=true;
        while(onoff){
            panel.menu(this);
            if(!onoff){break;}
            panel.start();
            if(panel.on){
                System.out.println("Start!");
                System.out.println("Procedura POST");
                if(!pojemnik.jest()){
                    System.out.println("Nie wykryto polaczenia z bebnem pralki. Zglos to do serwisanta.");
                    break;
                }
                if(czujniki.getWaga()>9){
                    System.out.println("Nie mozna wykonac prania. Za duza waga.");
                    break;
                }
                if(!filtr.jest()){
                    System.out.println("Brak filtra!!!");
                    break;
                }
                if(czujniki.getDroznosc()>45){
                    System.out.println("Nie mozna wykonac prania. Wymien filtr.");
                    break;
                }
                System.out.println("Wszystko git. Rozpoczynam pranie.");
                wait(1);
                silnik.setOn(true);
                grzalka.setOn(true);
                pompa.setOn(true);
                for(int i=0;i<panel.czas1+panel.czas2;i++){
                    if(silnik.predkosc<panel.predkosc)silnik.setPredkosc(50);
                    else if(silnik.predkosc>panel.predkosc)silnik.setPredkosc(-50);
                    if(czujniki.getTemperatura()<panel.temperatura)czujniki.setTemperatura(5);
                    else if(czujniki.getTemperatura()>panel.temperatura)czujniki.setTemperatura(-5);
                    if(pompa.on){
                        czujniki.setPoziom(5);
                        czujniki.setCisnienie(5);
                        if(czujniki.getPoziom()>90|czujniki.getCisnienie()>90)pompa.setOn(false);
                    }
                    if(plyny.getPlyny()>0)plyny.setPlyny(1);
                    if(czujniki.getZalanie()){
                        pompa.setOn(false);
                        elektro.setOn(true);
                        System.out.println("Wykryto zalanie. Przerwanie pracy pralki.");
                        break;
                    }
                    System.out.println(panel.czas1+panel.czas2-i);
                    wait(1);
                }
                silnik.setOn(false);
                grzalka.setOn(false);
                pompa.setOn(false);
                System.out.println("Koniec prania");
            }else{
                continue;
            }
            break;
        }
    }
    public static void wait(int s) {
        s*=1000;
        try
        {
            Thread.sleep(s);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}