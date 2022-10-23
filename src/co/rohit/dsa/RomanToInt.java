package co.rohit.dsa;

import java.util.Map;
import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] a) {
        //String s = "III"; //3
        String s = "MCMXCIV"; //1994
        int num = getIntFromRoman(s);
        System.out.println("Integer value of Roman number " + s + " is " + num);
    }

    public static int getIntFromRoman(String s) {
        Map<Character, Integer> romanToInMap = new HashMap<>();
        romanToInMap.put('I', 1);
        romanToInMap.put('V', 5);
        romanToInMap.put('X', 10);
        romanToInMap.put('L', 50);
        romanToInMap.put('C', 100);
        romanToInMap.put('D', 500);
        romanToInMap.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && romanToInMap.get(s.charAt(i)) < romanToInMap.get(s.charAt(i+1))) {
                sum = sum - romanToInMap.get(s.charAt(i));
            }
            else {
                sum = sum + romanToInMap.get(s.charAt(i));
            }
        }
        return sum;
    }


}
