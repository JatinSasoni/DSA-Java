package SlidingWindow;
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int count[] = new int[128];
        int n=s.length();
        int max=0;
        for(int right=0,left=0;right<n;right++){
            while(count[s.charAt(right)]>0){
                count[s.charAt(left)]--;
                left++;
            }
            count[s.charAt(right)]++;
            max=Math.max(max,(right-left)+1);
        }
        return max;
    }
}
