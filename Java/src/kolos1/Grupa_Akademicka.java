package kolos;
import java.util.ArrayList;
import java.util.List;

public class Grupa_Akademicka {
	public List<Student> listaStudentow;

	public Grupa_Akademicka() {
		this.listaStudentow = new ArrayList<>();
	}

	public void dodajStudenta(Student student) {
		listaStudentow.add(student);
	}

	public void wyswietlZawartoscGrupy() {
		for (Student student : listaStudentow) {
			System.out.println("Imię: " + student.getImie());
			System.out.println("Nazwisko: " + student.nazwisko);
			System.out.println("Indeks: " + student.indeks);
			System.out.println("Grupa: " + student.grupa);
			student.sprawdzbhp();
			System.out.println("---------------");
		}
	}

	public static void main(String[] args) {
		Grupa_Akademicka grupa = new Grupa_Akademicka();

		Student student1 = new Student("Jan", "Kowalski", 12345, "A1", true);
		Student student2 = new Student("Anna", "Nowak", 67890, "A1", false);
		Student student3 = new Student("Piotr", "Wiśniewski", 13579, "A1", true);

		grupa.dodajStudenta(student1);
		grupa.dodajStudenta(student2);
		grupa.dodajStudenta(student3);

		grupa.wyswietlZawartoscGrupy();
	}
}