/*Detect Duplicate Business Records
1. Problem Statement
A business record is considered duplicate only when all three fields match:
customerId + productCode + branchCode
Find duplicate business records.
The same customer appearing with a different product or branch is not a duplicate.
2. Input
C01,P01,B01
C02,P01,B01
C01,P01,B01
C01,P02,B01
C02,P01,B01
3. Output
C01,P01,B01
C02,P01,B01 */

package Collections;
import java.util.*;

public class DuplicateBusinessRecords {
    public static void main(String[] args){
        List<String> records = Arrays.asList("C01,P01,B01","C02,P01,B01","C01,P01,B01","C01,P02,B01","C02,P01,B01");
        Set<String> nondupRecords = new HashSet<>();
        Set<String> dupRecords = new LinkedHashSet<>();
        for(String record : records){
            if(!nondupRecords.add(record))
                dupRecords.add(record);
        }
        System.out.println(dupRecords);
    }
}
