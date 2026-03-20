package PrefixSum;
import java.util.*;
public class GoodIndices {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n=nums.length;
        int leftSide[]=new int[n];
        int rightSide[]=new int[n];

        //left
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                leftSide[i]=leftSide[i-1]+1;
            }
        }
        
        //right
        for(int i=n-2;i>=0;i--){
            if(nums[i]<=nums[i+1]){
                rightSide[i]=rightSide[i+1]+1;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = k; i < n - k; i++){
            if(leftSide[i - 1] >= k - 1 && rightSide[i + 1] >= k - 1){
                ans.add(i);
            }
        }
        return ans;
    }
}
