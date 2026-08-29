package File_Handling;

import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferedReaderEx {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("You typed: "+br.readLine());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader("note.txt"));
            System.out.println(br.readLine());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
