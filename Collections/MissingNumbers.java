/*Find missing numbers using a Set
Numbers from 1 to 10 should be present.
[1, 2, 3, 5, 6, 8, 9, 10]
Find missing numbers.
Expected: [4, 7]*/

package Collections;
import java.util.*;

public class MissingNumbers {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(1, 2, 3, 5, 6, 8, 9, 10);
        Set<Integer> num = new HashSet<>(input);
        for(int i=1;i<=10;i++){
            if(!num.contains(i))
                System.out.println(i);
        }
    }
}
