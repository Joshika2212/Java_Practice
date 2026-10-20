/*
A transaction import contains numeric strings, malformed strings, and negative amounts. Reject bad records but process the remaining input.
String[] rows = {"100", "250", "ABC", "-50", "400"};
*/

public class TransactionProcessor {
    
    public static void main(String[] args){
        String[] rows = {"100", "250", "ABC", "-50", "400"};
        int amount = 0;
        int countA = 0;
        int countR = 0;
        for(String value : rows){
            try{
                int num = Integer.parseInt(value);
                if(num > 0){
                    amount += num;
                    countA++;
                }
                else
                    countR++;
            }
            catch(Exception e){
                countR++;
            }
        }
        System.out.println("Total :"+amount);
        System.out.println("Accepted: "+countA);
        System.out.println("Rejected: "+countR);
    }
}
