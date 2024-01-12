package lab7;
import java.io.*;
public class Zad2 {
    public void zapisz(String nazwaPliku, String zawartosc) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nazwaPliku))) {
            writer.println(zawartosc);
            System.out.println("Dane zostaly zapisane do pliku " + nazwaPliku);
        } catch (IOException e) {
            System.err.println("Blad podczas zapisu do pliku " + nazwaPliku);
        }
    }
    public void odczytaj(String nazwaPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String linia;
            System.out.println("Odczyt danych z pliku " + nazwaPliku + ":");
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.err.println("Blad podczas odczytu pliku " + nazwaPliku);
        }
    }
    public static void main(String[] args) {
        Zad2 plik = new Zad2();
        plik.zapisz("src\\lab7\\plik_txt.txt", "Elo benc txt 321.");
        plik.odczytaj("src\\lab7\\plik_txt.txt");
        plik.zapisz("src\\lab7\\plik_csv.csv", "Imie,Nazwisko,Wiek\nJa,Jajowy,21\nBenc,Bencowy,22");
        plik.odczytaj("src\\lab7\\plik_csv.csv");
    }
}
