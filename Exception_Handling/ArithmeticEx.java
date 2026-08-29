package Exception_Handling;

public class ArithmeticEx {
    public static void main(String[] args){
        try{
            int a = 10, b = 0;
            System.out.println("Result: "+ a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
    }
}
