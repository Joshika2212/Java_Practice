/*— Find the Customer With Maximum Number of Products
1. Problem Statement
Given customer-product transactions, find the customer who owns the largest number of distinct products.
If two customers have the same count, return the customer appearing first in the input.
2. Input
C01-P01
C02-P01
C01-P02
C01-P01
C02-P02
C02-P03
C03-P01
3. Output
C02 -> 3 */

package Collections;
import java.util.*;

public class CustomerWithMaxUniqueProducts {
    public static void main(String[] args){
        String[][] customerProd = {{"C01","P01"},{"C02","P01"},{"C01","P02"},{"C01","P01"},{"C02","P02"},{"C02","P03"},{"C03","P01"}};
        Map<String,Set<String>> products = new LinkedHashMap<>();
        for(String[] row : customerProd){
            products.computeIfAbsent(row[0], k-> new LinkedHashSet<>()).add(row[1]);
        }
        String customer = "none";
        int maxcount = 0;
        for(Map.Entry<String,Set<String>> entry : products.entrySet()){
            if((entry.getValue()).size() > maxcount){
                maxcount = entry.getValue().size();
                //System.out.println(maxcount);
                customer = entry.getKey();
                //System.out.println(customer);
            }                  
        }        
        System.out.println(customer);  
    }
}
