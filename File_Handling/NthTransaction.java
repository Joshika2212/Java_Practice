/*Problem Statement
A transaction file contains millions of records.
Write a program to retrieve the 10th transaction without using:
Files.readAllLines()
or loading the complete file into memory.

T1002,ACC102,WITHDRAW,2000*/
import java.io.*;

public class NthTransaction {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\transaction1.txt"));
            int count = 0;
            int target = 10;
            String line;
            while((line = br.readLine()) != null){
                count++;
                if(count == target){
                    System.out.println(line);
                    break;
                }
            }
            br.close();
            if(count<target){
                System.out.println("Transaction not available");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
