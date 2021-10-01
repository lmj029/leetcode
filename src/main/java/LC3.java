import java.util.HashSet;
import java.util.Set;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        Set<Character> set = new HashSet<>();
        int aPoint = 0;
        int bPoint = 0;
        while (bPoint < s.length()) {
            if(!set.contains(s.charAt(bPoint))) {
                set.add(s.charAt(bPoint));
                maxCount = maxCount > bPoint - aPoint + 1 ? maxCount : bPoint - aPoint + 1;
                bPoint += 1;
            } else {
                set.remove(s.charAt(aPoint));
                aPoint += 1;
            }
        }
        return maxCount;


    }
}
