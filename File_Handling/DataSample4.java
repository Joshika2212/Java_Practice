import java.io.*;

public class DataSample4 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\copy.txt");
        int ch;
        while((ch = fr.read()) != -1)
            System.out.print((char) ch);
        fr.close();
    }
}
