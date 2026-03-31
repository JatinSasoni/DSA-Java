import java.util.*;
public class MinWindow {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        Map<Character, Integer> freq = new HashMap<>();
        if(m>n){
            return "";
        }

        for(int i=0;i<m;i++){
            char c = t.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

       int start =0;
       int left=0;
       int right=0;
       int requiredCount = m;
       int minWindow = Integer.MAX_VALUE;

        while(right<n){
            char ch = s.charAt(right);
            //required char
            if(freq.containsKey(ch) && freq.get(ch)>0){
                requiredCount--;
            }
            freq.put(ch,freq.getOrDefault(ch,0)-1);
            
            // if match
            while(requiredCount==0){
                char chr = s.charAt(left);
                int current_count = right-left+1;
                if(current_count < minWindow){
                    minWindow = current_count;
                    start = left;
                }
                freq.put(chr,freq.get(chr)+1);
                
                if(freq.get(chr) > 0){
                    requiredCount++;
                }

                left++;
            }
            right++;
        }
        return minWindow == Integer.MAX_VALUE ? "" : s.substring(start,start+minWindow);
    }
}
