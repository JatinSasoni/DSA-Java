public class LeetCode1754 {

    public boolean check(String s, int i,String k, int j){
        while(i < s.length() && j < k.length()){
        if(s.charAt(i) == k.charAt(j)){
            i++;
            j++;
        }else{
            return s.charAt(i) > k.charAt(j);
        }
    }
    return i < s.length(); 
    }

    public String largestMerge(String word1, String word2) {
       int left=0,right=0;
       StringBuilder sb = new StringBuilder();
       while(left < word1.length() && right < word2.length()){
            if(word1.charAt(left)>word2.charAt(right)){
                sb.append(word1.charAt(left++));
            }else if(word1.charAt(left) < word2.charAt(right)){
                sb.append(word2.charAt(right++));
            }else{
                //check first laxically largest;
                if(check(word1,left,word2,right)){
                    sb.append(word1.charAt(left++));
                }else{
                    sb.append(word2.charAt(right++));
                }
            }
       } 

       while(left < word1.length()){
        sb.append(word1.charAt(left++));
       }

       while(right < word2.length()){
        sb.append(word2.charAt(right++));
       }
       return sb.toString();
    }
}
