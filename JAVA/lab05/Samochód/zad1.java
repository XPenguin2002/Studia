public class zad1 {
    public static void main(String[] args) {
        samochod s1=new samochod();
        samochod s2=new samochod("Chevrolet","Cruze","FZ12345");
        samochod s3=new samochod("Chevrolet","Cruze",1.6,"hatchback","diesel",2012,"2012-12-12",30000,"FZ54321");
        s1.info();
        s2.info();
        s3.info();
    }
}