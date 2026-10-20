/*Problem Statement
An organization stores employee salary information in:
employees.txt:
E101,Arun,50000
E102,Ravi,65000
E103,Meena,72000
E104,John,45000

Generate a file called: payroll-report.txt
containing:
Employee Payroll Report
-----------------------
E101 Arun  Gross Salary: 50000.0
E102 Ravi  Gross Salary: 65000.0
E103 Meena Gross Salary: 72000.0
E104 John  Gross Salary: 45000.0
-----------------------
Total Payroll: 232000.0 */

import java.io.*;

public class PayrollReportGenerator {
    public static void main(String[] args){
        File f = new File("payroll-report.txt");
        double total = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\employee.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write("Employee Payroll Report");
            bw.newLine();
            bw.write("---------------");
            bw.newLine();
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",",-1);
                double amount = Double.parseDouble(data[2]);
                total += amount;
                bw.write(data[0] +" "+ data[1] +" " + "Gross Salary: "+ amount);
                bw.newLine();
            }
            bw.write("---------------");
            bw.newLine();
            bw.write("Total Payroll: "+ total);
            br.close();
            bw.close();
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
