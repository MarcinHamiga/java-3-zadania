import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        try {
            File mergedFile = new File("merged_file.txt");
            mergedFile.createNewFile();
            FileWriter writer = new FileWriter(mergedFile);
            for (String filePath : args) {
                FileReader reader = new FileReader(filePath);

                int character;
                while ((character = reader.read()) != -1) {
                    writer.write(character);
                }

                reader.close();
            }
            writer.close();
            System.out.println("Pliki zostały połączone w plik merged_file.txt.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas łączenia plików.");
            e.printStackTrace();
        }
    }
}