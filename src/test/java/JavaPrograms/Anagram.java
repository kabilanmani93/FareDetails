package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    private static final int NO_OF_CHARS = 256;

    public static void main(String[] args) {

        String S1 = "cAr";
        String S2 = "rac";

        System.out.println(isAnagram(S1, S2));
        //checkchar();
        isAnagramUnicode(S1, S2);
    }

    private static boolean isAnagram(String s1, String s2) {

        // convert to char array , sort it using Arrays.sort() , and then equals Arrays.equals();

        int[] counter = new int[NO_OF_CHARS]; //26 because it has only lower case

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            counter[s1.charAt(i)]++;
            counter[s2.charAt(i)]--;
        }

        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramUnicode(String s1, String s2) {
        int[] counter = new int[NO_OF_CHARS]; //26 because it has only lower case

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1ca = s1.toCharArray();
        char[] s2ca = s2.toCharArray();

        Map<Character, Integer> charmap = new HashMap<>();

        for (Character temp : s1ca) {
            Integer count = charmap.get(temp);
            charmap.put(temp, (count == null) ? 1 : count + 1);
        }
        System.out.println(charmap + " " +charmap.size());


        for (Character temp2 : s2ca)
        {
            Integer count2 = charmap.get(temp2);
            if (charmap.containsKey(temp2))
                // if this if condition is not included then null pointer exception shall be thrown
            {
                if (count2 == 1) {
                    charmap.remove(temp2);
                } else
                {
                    charmap.put(temp2, count2 - 1);
                }
            }
        }



            return charmap.size() > 0 ? false : true;


//        Map<Character, Integer> strmap = new HashMap<>();
//        for (int i = 0; i < s1.length(); i++) {
//            char c1 = s1.charAt(i);
//            if (strmap.containsKey(c1)) {
//                strmap.put(c1, strmap.get(c1) + 1);
//            } else {
//                strmap.put(c1, 1);
//            }}






    }

    public static void checkchar(){
        int[] count = new int[255];
        count['a']++;
        count['a']++;
        System.out.println(count['a']);

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println(count[i]);
            }

        }
        System.out.println(count[98] + " check " + count[97]);
    }
}