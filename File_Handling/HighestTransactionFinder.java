/*Find the Largest Transaction Without Storing Transactions
Problem Statement
A banking file contains:
T001,5000
T002,9000
T003,2500
T004,15000
T005,7500
Find the transaction having the highest amount.
Constraint
You are not allowed to store all transactions in a collection. */
import java.io.*;
public class HighestTransactionFinder {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\bank.txt"));
            int max = Integer.MIN_VALUE;
            int amount;
            String output = "";
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",",-1);
                amount = Integer.parseInt(data[1]);
                if(amount > max) {
                    max = amount;
                    output = line;
                }
                
            }
            System.out.println(output);
            br.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
