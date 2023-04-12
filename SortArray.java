import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = rand.nextInt(10000);
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}