package per.khr.java.Else;

public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        if(needle.isBlank()) return 0;
        return haystack.indexOf(needle);
    }
}
