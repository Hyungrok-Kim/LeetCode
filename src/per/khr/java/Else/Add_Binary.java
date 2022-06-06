package per.khr.java.Else;

// long으로도 감당이 안되는 크기의 수가 나왔다..
public class Add_Binary {
    //    public String addBinary(String a, String b) {
//        long aToDecimal = Long.valueOf(a, 2);
//        long bToDecimal = Long.valueOf(b, 2);
//
//        return Long.toBinaryString(aToDecimal + bToDecimal);
//    }

    public String addBinary(String a, String b) {
        int lenDiff = a.length() - b.length();

        char[] aCArr = a.toCharArray();
        char[] bCArr = b.toCharArray();

        for (int i = aCArr.length - 1; i >= 0; --i) {
            aCArr[i] += bCArr[i - lenDiff];
        }
        return null;
    }
}
