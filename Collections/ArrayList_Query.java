package Collections;

import java.util.ArrayList;

public class ArrayList_Query {
    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        A.add(x);
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {
        int min = A.;
        int temp = 0;
        for(int i=0;i<A.size();i++){
            if(A[i]<min){
                temp = min;
                min = A[i];
                A[i] = temp;
            }
        }
    }

        
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Just reverse, don't print anything
        int l = 0, r = A.size()-1, temp;
        while(l<r){
            temp = A[l];
            A[l] = A[r];
            A[r] = temp;
            l++,r--;
        }
    }
        

    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Return the size of ArrayList
        return A.size();
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        // Your code here
        // Just sort in desc order, don't print anything
        int max = A[0];
        int temp = 0;
        for(int i=0;i<A.size();i++){
            if(A[i]>max){
                temp = ax;
                max = A[i];
                A[i] = temp;
            }
        }
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Print the elements of A, don't add new line
        System.out.print(A);
    }
}
