/*Find the second-highest number using Collections
Input: [10, 50, 20, 80, 60]
Expected output: 60 */
package Collections;
import java.util.*;

public class SecondHighest {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(10, 50, 20, 80, 60);//10, 20, 20, 30, 30
        TreeSet<Integer> sorted = new TreeSet<>(input);
        sorted.remove((sorted.last()));
        System.out.println(sorted.last());
    }
}
