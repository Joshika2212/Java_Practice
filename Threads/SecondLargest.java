/*
Return the second-largest distinct number. Do not sort the input and handle duplicates correctly.
Sample Input
[5, 9, 9, 3, 7]
Expected Output
7
*/

public class SecondLargest {
    public static int secondLarge(int[] arr){
        int max = arr[0];
        int smax = 0;
        for(int i=0;i<arr.length;i++){
            int temp = max;
            if(arr[i] > max){
                max = arr[i];
                if(max > smax)
                    smax = temp;
            }
            if(arr[i] > smax && arr[i]!=max)
                smax = arr[i];
        }
        return smax;
    }
    public static void main(String[] args){
        int[] input = {4,4,4,4};//{5,9,9,3,7};
        int res = secondLarge(input);
        if(res == 0) System.out.println("null");
        else System.out.println(res);
    }
}
