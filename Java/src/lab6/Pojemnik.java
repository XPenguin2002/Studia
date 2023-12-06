package lab6;
public class Pojemnik{
    public Pojemnik(Pralka pralka){
        Czujniki waga = new Czujniki();
        if(waga.waga()>45){
            System.out.println("!!!!!Za duzo rzeczy w bebnie. Pralka nie moze wystartowac!!!!!");
            pralka.onoff(false);
        }else{
            System.out.println("-Ciezar bebna zgadza sie");
        }
    }
}