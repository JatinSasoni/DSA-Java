package  PrefixSum;

import java.util.*;

public class FindAnagram {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(p.length()>s.length()) return result;

        int []countP = new int[26];
        int []window = new int[26];

        for(char c : p.toCharArray()){
            countP[c-'a']++;
        }

        int left=0;
        for(int right=0;right<s.length();right++){
            window[s.charAt(right)-'a']++;

            if(right-left+1>p.length()){
                window[s.charAt(left)-'a']--;
                left++;
            }

            if(Arrays.equals(window,countP)){
                result.add(left);
            }
        }
        return result;
    }
}
