package File_Handling;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamEx {
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        try{
            System.out.print("Enter letters: ");
            int letters = isr.read();
            while(isr.ready()){
                System.out.println((char) letters);
                letters = isr.read();
            }
            isr.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
