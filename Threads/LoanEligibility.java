public class LoanEligibility {
    public static boolean customerStatus(boolean status){
        return status;
    }
    public static boolean incomeChecker(double income){
        return (income >= 600000);
    }
    public static boolean creditChecker(int score){
        return (score >= 700);
    }
    public static void main(String[] args){
        boolean eligible = customerStatus(true) && incomeChecker(656789) && creditChecker(850);
        if(eligible)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}
