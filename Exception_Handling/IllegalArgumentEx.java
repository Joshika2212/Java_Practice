package Exception_Handling;

public class IllegalArgumentEx {
    public static void main(String[] args){
        int a = 14;
        if(a < 18)
            throw new IllegalArgumentException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }
}
