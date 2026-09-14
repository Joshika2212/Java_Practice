/*Last Unique Customer
1. Problem Statement
Given customer IDs in processing order, find the last customer who appears exactly once.
The result must be based on original order, not sorted order.
2. Input
[C01, C02, C03, C02, C04, C01, C05]
3. Output
C05 */

package Collections;
import java.util.*;

public class LastUniqueCustomer {
    public static void main(String[] args){
        List<String> input = Arrays.asList("C01", "C02", "C03", "C02", "C04", "C01", "C05");
        Map<String,Integer> frequency = new LinkedHashMap<>();
        for(String s: input){
            frequency.put(s,frequency.getOrDefault(s, 0)+1);
        }        
        String uniqueCustomer = "none";
        /*for(Map.Entry<String,Integer> entry : frequency.entrySet()){
            if(entry.getValue() == 1)
                uniqueCustomer = entry.getKey();
        }*/
        for(String s: input){
            if(frequency.get(s)==1){
                uniqueCustomer = s;
            }
        }  
        System.out.println(uniqueCustomer);
    }
}
