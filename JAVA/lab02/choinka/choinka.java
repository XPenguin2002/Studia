import java.util.Scanner;

public class choinka{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki:");
        int height = a.nextInt();
        a.close();
        for(int i=0;i<height;i++) {
            for(int j=0;j<height-i-1;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}