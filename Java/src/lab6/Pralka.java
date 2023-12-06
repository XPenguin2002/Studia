package lab6;
public class Pralka{
    public boolean on=true;
    public Panel panel;
    public Grzalka grzalka;
    public Pojemnik pojemnik;
    public Plyny plyny;
    public Filtr filtr;
    public Pompa pompa;
    public Czujniki czujniki;
    public Elektro elektro;
    public Silnik silnik;
    public Sterownik sterownik;
    public void onoff(boolean a) {
        on = a;
    }
    public Pralka(){
            while(on) {
                this.panel = new Panel();

                panel.ustaw();
                panel.start();

                System.out.println("Sprawdzenie poprawnosci dzialania pralki przed startem:");

                this.pojemnik = new Pojemnik(this);
                if(!this.on)break;

                this.filtr = new Filtr(this);
                if(!this.on)break;

                this.plyny = new Plyny(this);
                if(!this.on)break;

                start();

                onoff(false);
            }
    }
    public void start(){
        this.grzalka = new Grzalka();
        this.czujniki = new Czujniki();
        int temp = czujniki.getTemp();
        for(int i=0;i<panel.getCzas();i++) {
            wait(1000);

            temp=grzalka.sprawdz(panel.getTemp(),temp);
            
            System.out.println(i);
        }
    }
    //czekanie z neta
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    //
}