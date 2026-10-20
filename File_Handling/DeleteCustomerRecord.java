/*Remove a Customer Record From a File
Problem Statement
A customer file contains:
C001,Arun
C002,Ravi
C003,Meena
C004,John
Delete customer C002. */
import java.io.*;
public class DeleteCustomerRecord {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\customerfile.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("customerfileupdt.txt"));
            String line;
            String target = "C002";
            while((line = br.readLine()) != null){
                String[] data = line.split(",",-1);
                if(!data[0].equals(target)){
                    bw.write(line);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
