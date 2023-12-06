package kolos1;
import java.util.ArrayList;
import java.util.List;
public class Student {
    public String imie;
    public String nazwisko;
    public int index;
    public String grupa;
    public boolean bhp;
    public Student(String imie,String nazwisko,int index,String grupa,boolean bhp){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.index=index;
        this.grupa=grupa;
        this.bhp=bhp;
    }
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public boolean getBhp(){
        return bhp;
    }

    public void setBhp(boolean bhp){
        this.bhp = bhp;
    }

    public void sprawdz(){
        if(!bhp){
            System.out.println("Brak szkolenia BHP!");
        }
    }
}

class Grupa_Akademicka{
    List<Student> studenci_grupy;
    public Grupa_Akademicka(){
        studenci_grupy=new ArrayList<>();
    }
    public void wypisz_grupe(){
        for(Student student:studenci_grupy){
            System.out.println(student.getImie()+" "+student.getNazwisko()+" "+student.getIndex()+" "+student.getGrupa());
        }
    }
    public void czybhp(){
        for(Student student:studenci_grupy){
            student.sprawdz();
        }
    }
}
class Main {
    public static void main(String[] args) {
        Student student1=new Student("Jan","Kowalski",109266,"23b",true);
        Student student2=new Student("Brian","Kowalski",123456,"23b",true);
        Student student3=new Student("Kuba","Kowalski",432134,"23b",false);
        Grupa_Akademicka g23b=new Grupa_Akademicka();
        g23b.studenci_grupy.add(student1);
        g23b.studenci_grupy.add(student2);
        g23b.studenci_grupy.add(student3);
        g23b.wypisz_grupe();
        g23b.czybhp();
    }
}
