/*4.4. Find the first non-repeated character
Question:
Given: "swiss"
Find the first character that occurs only once. */

package Collections;
import java.util.*;

public class FirstNonRepetitive {
    public static void main(String[] args){
        String input = "swiss";
        Map<Character,Integer> frequency = new LinkedHashMap<>();
        for(char c: input.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry : frequency.entrySet()){
           if((entry.getValue())==1){
            System.out.print(entry.getKey());
            break;
           } 
        }
        //System.out.println(frequency);
    }
}
