import java.util.Arrays;

public class LeetCode821 {
    public int[] shortestToChar(String s, char c) {
        //brute force
        int n = s.length();
        int []leftIndex = new int[n];
        int []rightIndex = new int[n];
        int []result = new int[n];

        Arrays.fill(leftIndex,n);
        Arrays.fill(rightIndex,n);
        int dist=n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                dist=0;
            }
            leftIndex[i]=dist++;
        }
        dist =n;

        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                dist =0;
            }
            rightIndex[i]=dist++;
        }

        for(int i=0;i<n;i++){
            result[i]=Math.min(leftIndex[i],rightIndex[i]);
        }
        return result;
    }
}
