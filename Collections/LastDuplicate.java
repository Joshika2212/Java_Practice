/*Find the last duplicate element:
Input: [10, 20, 30, 20, 40, 10, 50]
Output: 10 */

package Collections;
import java.util.*;

public class LastDuplicate {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        Integer lastDuplicate = null;
        for(Integer i: input)
            if(!uniqueSet.add(i)){
                lastDuplicate = i;                
            }
        System.out.println(lastDuplicate);
    }
}
