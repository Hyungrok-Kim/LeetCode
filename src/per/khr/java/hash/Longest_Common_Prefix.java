package per.khr.java.hash;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        // 내 답안
        String result = "";

        Character before;
        for (int i = 0; true; ++i) {
            if(strs[0].length() - 1 >= i) {
                before = strs[0].charAt(i);
            } else return result;

            for (String str : strs) {
                if (str.length() > i && str.charAt(i) == before) {
                    continue;
                } else {
                    return result;
                }
            }

            result += strs[0].charAt(i);
        }

        // 멋진 답안
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
        // 1) string builder
//        StringBuilder result = new StringBuilder();
//
//        // Sort array
//        Arrays.sort(strs);
//
//        // split first and last to char
//        char[] first = strs[0].toCharArray();
//        char[] last = strs[strs.length - 1 ].toCharArray();
//
//        // loop through
//        for (int i = 0; i < first.length && i < last.length; i++) {
//            if (first[i] == last[i]) {
//                result.append(first[i]);
//            }
//            else
//                return result.toString();
//        }
//        return result.toString();
    }
}
