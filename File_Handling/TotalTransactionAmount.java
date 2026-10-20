/*Problem Statement
A bank receives millions of transaction records.
The application must process the file without loading the complete file into memory.
Example:
T001,ACC1001,500
T002,ACC1002,1500
T003,ACC1001,700
T004,ACC1003,2000
Calculate the total transaction amount for each account.
Expected Output
ACC1001 -> 1200.0
ACC1002 -> 1500.0
ACC1003 -> 2000.0 */

import java.io.*;
import java.util.*;

public class TotalTransactionAmount {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\tranAmount.txt"));
            Map<String,Double> totalTransaction = new HashMap<>();
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",",-1);
                String accountNum = data[1];
                double amount = Double.parseDouble(data[2]);
                totalTransaction.merge(accountNum, amount, Double::sum);
            }
            //System.out.println(totalTransaction);
            totalTransaction.forEach((accountNum,total) -> System.out.println(accountNum+" -> "+total));
            br.close();
        }
        catch(NumberFormatException e){
            System.out.println("Error");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found -"+ e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error -"+ e.getMessage());
        }
    }
}
