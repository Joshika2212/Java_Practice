/*Expected: accepted balances 1500, 1300, then insufficient funds rejected, then 1600, zero rejected, then 1500. Final balance 1500; accepted 4; rejected 2. */
public class SingleThread1 {
    public static void main(String[] args){
        int[] transactions = {500, -200, -2000, 300, 0, -100};
        int balance = 1000;
        int countRej =0;
        int countAcc = 0;
        for(int i:transactions){
            if(i == 0){
                countRej++;
                System.out.println("zero rejected");
            }
            else if(i>=0){
                countAcc++;
                balance += i;
                System.out.println("accepted balances "+balance);
            }
            else{
                if((balance + i) < 0){
                    System.out.println("then insufficient funds rejected");
                    countRej++;
                }
                else{
                    balance += i;
                    System.out.println("then "+balance);
                    countAcc++;
                }
            }
                
        }
        System.out.println("Final Balance "+balance);
        System.out.println("accepted "+countAcc);
        System.out.println("rejected "+countRej);
    }
}
