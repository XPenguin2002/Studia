package lab6;
import java.util.Random;
public class Plyny{
    public int plyny;

    public Plyny(){
        Random rand = new Random();
        plyny = rand.nextInt((50)+1);
    }

    public void setPlyny(int a){plyny -= a;}

    public int getPlyny(){return plyny;}
}