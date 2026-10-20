import java.io.*;

public class DataSample3 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\data.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\copy.txt");
        
        int ch;
        while((ch = fis.read()) != -1){
            fos.write(ch);
        }
        fis.close();
        fos.close();
    }
}
