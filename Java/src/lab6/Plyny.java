package lab6;
public class Plyny{
    public Plyny(Pralka pralka){
        Czujniki plyn = new Czujniki();
        if(plyn.plyny_stan()>=45){
            System.out.println("!!!!!Brak plynow. Pralka nie moze wystartowac!!!!!");
            pralka.onoff(false);
        }else{
            System.out.println("-Plyny git");
        }
    }
}