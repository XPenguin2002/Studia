package lab6;
import java.util.Random;
public class Czujniki {
    public int cisnienie;
    public int temperatura = 0;
    public int poziom;
    public int waga;
    public int przeplywomierz;
    public int plyn;

    public int waga() {
        Random r = new Random();
        this.waga = r.nextInt(50);
        return (waga);
    }

    public int przeplywomierz() {
        Random r = new Random();
        this.przeplywomierz = r.nextInt(50);
        return (przeplywomierz);
    }

    public int plyny_stan() {
        Random r = new Random();
        this.plyn = r.nextInt(50);
        return (plyn);
    }
    public int getTemp(){
        return temperatura;
    }
}