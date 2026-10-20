/*
Problem Statement
Determine whether a non-negative integer reads the same forwards and backwards. Avoid string conversion and avoid overflow.
Sample Input
1221
Expected Output
true
*/

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int rev = 0;
        while(number > rev){
            rev = rev*10 + (number%10);
            number /= 10;
        }
        return number==rev || number==(rev/10);
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}
