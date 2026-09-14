/*— First Duplicate That Becomes Invalid
1. Problem Statement
A transaction system receives transaction IDs in processing order.
A transaction becomes invalid when it appears for the second time.
Return the first transaction that becomes invalid.
If no transaction is repeated, return NONE.
2. Input
[T100, T200, T300, T400, T200, T500]
3. Output
T200 */

package Collections;
import java.util.*;

public class FirstInvalidTransaction {
    public static void main(String[] args){
        List<String> inputTrans = Arrays.asList("T100", "T200", "T300", "T400", "T200", "T500");
        Set<String> nondupSet = new HashSet<>();
        for(String s: inputTrans){
            /*if(nondupSet.contains(s)){
                System.out.println(s);
                break;
            }
            nondupSet.add(s);
        }
        if(inputTrans.size() == nondupSet.size())
            System.out.println("NONE");*/
            if(!nondupSet.add(s)){
                System.out.println(s);
                return;
            }
        }
        System.out.println("None");
    }
}
