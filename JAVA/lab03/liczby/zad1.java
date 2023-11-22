import java.util.Scanner;

public class zad1 {
	public static void main(String[] args) {
	     Scanner s = new Scanner(System.in);
	     System.out.println("Podaj liczbe calkowita:");
	     int a1 = s.nextInt();
	     s.close();
	     String string1 = String.valueOf(a1);
	     int a2 = string1.length();
	     if (a1 <= 1) {
	            System.out.println("Liczba nie jest pierwsza.");
	        } else {
	            boolean isPrime = true;
	            for (int i = 2; i <= Math.sqrt(a1); i++) {
	                if (a1 % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.println("Liczba jest pierwsza.");
	            } else {
	                System.out.println("Liczba nie jest pierwsza.");
	            }
	        }
		 double srednia1=0;
		 double srednia2=0;
		 int liczba1=0;
		 int liczba2=0;
	     for(int i=0;i<a2;i++){
			 int d = Character.getNumericValue(string1.charAt(i));
			 if(d%2==0){
				 srednia1+=d;
				 liczba1++;
			 }else{
				 srednia2+=d;
				 liczba2++;
			 }
		 }
		System.out.println("stosunek sredniej arytmetycznej cyfr nieparzystych do sredniej arytmetycznej cyfr parzystych wynosi:");
		System.out.println((srednia2/liczba2)/(srednia1/liczba1));
	}
}