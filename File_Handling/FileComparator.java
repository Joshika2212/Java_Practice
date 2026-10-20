/*Problem Statement
Two banking systems produce customer files:
systemA.txt
systemB.txt
Determine whether the files contain exactly the same content.
The files may be large.
Constraint
Do not load both files completely into memory. */
import java.io.*;
public class FileComparator {
    public static boolean isFileIdentical(String systemA, String systemB){
        try{
            BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\systemA.txt"));
            BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\systemB.txt"));
            int bytesReadA, bytesReadB;
            while(true){
                bytesReadA = bis1.read();
                bytesReadB = bis2.read();
                if(bytesReadA != bytesReadB){
                    return false;
                }
                if(bytesReadA == -1){
                    return true;
                }
            }

            //bis1.close();
            //bis2.close();
        }
        catch(IOException e){
            return false;
        }
    }

    public static void main(String[] argss){
        try{
            String file1 = "C:\\\\Users\\\\venni\\\\OneDrive\\\\Desktop\\\\GitRepo\\\\Java_Practice\\\\File_Handling\\\\systemA.txt";
            String file2 = "C:\\\\Users\\\\venni\\\\OneDrive\\\\Desktop\\\\GitRepo\\\\Java_Practice\\\\File_Handling\\\\systemB.txt";
            boolean fileIdentical;
            fileIdentical = isFileIdentical(file1,file2);
            System.out.println(fileIdentical);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
