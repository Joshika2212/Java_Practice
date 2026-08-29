package File_Handling;

import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriterEx {
    public static void main(String[] args){
        try{
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            osw.write("Hello World"); 
            osw.write("\n");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.flush();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
