public class LeetCode696 {
    public int countBinarySubstrings(String s) {
        int curr=1;
        int prev=0;
        int ans=0;
        int n =s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }else{
                ans+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
        return ans+=Math.min(prev,curr);
    }
}
