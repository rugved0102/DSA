import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II {
    public List<Integer> findMajority(int[] arr) {
        int ele1 = -1;
        int ele2 = -1;
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int ele : arr) {
            if(ele == ele1) {
                cnt1++;
            }
            else if(ele == ele2) {
                cnt2++;
            }
            else if(cnt1 == 0) {
                ele1 = ele;
                cnt1++;
            }
            else if(cnt2 == 0) {
                ele2 = ele;
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        cnt1= 0;
        cnt2 = 0;
        for(int ele : arr) {
            if(ele1 == ele) cnt1++;
            if(ele2 == ele) cnt2++;
        }
        
        if(cnt1 > arr.length/3) list.add(ele1);
        if(cnt2 > arr.length/3 && ele1 != ele2) list.add(ele2);
        
        if(list.size() == 2 && list.get(0) > list.get(1)) {
            int temp = list.get(0);
            list.set(0,list.get(1));
            list.set(1,temp);
            
        }
        return list;
    }
}
