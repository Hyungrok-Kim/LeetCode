package per.khr.java.Else;

public class Add_Binary {
    public String addBinary(String a, String b) {
        Integer aToDecimal = Integer.parseInt(a, 2);
        Integer bToDecimal = Integer.parseInt(b, 2);

        return Integer.toBinaryString( aToDecimal + bToDecimal);
    }
}
