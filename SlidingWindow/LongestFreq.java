import java.util.*;;
public class LongestFreq {
    public int maxFrequency(int[] nums, int k) {
		Arrays.sort(nums);
        int n = nums.length;
        int j=0;
        int ans=0;
        long total=0;
        
        for(int i=0;i<n;i++){
            total+=nums[i];

            while((long)nums[i]*(i-j+1)-total > k){
                total-=nums[j];
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}
