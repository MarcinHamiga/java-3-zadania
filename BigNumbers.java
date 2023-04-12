import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.math.BigInteger;

public class BigNumbers{
    public static void main(String[] args){
        BigInteger x = null;
        BigInteger y = null;
        try{
            File file1 = new File("number1.txt");
            File file2 = new File("number2.txt");
            Scanner scanner1 = new Scanner(file1);
            Scanner scanner2 = new Scanner(file2);
            x = scanner1.nextBigInteger();
            y = scanner2.nextBigInteger();
    
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }


        BigInteger output1 = x.add(y);
        BigInteger output2 = x.multiply(y);

        System.out.println(x + " + " + y + " = " + output1);
        System.out.println(x + " * " + y + " = " + output2);
        }
}