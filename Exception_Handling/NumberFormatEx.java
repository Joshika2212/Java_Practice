package Exception_Handling;

public class NumberFormatEx {
    public static void main(String[] args){
        try{
            int num = Integer.parseInt("jo");
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception");
        }
    }
}
