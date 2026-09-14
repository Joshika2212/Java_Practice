/*— Find Customers Missing From One System
1. Problem Statement
System A contains all registered customers.
System B contains customers who successfully migrated.
Find customers present in A but missing in B.
The output must preserve the order from System A.
2. Input
System A:
[C01, C02, C03, C04, C05]

System B:
[C03, C01, C05]
3. Output
[C02, C04] */

package Collections;
import java.util.*;

public class MissingCustomers {
    public static void main(String[] args){
        List<String> sysA = Arrays.asList("C01", "C02", "C03", "C04", "C05");
        List<String> sysB = Arrays.asList("C03", "C01", "C05");
        /*for(String s : sysA){
            if(!sysB.contains(s))
                System.out.println(s);
        }*/
        sysA.removeAll(sysB);
        System.out.println(sysA);
    }
}
