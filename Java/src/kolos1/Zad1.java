package kolos;
import java.util.Scanner;
public class Zad1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Ile masz lat?");
		int wiek = s.nextInt();
		System.out.println("Ile lat nie miales znizek?");
		int lat = s.nextInt();
		if(wiek>=18) {
			if(lat>=5) {
				System.out.println("Przysluguje ci znizka 30%");
			}
			else if(lat==4) {
				System.out.println("Przysluguje ci znizka 22%");
			}
			else if(lat==3) {
				System.out.println("Przysluguje ci znizka 17%");
			}
			else if(lat==2) {
				System.out.println("Przysluguje ci znizka 12%");
			}
			else if(lat==1) {
				System.out.println("Przysluguje ci znizka 10%");
			}
			else{
				System.out.println("Nie przysluguje ci zadna znizka");
			}
		}
		else{
			System.out.println("Masz za malo lat.");
		}
		s.close();
	}
}