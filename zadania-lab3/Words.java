import java.util.Scanner;

public class Words {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[size];
        int wordCount = 0;

        while (wordCount < size) {
            System.out.print("Podaj słowo: ");
            String word = scanner.nextLine();

            if (wordExists(word, words, wordCount)) {
                System.out.println("Słowo już istnieje w tablicy. ");   
            }   else {
                words[wordCount] = word;
                wordCount++;
                System.out.println("Słowo zostało dodane do tablicy.");
            }
        }
        System.out.println("Tablica zawiera następujące słowa: ");
        for (String word : words){
            System.out.println(word);
        }
    }

    private static boolean wordExists(String word, String[] words, int wordCount) {
        for (int i = 0; i < wordCount; i++){
            if (word.equals(words[i])) {
                return true;
            }
        }
        return false;
    }
}