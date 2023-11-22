import java.util.Scanner;

public class zad6{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);

		System.out.println("Podaj kwote ktora chcesz pozyczyc (max. 300 tys PLN):");
		double kwota = s.nextDouble();
		System.out.println("Podaj liczbe miesięcy przez które chcesz spłacać (max. 96):");
		int raty = s.nextInt();
		System.out.println("Podaj kapital wlasny (max. 300 tys PLN):");
		double kapital = s.nextDouble();
		if(kwota>300000 || raty>96 || kapital>kwota) {
			System.out.println("Podano za duza kwote lub liczbe miesiecy. Sprobuj ponownie.");
		}
		s.close();
		double odsetki=0;
		kwota-=kapital;
		if (raty<=24) {
			odsetki = (kwota * 1.02) / raty;
		}
		else if (raty<=48) {
			odsetki = (kwota * 1.03) / raty;
		}
		else if (raty<=60) {
			odsetki = (kwota * 1.04) / raty;
		}
		else if (raty<=72) {
			odsetki = (kwota * 1.05) / raty;
		}
		else if (raty<=96) {
			odsetki = (kwota * 1.06) / raty;
		}
		else{
			System.out.println("Wystapil nieoczekiwany blad. Prosze sprobowac jeszcze raz");
		}
		System.out.println("Bedzie to "+odsetki+"zl"+" przez "+raty+" miesiecy czyli razem "+odsetki*raty+" zl");
    }
}