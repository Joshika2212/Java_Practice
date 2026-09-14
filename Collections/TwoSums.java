/*Find two numbers whose sum is 10
Input:[2, 7, 3, 8, 5, 1]
Output:
2 + 8 = 10
3 + 7 = 10 */

package Collections;
import java.util.*;

public class TwoSums {
    public static void main(String[] args){
        int[] input = {2, 7, 3, 8, 5, 1};
        Set<Integer> sum = new HashSet<>();
        for(int i : input){
            int req = 10-i;
            if(sum.contains(req)){
                System.out.println(req + "+" + i + "= 10");
            }
            sum.add(i);
        }
    }
}
