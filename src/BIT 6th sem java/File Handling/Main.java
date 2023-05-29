import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        File file = new File("Anoop.txt");
        try {
            file.createNewFile();
            System.out.println("New File created..");
        } catch (IOException e) {
            System.out.println("File cannot be created");
            e.printStackTrace();
        }

        // write in that file
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hi my name is Anoop Shrestha\n");
            fileWriter.write("Hi my name is Anoop \n");
            fileWriter.write("Hi my name is Anoop Stha\n");
            fileWriter.close();
            System.out.println("Successfully written on file");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unsuccessfully text couldnot be written");
        }

        // reading from the existing file
        try {
            // FileReader fileReader = new FileReader(file);
            // //until the value of file.read() value isn't -1
            // int i= fileReader.read();
            // while (i != -1){
            //     System.out.print((char)i);
            //     i = fileReader.read();
            // }
            
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}