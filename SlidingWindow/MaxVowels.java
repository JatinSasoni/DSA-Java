package SlidingWindow;

public class MaxVowels {
    public boolean isVowel(char ch){
        return (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
    public int maxVowels(String s, int k) {
       int n = s.length();
       int maxCount=0;
       int sum=0;
       for(int i=0;i<k;i++){
        if(isVowel(s.charAt(i))){
            sum++;
        }
       }
       maxCount=sum;

       for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i))){
                sum++;
            }
            if(isVowel(s.charAt(i-k))){
                sum--;
            }
            maxCount=Math.max(maxCount,sum);
       }

       return maxCount;

    }
}
