package Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundEx {
    public static void main(String[] args){
        try{
            File f = new File("C://file.txt");
            FileReader fr = new FileReader(f);
        }
        catch(FileNotFoundException e){
            System.out.println("File does not exist");
        }
    }
}
