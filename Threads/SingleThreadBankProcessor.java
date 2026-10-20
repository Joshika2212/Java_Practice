public class SingleThreadBankProcessor {
    public static void main(String[] args) {
        int[] transactions = {500, -200, -2000, 300, 0, -100};
        int balance = 1000;
        int accepted = 0;
        int rejected = 0;
 
        for (int i = 0; i < transactions.length; i++) {
            int amount = transactions[i];
 
            if (amount == 0) {
                System.out.println("Transaction " + (i + 1) + ": REJECTED - Invalid amount");
                rejected++;
                continue;
            }
 
            if (amount < 0 && Math.abs((long) amount) > balance) {
                System.out.println("Transaction " + (i + 1) + ": REJECTED - Insufficient funds");
                rejected++;
                continue;
            }
 
            balance += amount;
            accepted++;
            System.out.println("Transaction " + (i + 1) + ": ACCEPTED, balance = " + balance);
        }
 
        System.out.println("Final balance: " + balance);
        System.out.println("Accepted: " + accepted);
        System.out.println("Rejected: " + rejected);
    }
}