public class SortColors {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=0;

        for(int l=0;l<nums.length;l++){
            if(nums[l]==0){
                i++;
            }else if(nums[l]==1){
                j++;
            }else{
                k++;
            }
        }

        int index=0;
        while(i-- >0){
            nums[index++]=0;
        }

        while(j-- >0){
            nums[index++]=1;
        }

        while(k-- >0){
            nums[index++]=2;
        }
    }
}
