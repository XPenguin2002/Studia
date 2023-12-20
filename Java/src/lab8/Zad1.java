package lab8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
public class Zad1 {
    String marka;
    String model;
    double pojemnosc;
    String typ;
    String silnik;
    int rokProdukcji;
    LocalDate dataPierwszejRejestracji;
    double cena;
    String nrRej;
    //konstruktor z argumentami
    public Zad1(String marka,String model,double pojemnosc,String typ,String silnik,int rokProdukcji,LocalDate dataPierwszejRejestracji,double cena,String nrRej){
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
    public Zad1(){
        marka="Opel";
        model="Corsa";
        pojemnosc=1.6;
        typ="hatchback";
        silnik="benzyna";
        rokProdukcji=2022;
        dataPierwszejRejestracji=LocalDate.of(2023,1,1);
        cena=50000;
        nrRej="FZA345A";
    }
    //konstruktor z paroma argumentami
    public Zad1(String marka,String model,String nrRej){
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
    public LocalDate getDataPierwszejRejestracji() {
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
    public void setDataPierwszejRejestracji(LocalDate dataPierwszejRejestracji) {
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
    public void zmiana(String marka,String model,double pojemnosc,String typ,String silnik,int rokProdukcji,LocalDate dataPierwszejRejestracji,double cena,String nrRej){
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
    public String gwarancja() {
        LocalDate dzisiaj = LocalDate.now();
        Period roznica = Period.between(dataPierwszejRejestracji, dzisiaj);
        int wiekPojazdu = roznica.getYears();
        if (wiekPojazdu <= 2) {
            return "Samochod posiada jeszcze gwarancje.";
        } else {
            return "Gwarancja samochodu wygasla.";
        }
    }
}
class Autokomis {
    private int Lp;
    public static void main(String[] args) {
        Zad1 samochod1 = new Zad1("Toyota", "Corolla", 1.6, "sedan", "benzyna", 2022, LocalDate.of(2022, 1, 1), 50000,"FZ1234");
        Zad1 samochod2 = new Zad1("Volkswagen", "Golf", 2.0, "hatchback", "diesel", 2021, LocalDate.of(2021, 5, 15), 60000,"FZ1234");
        Zad1 samochod3 = new Zad1("Audi", "S3", 2.0, "sedan", "benzyna", 2017, LocalDate.of(2017, 6, 24), 200000,"FZ1234");
        Zad1 samochod4 = new Zad1("BMW", "M4", 3.0, "coupe", "benzyna", 2020, LocalDate.of(2020, 11, 8), 300000,"FZ1234");
        Zad1 samochod5 = new Zad1("Audi", "SQ7", 4.0, "SUV", "benzyna", 2023, LocalDate.of(2023, 2, 14), 700000,"FZ1234");
        Zad1 samochod6 = new Zad1("Volkswagen", "Scirocco", 1.4, "coupe", "diesel", 2016, LocalDate.of(2017, 3, 21), 80000,"FZ1234");
        Zad1 samochod7 = new Zad1("BMW", "E90", 2.0, "hatchback", "diesel", 2008, LocalDate.of(2008, 10, 20), 75000,"FZ1234");
        Zad1 samochod8 = new Zad1("Renault", "Megane R.S", 2.0, "hatchback", "benzyna", 2022, LocalDate.of(2022, 9, 20), 350000,"FZ1234");
        Zad1 samochod9 = new Zad1("Ford", "Focus", 1.6, "hatchback", "diesel", 2012, LocalDate.of(2012, 6, 4), 65000,"FZ1234");
        Zad1 samochod10 = new Zad1("Volkswagen", "Golf", 2.0, "hatchback", "benzyna", 2015, LocalDate.of(2016, 4, 23), 150000,"FZ1234");

        ArrayList<Zad1> listaAut = new ArrayList<Zad1>();
        listaAut.add(samochod1);
        listaAut.add(samochod2);
        listaAut.add(samochod3);
        listaAut.add(samochod4);
        listaAut.add(samochod5);
        listaAut.add(samochod6);
        listaAut.add(samochod7);
        listaAut.add(samochod8);
        listaAut.add(samochod9);
        listaAut.add(samochod10);

        for(int i=0; i<10; i++) {
            System.out.println(listaAut.get(i).marka);
            System.out.println(listaAut.get(i).model);
            System.out.println(listaAut.get(i).pojemnosc);
            System.out.println(listaAut.get(i).typ);
            System.out.println(listaAut.get(i).silnik);
            System.out.println(listaAut.get(i).rokProdukcji);
            System.out.println(listaAut.get(i).dataPierwszejRejestracji);
            System.out.println(listaAut.get(i).cena);
            System.out.println(listaAut.get(i).nrRej);
            System.out.println(listaAut.get(i).gwarancja());
            System.out.println();
        }
        Student s1=new Student("Pawel","Laskarzewski");
        Student s2=new Student("Pawko","Laskarzewski");
        Student s3=new Student("Pawcio","Laskarzewski");
        Lista_studentow grupa=new Lista_studentow();
        grupa.lista.add(s1);
        grupa.lista.add(s2);
        grupa.lista.add(s3);
        System.out.println(grupa.ilu_studentow());
        grupa.studentnr3();
        Regex test=new Regex();
        test.slowa_zdania();
        test.adres_email("test@gmail.com");
        test.adres_email("nieadresemail");
    }
}
class Student {
    public String imie;
    public String nazwisko;
    public static int id=1;
    public int id_stud;
    public Student(String i,String n){
        imie=i;
        nazwisko=n;
        id_stud=id++;
    }
    public String toString(){
        return imie+"\n"+nazwisko+"\n"+id_stud;
    }
}
class Lista_studentow {
    public ArrayList<Student> lista;
    public Lista_studentow(){
        lista=new ArrayList<Student>();
    }
    public int ilu_studentow(){
        return lista.size();
    }
    public void studentnr3(){
        Student temp=lista.get(2);
        System.out.println("Dane 3 studenta:");
        System.out.println(temp.toString());
    }
}
class Regex {
    public void slowa_zdania() {
        String zdanie = "Z podanego zdania nalezy wyodrebnic zawarte w nim slowa stosujac wyrazenie regularne";
        String regex = "\\b\\w+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(zdanie);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public void adres_email(String mail){
        String regex="[a-zA-Z0-9.]*@[a-zA-Z0-9.]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        if(matcher.find()){
            System.out.println("To jest email");
        }
        else {
            System.out.println("To nie jest email");
        }
    }
}