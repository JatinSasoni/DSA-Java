import java.util.HashMap;
import java.util.Map;

public class SubarrayWithDistinct {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }

    public int atMost(int[] nums, int k){
        int n=nums.length;
        int left=0;
        int count=0;
        int ans=0;
        Map<Integer,Integer> freq = new HashMap<>();

        for(int right=0;right<n;right++){  
            int item = nums[right];
            freq.put(item,freq.getOrDefault(item,0)+1);
            
            while(freq.size()>k){
                freq.put(nums[left],freq.get(nums[left])-1);
                if(freq.get(nums[left])==0){
                    freq.remove(nums[left]);
                }
                left++;
            }
            ans+=right-left+1;
        }
        return ans;
    }
}
