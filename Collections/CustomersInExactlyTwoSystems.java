/*Find Customers Present in Exactly Two Systems
1. Problem Statement
Three banking systems contain customer IDs.
Find customers who are present in exactly two systems.
Customers present in all three systems must be excluded.
2. Input
A = [C01, C02, C03, C04]
B = [C02, C03, C05]
C = [C03, C04, C06]
3. Output
[C02, C04] */

package Collections;
import java.util.*;

public class CustomersInExactlyTwoSystems {
    public static void main(String[] args){
        List<String> sysA = Arrays.asList("C01","C02","C03","C04");
        List<String> sysB = Arrays.asList("C02","C03","C05");
        List<String> sysC = Arrays.asList("C03","C04","C06");
        List<String> commonCustomer = new ArrayList<>();
        Map<String,Integer> customerFrequency = new HashMap<>();
        for(String customerA : sysA){
            customerFrequency.put(customerA,customerFrequency.getOrDefault(customerA, 0)+1);
        }
        for(String customerB : sysB){
            customerFrequency.put(customerB,customerFrequency.getOrDefault(customerB, 0)+1);
        }
        for(String customerC : sysC){
            customerFrequency.put(customerC,customerFrequency.getOrDefault(customerC, 0)+1);
        }
        for(Map.Entry<String,Integer> entry : customerFrequency.entrySet()){
            if(entry.getValue() == 2)
                commonCustomer.add(entry.getKey());
        }
        System.out.println(commonCustomer);
    }
}
