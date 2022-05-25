package per.khr.java.hash;

import java.util.HashMap;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();

        char[] cArr = s.toCharArray();

        for (Character c : cArr) {
            int count = hs.getOrDefault(c, 0);

            hs.put(c, count + 1);
        }

        for (Integer i : hs.values()) {
            if (i % 2 != 0) return false;
        }

        return true;
    }
}
