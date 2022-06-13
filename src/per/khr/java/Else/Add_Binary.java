package per.khr.java.Else;

// long으로도 감당이 안되는 크기의 수가 나왔다..
// 그럴 땐 java의 BigInteger Class
// 왜 기여가 안떠
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
        int carry = 0;
        while (aTarget >= 0 || bTarget >= 0) {
            int sum = carry;

            if(aTarget >= 0) {
                sum += Character.getNumericValue(a.charAt(aTarget--));
            }

            if(bTarget >= 0) {
                sum += Character.getNumericValue(b.charAt(bTarget--));
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
