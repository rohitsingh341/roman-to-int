package co.rohit.dsa;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntTry1 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int num = romanToInt(s);
        System.out.println("Roman " + s + " to in -> " + num);
    }

    private static int romanToInt(String str) {
        Map<Character, Integer> romanToInMap = new HashMap<>();
        romanToInMap.put('I', 1);
        romanToInMap.put('V', 5);
        romanToInMap.put('X', 10);
        romanToInMap.put('L', 50);
        romanToInMap.put('C', 100);
        romanToInMap.put('D', 500);
        romanToInMap.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && romanToInMap.get(str.charAt(i)) < romanToInMap.get(str.charAt(i+1))) {
                sum -= romanToInMap.get(str.charAt(i));
            }
            else {
                sum += romanToInMap.get(str.charAt(i));
            }
        }
        return sum;
    }
}
