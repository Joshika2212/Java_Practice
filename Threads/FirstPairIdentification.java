/*
Stop both loops as soon as the first pair whose sum equals target is found.
Sample Input
values={2,4,7,9}, target=11
Expected Output
7 + 4 is not in forward order; expected first found pair: 2 + 9
*/

public class FirstPairIdentification {
    public static void main(String[] args){
        int[] values = {2,4,7,9};
        int target = 11;
        boolean flag = false;
        outer:
        for(int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length;j++){
                if((values[i]+values[j]) == target){
                    System.out.println(values[i]+" + "+values[j]);
                    flag = true;
                    break outer;
                }
            }
        }
        if(!flag) System.out.println("no pair found");
    }
}
