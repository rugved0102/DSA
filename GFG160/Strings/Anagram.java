import java.util.Arrays;

class Anagram{
    public static boolean areAnagrams(String s1, String s2) {

         char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }
}