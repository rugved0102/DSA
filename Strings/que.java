import java.util.Stack;

public class que {
    public static void main(String[] args) {
        System.out.println(processStr("a#b%", 0));
        System.out.println(processStr("a#b%", 1));
        System.out.println(processStr("a#b%", 2));
        System.out.println(processStr("a#b%", 3));
    }
    public static char processStr(String s, long k) {
        return findKthChar(s,  k); 
        
    }
    public static char findKthChar(String s, long k) {
        Stack<Long> lenSt = new Stack<>();
        Stack<Character> opSt = new Stack<>();
        long currLen = 0;

        for(char ch : s.toCharArray()) {
            
            if(ch == '*') {
                if(currLen > 0)currLen--;

            }
            else if(ch == '#') {
                currLen *= 2;
            } else if(ch == '%') {

            } else {
                currLen++;
            }

            lenSt.push(currLen);
            opSt.push(ch);

            if(k < currLen) break;
        }

        for(int j = lenSt.size()-1; j>=0; j--) {
            long len = lenSt.get(j);
            char op = opSt.get(j);

            if(op == '*') {
                continue;
            } else if(op == '#') {
                len /= 2;
                if(k >= len) {
                     k-= len;
                }
            } else if(op == '%') {
                k = len - 1 - k;
            } else {
                len--;
                if(k == len) {
                    return op;
                }
            }

        }
        return '.';
    }

}
