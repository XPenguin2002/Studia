package lab6;
public class Silnik{
    public boolean on;
    public int predkosc;

    public Silnik(){
        on=false;
        predkosc=0;
    }

    public void setOn(boolean a){
        on=a;
    }
    public void setPredkosc(int a){predkosc+=a;}
}