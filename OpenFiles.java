import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFiles {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            try {    
                File file = new File(args[i]);
                Scanner scanner = new Scanner(file);        
                while (scanner.hasNextLine()){
                    String data = scanner.nextLine();
                    System.out.println(data);
                }
            }
            catch (FileNotFoundException e){
                System.out.println("An error occured.");
                e.printStackTrace();
            }
        }
    }
}