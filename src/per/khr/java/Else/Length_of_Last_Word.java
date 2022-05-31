package per.khr.java.Else;

public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        s = s.stripTrailing();
        String[] sArr = s.split(" ");

        return sArr[sArr.length - 1].length();
    }
}