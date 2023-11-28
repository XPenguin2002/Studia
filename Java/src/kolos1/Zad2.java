package kolos;
import java.util.Random;
public class Zad2{
	public static void main (String[] args){
		int[] tab1 = new int [10];
		int[] tab2 = new int [10];
		Random r = new Random();
		for(int i=0;i<10;i++){
			tab1[i]=r.nextInt((89-17)+1)+17;
		}
		for(int i=0;i<10;i++){
			tab2[i]=tab1[i];
		}
		for(int i=0;i<10;i++){
			System.out.println(tab2[i]);
		}
	}
}