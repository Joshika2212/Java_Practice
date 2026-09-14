/*Given: A -> 50 B -> 20 C -> 80 D -> 40
Sort the map based on values.
Expected output: B -> 20 D -> 40 A -> 50 C -> 80 */

package Collections;
import java.util.*;

public class SortMapByValue {
    public static void main(String[] args){
        Map<String,Integer> input  = new HashMap<>();
        input.put("A",50);
        input.put("B",20);
        input.put("C",80);
        input.put("D",40);
        System.out.println(input);
        Map<String,Integer> sortedMap = new TreeMap<>();
        for(Map.Entry<String,Integer> entry : input.entrySet()){

            sortedMap.put(entry.getKey(),entry.getValue());
            System.out.println(sortedMap.getValue());
        }
        //System.out.println(sortedMap);
        
    }
}
