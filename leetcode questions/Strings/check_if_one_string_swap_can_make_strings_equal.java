import java.util.Arrays;

class check_if_one_string_swap_can_make_strings_equal {
    
        public boolean areAlmostEqual(String s1, String s2) {
            char[] s3 = s1.toCharArray();
            char[] s4 = s2.toCharArray();
    
            if(s1.equals(s2)) {
                return true;
            }
            if(s1.length() != s2.length()) {
                return false;
            }
    
            int swap = 1;
            int s = 0;
                        int e = 0;
            for(int i = 0; i < s3.length; i++) {
                
                if(s3[i] != s4[i] && s == 0 && e == 0) {
                     s = i;
                }
                else if(s3[i] != s4[i] && s != 0 && e == 0) {
                    e = i;
                }
                else {
                    continue;
                }
            }
            char temp = s4[s];
            s4[s] = s4[e];
            s4[e] = temp;
            
            return Arrays.equals(s3,s4);
        }
    
}