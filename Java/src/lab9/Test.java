package lab9;

public class Test {
    public static void main(String[] args) {
        StudentInstytut student = new StudentInstytut();
        student.setImie("Jan");
        student.setNazwisko("Kowalski");
        student.setIndeks(123456);
        student.setWydzial("WIEA");
        student.setInstytut("IAEE");
        System.out.println("Dane o studencie:");
        System.out.println(student.getImie()+"\n"+student.getNazwisko()+"\n"+student.getIndeks()+"\n"+student.getWydzial()+"\n"+student.getInstytut());
    }
}
