import java.io.*;

public class DataSample7 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\tran2.txt"));
            //BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\ravi.txt"));
            String line;
            int count = 0;
            int total = 0;
            int max = 0;
            int min = Integer.MAX_VALUE;
            System.out.println("Ravi Transactions: ");
            while((line = br.readLine()) != null){
                if(line.contains("Ravi")){
                    System.out.println(line);
                    String[] data = line.split(" ");
                    int amount = Integer.parseInt(data[2]);
                    total += amount;
                    if(amount > max)
                        max = amount;
                    if(amount < min)
                        min = amount;
                    //bw.write(line);
                    //bw.newLine();
                    count++;                    
                }
            }
            br.close();
            //bw.close();
            System.out.println("\nCount: "+count);
            System.out.println("Total: "+total);
            System.out.println("Highest: "+max);
            System.out.println("Lowest: "+min);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Transaction");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
