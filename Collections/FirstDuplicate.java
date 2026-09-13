/*Find the first duplicate element
Input: [10, 20, 30, 20, 40, 10]
Expected output: 20 */

package Collections;
import java.util.*;

public class FirstDuplicate {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(10, 20, 30, 20, 40, 10);
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for(Integer i: input)
            if(!uniqueSet.add(i)){
                System.out.println(i);
                break;
            }
    }
}
