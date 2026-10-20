/*Problem Statement
An application maintains:
audit.log
Existing content:
LOGIN - USER101
TRANSFER - USER101
LOGOUT - USER101
Every execution of the program must append a new audit event.
It must never overwrite existing records.
Write a program that appends:
LOGIN - USER202 */
import java.io.*;

public class AuditLogAppender {
    public static void main(String[] args){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\audit.log",true));
            bw.newLine();
            bw.write("LOGIN - USER202");
            bw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
