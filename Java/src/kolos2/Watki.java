package kolos2;
public class Watki implements Runnable{
    public int id;
    public int suma;
    public Watki(int id){this.id=id;this.suma=0;}
    @Override
    public void run(){
        if(id==1){for(int i=1;i<=1000;i++){suma+=i;}}
        if(id==2){for(int i=1000;i>=1;i--){suma-=i;}}
    }
    public static void main(String[] args){
        Watki w1=new Watki(1);
        Watki w2=new Watki(2);
        Thread t1=new Thread(w1);
        Thread t2=new Thread(w2);
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        }
        catch(InterruptedException e){System.out.println("Error");}
        System.out.println(w1.suma+" + "+w2.suma+" = "+(w1.suma+w2.suma));
    }
}