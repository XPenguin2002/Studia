package lab6;
public class Filtr{
    public Filtr(Pralka pralka){
        Czujniki filtr = new Czujniki();
        if(filtr.przeplywomierz()>45){
            System.out.println("!!!!!Filtr nie dziala. Pralka nie moze wystartowac!!!!!");
            pralka.onoff(false);
        }else{
            System.out.println("-Filtr jest ok");
        }
    }
}