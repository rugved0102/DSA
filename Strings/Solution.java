import java.util.ArrayList;
import java.util.List;

class Solution {
    public char processStr(String s, long k) {
        return findKthChar(s.toCharArray(), k);
    }

    private char findKthChar(char[] s, long k) {
        // Stack to simulate operations and length changes
        List<Long> lengthStack = new ArrayList<>();
        List<Character> opStack = new ArrayList<>();
        long currLen = 0;

        for (char ch : s) {
            if (ch == '*') {
                if (currLen > 0) currLen--;
            } else if (ch == '#') {
                currLen *= 2;
            } else if (ch == '%') {
                // Reverse doesn't change length
            } else {
                currLen++;
            }

            // Record operation
            lengthStack.add(currLen);
            opStack.add(ch);

            // Optimization: once length exceeds k, we can stop tracking
            if (currLen > k) break;
        }

        // Now reverse simulate to find the origin of index k
        for (int i = lengthStack.size() - 1; i >= 0; i--) {
            char op = opStack.get(i);
            long len = lengthStack.get(i);

            if (op == '*') {
                // * just deletes one char, doesn't affect k if it's still valid
                continue;
            } else if (op == '#') {
                len /= 2;
                if (k >= len) {
                    k -= len; // second half is a repeat of first half
                }
            } else if (op == '%') {
                k = len - 1 - k; // reverse index
            } else {
                len--; // one normal char was added
                if (k == len) {
                    return op;
                }
                // If not at that char, continue
            }
        }

        return '.'; // fallback (invalid)
    }
}
