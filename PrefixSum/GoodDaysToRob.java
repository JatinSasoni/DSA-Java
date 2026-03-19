package  PrefixSum;
import java.util.*;
public class GoodDaysToRob {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        // Non-Increasing
        int n = security.length;
        int nonIncreasing[]=new int[n];
        for(int i=1;i<n;i++){
            if(security[i]<=security[i-1]){
                nonIncreasing[i]=nonIncreasing[i-1]+1;   
            }
        }

        //Non-Decreasing
        int nonDecreasing[]=new int[n];
        for(int i=n-2;i>=0;i--){
            if(security[i]<=security[i+1]){
                nonDecreasing[i]=nonDecreasing[i+1]+1;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(); 
        for(int i=0;i<n;i++){
            if(nonIncreasing[i] >= time && nonDecreasing[i] >= time){
                ans.add(i);
            }
        }
        return ans;
    }
}
