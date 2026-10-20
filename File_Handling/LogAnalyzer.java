/*
Problem Statement
A production application generates a log file:
application.log
Example:
2026-10-01 INFO User login successful
2026-10-01 ERROR Database connection failed
2026-10-01 INFO User logged out
2026-10-01 ERROR Payment service unavailable
2026-10-01 WARN Disk space low

Write a program to:
•	Count INFO 
•	Count WARN 
•	Count ERROR 
•	Print all error messages
Expected Output:
INFO  : 2
WARN  : 1
ERROR : 2

Error Messages:
Database connection failed
Payment service unavailable */

import java.io.*;
public class LogAnalyzer {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\application.log"));
            int infoCount = 0, warnCount = 0, errorCount = 0;
            //String str = 
            String line;
            while((line = br.readLine()) != null){
                if(line.contains("INFO")) infoCount++;
                if(line.contains("WARN")) warnCount++;
                if(line.contains("ERROR")) {
                    errorCount++;
                    String[] data = line.split("ERROR",2);
                    if(data.length == 2) 
                        System.out.println(data[1]);
                }
            }
            br.close();
            System.out.println("Expected OUTPUT:");
            System.out.println("INFO: "+ infoCount);
            System.out.println("WARN: "+ warnCount);
            System.out.println("ERROR: "+ errorCount);
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
