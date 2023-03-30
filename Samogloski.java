import java.util.Scanner;

public class Samogloski {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź łańcuch znakowy: ");
        String str = scanner.nextLine().toLowerCase();

        System.out.println("Samogłoski w łańcuchu: ");
        for (int i = 0; i < str.length(); i++){
            char znak = str.charAt(i);
            if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u' || znak == 'y'){
                System.out.println("Pozycja " + (i + 1) + ": " + znak);
            }
        }
    }
}