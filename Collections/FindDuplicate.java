/*3. 3. Find duplicate elements
Question:
Print only the duplicate elements from a list.
Input:[10, 20, 10, 30, 20, 40, 50]
Expected output: 
10
20 */

package Collections;
import java.util.*;

public class FindDuplicate {
    public static void main(String[] args){
        List<Integer> input  = Arrays.asList(10, 20, 10, 30, 20, 40, 50);
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        Set<Integer> dupSet = new HashSet<>();
        for(Integer i: input){
            if(!dupSet.add(i))
                uniqueSet.add(i);                
        }
        System.out.println(uniqueSet);
    }
}


        /*List<Integer> input  = Arrays.asList(10, 20, 10, 30, 20, 40, 50);
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for(Integer i: input){
            if(uniqueSet.contains(i))
                System.out.println(i);
            else
                uniqueSet.add(i);
        }*/
