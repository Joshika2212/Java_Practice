/*Question:
Find how many times each number occurs.
Input:[10, 20, 10, 30, 20, 10] 
Output: 10-3, 20-2, 30-1*/
package Collections;
import java.util.*;

public class NumberFrequency {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(10, 20, 10, 30, 20, 10);
        Map<Integer,Integer> freq = new TreeMap<>();
        for(Integer i: input){
            //freq.put(i,freq.getOrDefault(freq, 0)+1);
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }
        System.out.println(freq);
    }
}

// find out the best of three - HashMap, LinkedHashMap and TreeMap