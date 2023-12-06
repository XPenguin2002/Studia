package lab7;
import java.io.*;
public class Zad2 {
    public void zapiszDoTxt(String nazwaPliku, String zawartosc) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nazwaPliku))) {
            writer.println(zawartosc);
            System.out.println("Dane zostaly zapisane do pliku " + nazwaPliku);
        } catch (IOException e) {
            System.err.println("Blad podczas zapisu do pliku " + nazwaPliku);
            e.printStackTrace();
        }
    }
    public void odczytajZTxt(String nazwaPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String linia;
            System.out.println("Odczyt danych z pliku " + nazwaPliku + ":");
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.err.println("Blad podczas odczytu pliku " + nazwaPliku);
            e.printStackTrace();
        }
    }
    public void zapiszDoCsv(String nazwaPliku, String zawartosc) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nazwaPliku))) {
            writer.println(zawartosc);
            System.out.println("Dane zostaly zapisane do pliku " + nazwaPliku);
        } catch (IOException e) {
            System.err.println("Blad podczas zapisu do pliku " + nazwaPliku);
            e.printStackTrace();
        }
    }
    public void odczytajZCsv(String nazwaPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String linia;
            System.out.println("Odczyt danych z pliku " + nazwaPliku + ":");
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.err.println("Blad podczas odczytu pliku " + nazwaPliku);
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Zad2 plik = new Zad2();
        plik.zapiszDoTxt("F:\\Java\\src\\lab7\\plik_txt.txt", "Elo benc txt 321.");
        plik.odczytajZTxt("F:\\Java\\src\\lab7\\plik_txt.txt");
        plik.zapiszDoCsv("F:\\Java\\src\\lab7\\plik_csv.csv", "Imi3,Nazwisko,Wiek\nJa,Jajowy,21\nBenc,Bencowy,22");
        plik.odczytajZCsv("F:\\Java\\src\\lab7\\plik_csv.csv");
    }
}
