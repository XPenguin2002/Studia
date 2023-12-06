package lab7;

public class Zad1 {
    public int[] liczba;
    public String[] znak;
    public Zad1(Zad1 copy){
        this.liczba = new int[copy.liczba.length];
        if(copy.liczba.length!=1)this.znak = new String[copy.znak.length];
        this.liczba[0] = copy.liczba[0];
        for(int i = 0;i<liczba.length-1;i++){
            this.liczba[i+1]=copy.liczba[i+1];
            this.znak[i]=copy.znak[i];
        }
    }
    public Zad1(int a){
        this.liczba = new int[]{a};
    }
    public Zad1(int a,String b,int c){
        this.liczba = new int[]{a,c};
        this.znak = new String[]{b};
    }
    public Zad1(int a,String b,int c,String d,int e){
        this.liczba = new int[]{a,c,e};
        this.znak = new String[]{b,d};
    }
    public Zad1(int a,String b,int c,String d,int e,String f,int g){
        this.liczba = new int[]{a,c,e,g};
        this.znak = new String[]{b,d,f};
    }

    public void wynik(){
        if(liczba.length==1)System.out.println("Pierwiastek z "+liczba[0]+" wynosi "+Math.sqrt(liczba[0]));
        else {
            int wynik=liczba[0];
            for(int i=0;i<liczba.length-1;i++){
                switch (znak[i]) {
                    case "+" -> wynik=wynik+liczba[i+1];
                    case "-" -> wynik=wynik-liczba[i+1];
                    case "/" -> wynik=wynik/liczba[i+1];
                    case "*" -> wynik=wynik*liczba[i+1];
                }
            }
            System.out.println("Wynik: "+wynik);
        }
    }

    public static void main(String[] args){
        Zad1 a = new Zad1(2);
        Zad1 b = new Zad1(1,"+",2);
        Zad1 c = new Zad1(1,"+",2,"-",3);
        Zad1 d = new Zad1(1,"+",2,"-",4,"*",3);
        Zad1 e = new Zad1(a);
        Zad1 f = new Zad1(d);
        a.wynik();
        b.wynik();
        c.wynik();
        d.wynik();
        e.wynik();
        f.wynik();
    }
}


