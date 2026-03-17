public class LeetCodeCountVowels {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int sub[] = new int[words.length]; 
        int ans[] = new int[queries.length];
        String vowels="aeiou";
        if(vowels.indexOf(words[0].charAt(0)) != -1 &&
            vowels.indexOf(words[0].charAt(words[0].length() - 1)) != -1){
            sub[0]=1;
        }else{
            sub[0]=0;
        }
       
       for(int i=1;i<words.length;i++){
            int n=words[i].length();
            if(vowels.indexOf(words[i].charAt(0))!=-1 && vowels.indexOf(words[i].charAt(n-1)) != -1){
                sub[i] += sub[i-1]+1;
            }else{
                sub[i] = sub[i-1];
            }
        }

        for(int j=0;j<queries.length;j++){
            int l=queries[j][0];
            int r=queries[j][1];
            if(l==0){
                ans[j]= sub[r];
            }else{
                ans[j]=sub[r]-sub[l-1];
            }   
            
        }

        return ans;
         
    }
}
