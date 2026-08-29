package Exception_Handling;

public class StringIndexEx {
    public static void main(String[] args){
        try{
            String s = "Hello this is me";
            char c = s.charAt(25);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
