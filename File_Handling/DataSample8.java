import java.io.*;

public class DataSample8 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\tran2.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\ravi.csv"));
            String line;
            int total = 0;
            int count = 0;
            int max = 0;
            System.out.println("Ravi's Transactions: ");
            while((line = br.readLine()) != null){
                if(line.contains("Ravi")){
                    System.out.println(line);
                    count++;
                    String[] data = line.split(",");
                    int amount = Integer.parseInt(data[2]);
                    total += amount;
                    if(amount > max)
                        max = amount;
                    bw.write(line);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();
            System.out.println("\nTotal: "+total);
            System.out.println("Highest: "+max);
            System.out.println("Count: "+count);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
