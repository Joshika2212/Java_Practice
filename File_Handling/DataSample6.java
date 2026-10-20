import java.io.*;

public class DataSample6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\tran.txt"));
        String line;
        int count = 0;
        int total = 0;
        int max = 0;
        while((line = br.readLine()) != null)
            if(line.contains("Ravi")){
                System.out.println(line);
                String[] data = line.split(" ");
                int amount = Integer.parseInt(data[2]);
                total += amount;
                if(amount > max) max = amount;
                count++;
            }                
        br.close();
        System.out.println(count);
        System.out.println(total);
        System.out.println(max);
    }
}