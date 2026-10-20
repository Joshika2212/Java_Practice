/*
Return true when two strings contain the same letters, ignoring case and whitespace. Assume basic English letters.
Sample Input
"Dormitory", "Dirty room"
Expected Output
true
*/
import java.util.List;
public class SameLetters {
    public static boolean isSame(String a, String b){
        int[] counts = new int[26];
        for (char c : a.toLowerCase().toCharArray())
            if (c != ' ') counts[c - 'a']++;
        for (char c : b.toLowerCase().toCharArray())
            if (c != ' ') counts[c - 'a']--;
        for (int count : counts)
            if (count != 0) return false;
            return true;
    }

    public static void main(String[] args){
        String a = "Dormitory";
        String b = "Dirty rooms";
        System.out.println(isSame(a,b));
    }
}
