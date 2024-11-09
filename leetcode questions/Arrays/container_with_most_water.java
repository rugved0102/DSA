// https://leetcode.com/problems/container-with-most-water/

class container_with_most_water {
    
        public int maxArea(int[] height) {
            int max = 0;
            int i = 0;
            int j = height.length - 1;
            while(i < j) {
                
                int currHeight = Math.min(height[j],height[i]);
                    
                int area = currHeight *(j-i);
                max = Math.max(area,max);
    
                // if(height[i] < height[j]) {
                //     i++;
                // } else j--;
    
                while(i < j && height[i] <= currHeight) {i++;}
    
                while(i < j && height[j] <= currHeight) {j--;}
    
                }
            
            return max;
        }
    
}