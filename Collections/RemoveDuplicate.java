/*Question:
Given an ArrayList<Integer>, remove duplicate elements while preserving the original insertion order.
Input: [10, 20, 10, 30, 20, 40]
Expected output: [10, 20, 30, 40] */

package Collections;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args){
        
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40);
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        System.out.println(uniqueSet);
    }
}
