package kolos;
public class Student{
	public String imie;
	public String nazwisko;
	public int indeks;
	public String grupa;
	public boolean bhp;

	public Student(String imie,String nazwisko,int indeks,String grupa,boolean bhp){
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.indeks=indeks;
		this.grupa=grupa;
		this.bhp=bhp;
	}
	public String getImie(){
		return imie;
	}
	public void setImie(String imie){
		this.imie=imie;
	}
	
	public void sprawdzbhp(){
		if(bhp){
			System.out.println("Wszystko git");
		}
		else{
			System.out.println("Brak szkolenia!");
		}
	}
	
	
}