// https://leetcode.com/problems/clear-digits/?envType=daily-question&envId=2025-02-10
public class ClearDigits {
    public String clearDigits(String s) {
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (char a : s.toCharArray()) {
            if (Character.isDigit(a)) {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(a);
            }
        }
        return sb.toString();
    }
}
