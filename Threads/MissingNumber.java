/*
An array contains distinct values from 1..n with one value missing. Find it without sorting.
Sample Input
[1, 2, 4, 5], n=5
Expected Output
3
*/

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7,8};
        int n = 10;
        int num = 1;
        int i=0;
        while(num <= n){
            if(arr[i] != num){
                System.out.println(num);
            }
            else{
                if(i == arr.length-1) i=i;
                else i++;
            }
            num++;
        }
    }
}
