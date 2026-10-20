import java.io.*;

public class DataSample5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\copy.txt"));
        String line;
        while((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}
