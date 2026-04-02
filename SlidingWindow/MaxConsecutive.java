public class MaxConsecutive {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int maxWin=0;
        int left=0;
        int countZero=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                countZero+=1;
            }
            while(countZero>k){
                if(nums[left]==0){
                    countZero--;
                }
                left++;
            }
            maxWin = Math.max(maxWin,(right-left+1));
        }
        return maxWin;
    }
}
