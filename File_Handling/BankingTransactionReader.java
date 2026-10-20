import java.io.*;

public class BankingTransactionReader {
    public static void main(String[] args){
        
        double deposit = 0, withdraw=0;
        int validTransaction = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\venni\\OneDrive\\Desktop\\GitRepo\\Java_Practice\\File_Handling\\transaction.txt"));
            String line;
            
            while((line = br.readLine()) != null){
                String[] data = line.split(",",-1);
                
                if(data.length != 4 || data[0].trim().isEmpty() || data[1].trim().isEmpty() || data[2].trim().isEmpty() || data[3].trim().isEmpty()){
                    continue;
                }
                double amount = Double.parseDouble(data[3]);
                //System.out.println(amount);
                if(line.contains("DEPOSIT")){
                    deposit += amount;
                }
                if(line.contains("WITHDRAW"))
                    withdraw += amount;
                validTransaction++;
            }
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

        System.out.println("Total Deposit: "+ deposit);
        System.out.println("Total Withdraw: "+ withdraw);
        System.out.println("Total valid transactions: "+ validTransaction);
        
    }
}
