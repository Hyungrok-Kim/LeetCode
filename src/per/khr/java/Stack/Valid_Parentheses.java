package per.khr.java.Stack;

import java.util.HashMap;
import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        // 내 답안.. Stack 문제 였구나..
        if (s.length() % 2 != 0) return false;

        while (!s.isBlank()) {
            int initialLength = s.length();

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");

            int endLength = s.length();

            if (initialLength == endLength) return false;
        }

        return true;

        // 쿨한 멋진 답안
//        Map<Character,Character> mappings = new HashMap<Character,Character>(){{
//            put(')', '(');
//            put('}', '{');
//            put(']', '[');
//        }};
//
//        Stack<Character> letters = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++){
//            char temp = s.charAt(i);
//            if(mappings.containsKey(temp)){
//                if(letters.isEmpty() || letters.pop() != mappings.get(temp)){
//                    return false;
//                }
//            } else{
//                letters.push(temp);
//            }
//        }
//        return letters.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hs = new HashMap<>();
        hs.put(')', '(');
        hs.put(']', '[');
        hs.put('}', '{');

        char[] charArr = s.toCharArray();

        if (charArr.length % 2 != 0) return false;

        for (Character c : charArr) {
            if (hs.containsKey(c)) {
                if (!stack.isEmpty() && stack.pop() == hs.get(c)) continue;
                else return false;
            } else {
                stack.push(c);
            }
        }

        if (stack.empty()) return true;
        else return false;
    }
}
