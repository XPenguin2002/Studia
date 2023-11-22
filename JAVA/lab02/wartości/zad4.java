import java.util.Scanner;

public class zad4{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj ile cyfr chcesz wpisac:");
        int ilość = s.nextInt();
        if(ilość<1){
        	System.out.println("niepoprawna wartosc");
        	s.close();
        }else{
        	int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
        	double średnia=0;
        	int suma=0;
        	for (int i=0;i<ilość;i++){
                System.out.println("Podaj liczbe #"+(i+1)+": ");
                int liczba = s.nextInt();
                if(liczba<min) {min=liczba;}
                if(liczba>max) {max=liczba;}
                suma+=liczba;
        	}
        	s.close();
        	średnia=suma/ilość;
        	System.out.println("ilosc liczb: "+ilość);
        	System.out.println("srednia: "+średnia);
        	System.out.println("najmniejsza z nich "+min);
        	System.out.println("najwieksza z nich "+max);
        }
    }
}