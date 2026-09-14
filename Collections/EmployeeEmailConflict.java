/*Find Employees Sharing the Same Email
1. Problem Statement
An organization expects each email address to belong to only one employee.
Find email addresses mapped to multiple employee IDs.
Ignore repeated occurrences of the same employee-email combination.
2. Input
E01,ravi@company.com
E02,anu@company.com
E03,ravi@company.com
E01,ravi@company.com
E04,kiran@company.com
3. Output
ravi@company.com -> [E01, E03] */

package Collections;
import java.util.*;

public class EmployeeEmailConflict {
    public static void main(String[] args){
        String[][] empMail = {{"E01","ravi@company.com"},{"E02","anu@company.com"},{"E03","ravi@company.com"},{"E01","ravi@company.com"},{"E04","kiran@company.com"}};
        Map<String,Set<String>> empRecords = new LinkedHashMap<>();
        for(String[] row : empMail){
            empRecords.computeIfAbsent(row[1], k-> new LinkedHashSet<>()).add(row[0]);
        }
        for(Map.Entry<String,Set<String>> entry : empRecords.entrySet()){
            if(entry.getValue().size() > 1){
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
