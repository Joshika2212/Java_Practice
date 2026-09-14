/*Find the top 3 highest unique numbers
Input: [10, 50, 20, 80, 80, 60, 50]
Expected output:
80 60 50 */

package Collections;
import java.util.*;

public class TopThree {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(10, 50, 20, 80, 80, 60, 50);
        TreeSet<Integer> sortedSet = new TreeSet<>(input);
        /*for(int i=0;i<3;i++){
            System.out.print(sortedSet.last()+" ");
            sortedSet.removeLast();
        }*/
        Iterator<Integer> itr = sortedSet.descendingIterator();
        int count = 0;
        while(itr.hasNext() && count<3){
            System.out.println(itr.next());
            count++;
        }
    }
}
