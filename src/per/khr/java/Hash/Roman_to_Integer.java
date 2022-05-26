package per.khr.java.Hash;

import java.util.HashMap;

public class Roman_to_Integer {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<String, Integer> oneWordHs = new HashMap<>();
        oneWordHs.put("I", 1);
        oneWordHs.put("V", 5);
        oneWordHs.put("X", 10);
        oneWordHs.put("L", 50);
        oneWordHs.put("C", 100);
        oneWordHs.put("D", 500);
        oneWordHs.put("M", 1000);

        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i + 1 != s.length() && oneWordHs.get(Character.toString(s.charAt(i))) < oneWordHs.get(Character.toString(s.charAt(i + 1)))) {
                answer += (oneWordHs.get(Character.toString(s.charAt(i + 1))) - oneWordHs.get(Character.toString(s.charAt(i))));
                i++;
            } else {
                answer += oneWordHs.get(Character.toString(s.charAt(i)));
            }
        }

        System.out.println(answer);
    }
}
