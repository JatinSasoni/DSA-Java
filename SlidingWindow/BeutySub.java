package SlidingWindow;

public class BeutySub {
    public int getBeauty(int[] count,int x){
        int sum=0;
        for(int i=0;i<=50;i++){
            sum += count[i];
            if(sum>=x){
                return i-50;
            }
        }
        return 0;
    }
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n=nums.length;
        int count[] = new int[101];
        int beuty[] = new int[n-k+1];
        for(int i=0;i<k;i++){
            count[nums[i]+50]++;
        }

        beuty[0] = getBeauty(count,x);
        int j=1;

        for(int i=k;i<n;i++){
            count[nums[i-k]+50]--;
            count[nums[i]+50]++;
            beuty[j++] = getBeauty(count,x);
        }
        return beuty;
    }
}
