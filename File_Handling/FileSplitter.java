/*Split a Large File Into Smaller Files
Problem Statement
A banking system generates a huge transaction file:
transactions.txt
The downstream system can process only 3 records per file.
Split:
transactions.txt
into:
transactions-1.txt transactions-2.txt transactions-3.txt */
import java.io.*;
public class FileSplitter {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\FileSplitTran.txt"));
        BufferedWriter bw = null;
        int noOfRecordsPerFile = 3;
        int recordCount = 0;
        int fileNumber = 1;
        String line;
        while((line = br.readLine()) != null){
            if((recordCount % noOfRecordsPerFile) == 0){
                bw = new BufferedWriter(new FileWriter("transactions-"+fileNumber+".txt"));
                fileNumber++;
            }
            bw.write(line);
            bw.newLine();
            recordCount++;
        }
        //br.close();
        bw.close();
    }
}
