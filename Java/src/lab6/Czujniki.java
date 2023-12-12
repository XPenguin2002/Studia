package lab6;
import java.util.Random;
public class Czujniki{
    public int cisnienie;
    public int temperatura;
    public int poziom;
    public boolean zalanie;
    public int waga;
    public int droznosc;

    public Czujniki(){
        Random rand = new Random();
        cisnienie=1;
        temperatura=22;
        poziom=0;
        zalanie=false;
        waga=rand.nextInt((10)+1);
        droznosc=rand.nextInt((50)+1);
    }

    public int getCisnienie() {return cisnienie;}

    public void setCisnienie(int cisnienie) {this.cisnienie += cisnienie;}

    public int getTemperatura() {return temperatura;}

    public void setTemperatura(int temperatura) {this.temperatura += temperatura;}

    public int getPoziom() {return poziom;}

    public void setPoziom(int poziom) {this.poziom += poziom;}

    public boolean getZalanie() {return zalanie;}

    public void setZalanie(boolean zalanie) {this.zalanie = zalanie;}

    public int getWaga() {return waga;}

    public int getDroznosc() {return droznosc;}
}