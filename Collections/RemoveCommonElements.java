/*Find elements present in one list but not another
Input:
List1 = [10, 20, 30, 40] 
List2 = [30, 40, 50]
Expected output: [10, 20] */

package Collections;
import java.util.*;

public class RemoveCommonElements {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> list2 = Arrays.asList(30, 40, 50, 60);
        list1.removeAll(list2);
        System.out.println(list1);
    }
}

