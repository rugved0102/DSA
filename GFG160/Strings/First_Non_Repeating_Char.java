import java.util.Arrays;

class First_Non_Repeating_Char {
    static char nonRepeatingChar(String s) {
        int[] arr = new int[26];
        int ans = Integer.MAX_VALUE;
        Arrays.fill(arr,-1);
        for(int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i) - 'a'] == -1) {
                arr[s.charAt(i) - 'a'] = i;
            }
            else {
                arr[s.charAt(i) - 'a'] = -2;
            }
        }
        for(int j = 0; j < 26; j++){
            if(arr[j] >= 0) {
                ans = Math.min(ans, arr[j]);
            }
        }
        return (ans == Integer.MAX_VALUE?'$':s.charAt(ans));
    }
}