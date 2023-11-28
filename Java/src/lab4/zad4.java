package lab4;
import java.util.Random;
public class zad4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[30];
        for (int i = 0; i < 30; i++) {
            tab[i] = random.nextInt(51) + 99;
        }
        int[] tab2 = new int[30];
        System.arraycopy(tab, 0, tab2, 0, 30);
        for (int i = 0; i < 30; i++) {
            System.out.println(tab[i]+" "+tab2[i]);
        }
        //quicksort
        quicksort(tab, 0, 29);
        //bubble
        bubbleSort(tab2);
        System.out.println("Posortowane:");
        for (int i = 0; i < 30; i++) {
            System.out.println(tab[i]+" "+tab2[i]);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
