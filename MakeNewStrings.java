import java.util.Scanner;

public class MakeNewStrings {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
    
        System.out.println("Podaj wyrazy do połączenia (wpisz 'end', aby zakończyć wprowadzanie): ");
        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            builder.append(word);
        }

        String str = builder.toString();
        System.out.println("Połączone wyrazy: " + str);
    }

}