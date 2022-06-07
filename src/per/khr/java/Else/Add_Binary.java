package per.khr.java.Else;

// long으로도 감당이 안되는 크기의 수가 나왔다..
public class Add_Binary {
    // Solution 1
//    public String addBinary(String a, String b) {
//        BigInteger aBi = new BigInteger(a, 2);
//        BigInteger bBi = new BigInteger(b, 2);
//
//        return aBi.add(bBi).toString(2);
//    }

    // Solution 2
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int aTarget = a.length() - 1;
        int bTarget = b.length() - 1;

        while (aTarget >= 0 || bTarget >= 0) {
            int temp = 0;
            int target = Character.getNumericValue(a.charAt(aTarget--)) + Character.getNumericValue(b.charAt(bTarget--)) + temp;
            if (target >= 2) {
                temp++;
                sb.append(target - 2);
            } else sb.append(target);

            temp = 0;
        }

    }


}
