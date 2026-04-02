public class LongestReplacement {
    public int characterReplacement(String s, int k) {
        int n =s.length();
        int left=0;
        int freq[] = new int[26];
        int maxLength=0;
        int largestFrequency =0;
        
        for(int right=0;right<n;right++){
            char c = s.charAt(right);
            int index = c - 'A';
            freq[index]++;
            largestFrequency=Math.max(largestFrequency,freq[index]);

            //shrink if invalid
            if((right-left+1)-largestFrequency > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
