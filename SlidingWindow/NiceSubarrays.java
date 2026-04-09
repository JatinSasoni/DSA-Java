public class NiceSubarrays {
    private int atMost(int[] nums, int k) {
    int left = 0, count = 0;

    for (int right = 0; right < nums.length; right++) {

        if (nums[right] % 2 != 0) {
            k--;  // we used one odd
        }

        // shrink window if too many odds
        while (k < 0) {
            if (nums[left] % 2 != 0) {
                k++;  // we removed one odd
            }
            left++;
        }

        // count subarrays ending at right
        count += right - left + 1;
    }

    return count;
}
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }

}
