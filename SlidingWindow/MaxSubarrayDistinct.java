package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaxSubarrayDistinct {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long max=0;
        int left=0;
        long sum=0;
        Set<Integer> s = new HashSet<>();
        for(int right=0;right<n;right++){
            while(s.contains(nums[right])){
                sum-=nums[left];
                s.remove(nums[left]);
                left++;
            }
            sum+=nums[right];
            s.add(nums[right]);
            if(right-left+1 == k){
                max = Math.max(sum,max);
                sum-=nums[left];
                s.remove(nums[left]);
                left++;
            }
        }
        return max;
    }
}
