/*
Calculate how many monthly payments are required to reduce a loan balance to zero or below, ignoring interest. Reject a non-positive payment.
balance:1000 and payment:300 */

public class LoanBalanceAccumulator {
    public static int loanBalance(int balance, int payment){
        if (balance <= 0) {
            return 0;
        }
        return 1+loanBalance(balance-payment, payment);
    }

    public static void main(String[] args){
        System.out.println(loanBalance(1000,300));
    }
}
