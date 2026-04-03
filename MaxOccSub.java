import java.util.*;
public class MaxOccSub {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int n = s.length();
		int freq[] = new int[26];
		int uniqueCount=0;
		int max=0;
		int left=0;
		Map<String,Integer> subFre = new HashMap<>();
		for(int right=0;right<n;right++){
			char c = s.charAt(right);
			if(freq[c-'a']==0){
				uniqueCount++;
			}
			freq[c-'a']++;
			if(right-left+1 > minSize){
				char leftChar = s.charAt(left);
				if(freq[leftChar-'a']==1){
					uniqueCount--;
				}
				freq[leftChar-'a']--;
				left++;
			}
			
			if(right-left+1 == minSize &&  uniqueCount <= maxLetters){
				String sub = s.substring(left,right+1);
				subFre.put(sub,subFre.getOrDefault(sub,0)+1);
				max = Math.max(max,subFre.getOrDefault(sub,0));
			}
			
		}
		return max;
    }
}
