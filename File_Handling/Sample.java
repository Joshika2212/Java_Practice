import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

public class Sample{
    public static void main(String[] args){
        try{
            File f = new File("data.txt");
            f.createNewFile();
            System.out.println("File created");
        }
        catch(FileNotFoundException e){
            System.out.println("Error");
        }

        try{
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello Java");
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Error");
        }
    }
}