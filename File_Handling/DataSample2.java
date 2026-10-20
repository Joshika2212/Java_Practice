import java.io.*;

public class DataSample2 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\output.txt");
        fos.write("Hello Java".getBytes());
        fos.close();
    }
}
