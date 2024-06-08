package tools;
import java.util.Arrays;

public class AnagramChecker {

	public String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    public boolean isAnagrams(String s1, String s2) {
        return sort(s1).equals(sort(s2));
    }

}
