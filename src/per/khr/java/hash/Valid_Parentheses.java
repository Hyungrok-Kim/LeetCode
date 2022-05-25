package per.khr.java.hash;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        // 내 답안..
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
}
