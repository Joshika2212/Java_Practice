/*Problem Statement
A banking application stores customer transactions in a binary file.
Create a Java program that:
1.	Reads transaction data using FileInputStream. 
2.	Writes a statement using FileOutputStream. 
3.	Copies the transaction data into an archive file. */

import java.io.*;
public class CustomerStatementArchive {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\TranData.dat");
            FileOutputStream fos = new FileOutputStream("Statement.dat");
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                System.out.println(bytesRead);
            }
            fis.close();
            fos.close();
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
