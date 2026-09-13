// Get the elements of an array as input from user and insert into ArrayList and print them out.

package Collections;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static ArrayList<Integer> arrayToList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the input array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(arrayToList(arr));
        sc.close();
    }
}