package per.khr.java.DynamicProgramming;

/**
 * 앞으로 읽으나 뒤로 읽으나 똑같은 것을 Palindromic이라고 한다.
 * String s를 Parameter로 받아 가장 긴 Palindromic한 문자열을 return해주면 됨.
 */
public class Longest_Palindromic_Substring {
    String result = "";

    /**
     * 아무래도 가장 긴 Palindromic한 문자열은 s 그대로가 될 수 있겠다.
     * s를 쪼개서 만들 수 있는 모든 경우의 수 중에 가장 length가 긴 문자열을 찾게 되면 완전 탐색이 되기 때문에
     * 시간복잡도를 통과할 수 없음.
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String[] items = s.split("");

        for (int i = 0, iLimit = items.length; i < iLimit; ++i) {
            makeNewString(items, i, items[i]);
        }

        return result;
    }

    public void makeNewString(String[] items, int idx, String newStr) {
        if (result.length() < newStr.length() && palindromicCheck(newStr))
            result = newStr;

        if (idx < items.length - 1)
            makeNewString(items, idx + 1, newStr + items[idx + 1]);
    }

    public boolean palindromicCheck(String newStr) {
        for (int i = 0, iLimit = (newStr.length() / 2); i < iLimit; ++i) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i))
                return false;
        }

        return true;
    }
}
