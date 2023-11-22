import java.text.SimpleDateFormat;

public class samochod{
        public String marka;
        public String model;
        public double pojemnosc;
        public String typ;
        public String silnik;
        public int rokProdukcji;
        public String dataPierwszejRejestracji;
        public double cena;
        public String nrRej;
        //konstruktor z argumentami
        public samochod(String marka,String model,double pojemnosc,String typ,String silnik,int rokProdukcji,String dataPierwszejRejestracji,double cena,String nrRej){
                this.marka=marka;
                this.model=model;
                this.pojemnosc=pojemnosc;
                this.typ=typ;
                this.silnik=silnik;
                this.rokProdukcji=rokProdukcji;
                this.dataPierwszejRejestracji=dataPierwszejRejestracji;
                this.cena=cena;
                this.nrRej=nrRej;
        }
        //konstruktor bezargumentowy
        public samochod(){
                marka="Opel";
                model="Corsa";
                pojemnosc=1.6;
                typ="hatchback";
                silnik="benzyna";
                rokProdukcji=2022;
                dataPierwszejRejestracji="2023-01-01";
                cena=50000;
                nrRej="FZA345A";
        }
        //konstruktor z paroma argumentami
        public samochod(String marka,String model,String nrRej){
                this.marka=marka;
                this.model=model;
                this.nrRej=nrRej;
        }
        //gettery
        public String getMarka() {
                return marka;
        }
        public String getModel() {
                return model;
        }
        public double getPojemnosc() {
                return pojemnosc;
        }
        public String getTyp() {
                return typ;
        }
        public String getSilnik() {
                return silnik;
        }
        public int getRokProdukcji() {
                return rokProdukcji;
        }
        public String getDataPierwszejRejestracji() {
                return dataPierwszejRejestracji;
        }
        public double getCena() {
                return cena;
        }
        public String getNrRej() {
                return nrRej;
        }
        //settery
        public void setMarka(String marka) {
                this.marka = marka;
        }
        public void setModel(String model) {
                this.model = model;
        }
        public void setPojemnosc(double pojemnosc) {
                this.pojemnosc = pojemnosc;
        }
        public void setTyp(String typ) {
                this.typ = typ;
        }
        public void setSilnik(String silnik) {
                this.silnik = silnik;
        }
        public void setRokProdukcji(int rokProdukcji) {
                this.rokProdukcji = rokProdukcji;
        }
        public void setDataPierwszejRejestracji(String dataPierwszejRejestracji) {
                this.dataPierwszejRejestracji = dataPierwszejRejestracji;
        }
        public void setCena(double cena) {
                this.cena = cena;
        }
        public void setNrRej(String nrRej) {
                this.nrRej = nrRej;
        }
        //funkcja do sprawdzania informacji o aucie
        public void info(){
                System.out.println("marka: "+getMarka());
                System.out.println("model: "+getModel());
                System.out.println("pojemnosc: "+getPojemnosc());
                System.out.println("typ: "+getTyp());
                System.out.println("silnik: "+getSilnik());
                System.out.println("rok produkcji: "+getRokProdukcji());
                System.out.println("data pierwszej rejestracji: "+getDataPierwszejRejestracji());
                System.out.println("cena:"+getCena());
                System.out.println("numer rejestracyjny:"+getNrRej());
                System.out.println("");
        }
        //funkcja do zmiany wszystkich danych o aucie
        public void zmiana(String marka,String model,double pojemnosc,String typ,String silnik,int rokProdukcji,String dataPierwszejRejestracji,double cena,String nrRej){
                setMarka(marka);
                setModel(model);
                setPojemnosc(pojemnosc);
                setTyp(typ);
                setSilnik(silnik);
                setRokProdukcji(rokProdukcji);
                setDataPierwszejRejestracji(dataPierwszejRejestracji);
                setCena(cena);
                setNrRej(nrRej);
        }
}