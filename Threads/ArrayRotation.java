/*
Problem Statement
Move all zero values to the end in place while preserving the relative order of non-zero elements.
Sample Input
[0, 5, 0, -2, 8]
Expected Output
[5, -2, 8, 0, 0]
*/

public class ArrayRotation {
    public static void rotate(int[] arr){
        int[] newarr = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0)
                newarr[j++] = arr[i];
        }
        for(int k=0;k<newarr.length;k++){
            System.out.print(newarr[k]+" ");
        }
    }
    public static void main(String[] args){
        int[] input = {0,5,0,-2,8};
        rotate(input);
    }
}
