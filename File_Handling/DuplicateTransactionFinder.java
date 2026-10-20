/*Bank Transaction Deduplication
Problem Statement
A banking system receives a daily transaction file:
transactions.txt
Example:
T1001,ACC101,DEPOSIT,5000
T1002,ACC102,WITHDRAW,2000
T1001,ACC101,DEPOSIT,5000
T1003,ACC103,DEPOSIT,7000
T1002,ACC102,WITHDRAW,2000
Due to an upstream system problem, duplicate transaction records may appear.

Write a Java program that:
•  Reads the file line by line. 
•  Identifies duplicate transactions using TransactionId. 
•  Writes only the first occurrence to unique-transactions.txt. 
•  Writes duplicate records to duplicate-transactions.txt.
Expected Output:
unique-transactions.txt
T1001,ACC101,DEPOSIT,5000
T1002,ACC102,WITHDRAW,2000
T1003,ACC103,DEPOSIT,7000
duplicate-transactions.txt:
T1001,ACC101,DEPOSIT,5000
T1002,ACC102,WITHDRAW,2000 */
import java.io.*;
import java.util.*;

public class DuplicateTransactionFinder {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\transaction1.txt"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("unique_trasactions.txt"));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("duplicate_transactions.txt"));
            
            Set<String> transactionID = new HashSet<>();

            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",",-1);
                String tranID = data[0];
                if(transactionID.add(tranID)){
                    bw1.write(line);
                    bw1.newLine();
                }
                else{
                    bw2.write(line);
                    bw2.newLine();
                }
            }
            br.close();
            bw1.close();
            bw2.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
