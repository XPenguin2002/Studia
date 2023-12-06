package lab6;
public class Grzalka{
    public boolean on;
    public Grzalka(){
        on=true;
    }
    public boolean getOn(){
        return this.on;
    }
    public int sprawdz(int a,int b){
        if(b>a){
            on=false;
            b-=5;
        }
        else{
            on=true;
            b+=5;
        }
        return b;
    }
}