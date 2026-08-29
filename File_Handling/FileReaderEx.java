package File_Handling;

import java.io.IOException;
import java.io.FileReader;

public class FileReaderEx {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("note.txt");
            int letters = fr.read();
            while(letters != -1){
                System.out.println((char) letters);
                letters = fr.read();
            }
            //fr.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
