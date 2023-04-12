import java.util.Random;
import java.util.Scanner;

class Array2D {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj x: ");
        int x = scan.nextInt();
        System.out.println("Podaj y: ");
        int y = scan.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                arr[i][j] = rand.nextInt(10000);
            }
        }
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}