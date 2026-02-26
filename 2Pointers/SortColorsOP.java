public abstract class SortColorsOP {

    public void swap(int[] nums,int index1, int index2){
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }

    public void sortColors(int[] nums) {
       int start =0;
       int end = nums.length-1;
       int i=0;
       while(i<=end){
        if(nums[i]==0){
            //swap with start
            swap(nums,start,i);
            i++;start++;
        }else if(nums[i]==2){
            swap(nums,end,i);
            end--;
        }else{
            i++;
        }
       }
    }
}
