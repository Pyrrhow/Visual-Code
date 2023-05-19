import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int lines = 0;
         Map<Integer, Integer> linesMap = new HashMap<>();
        
        //horizontal lines
        for (int i=0; i<nums1.length-1 ;i++){
            if(nums1[i] == nums2[i]){
                lines++;
                linesMap.put(i,i);
            }
        }

        //left to right
        for (int i=0; i<nums1.length-1 ;i++){
            if (!linesMap.containsValue(i)){
                for (int j=i; j<nums1.length-1 ;j++){
                    if(nums1[i] == nums2[j]){
                        lines++;
                        linesMap.put(i,j);
                    }
                }
            }
            
        }

        return lines;
    }

    
    public static void main(String[] args){
        
        
    }
}