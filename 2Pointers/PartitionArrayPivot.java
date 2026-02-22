public class PartitionArrayPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[] = new int[nums.length];
        int smallIndex=0;
        int largeIndex=nums.length-1;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                res[smallIndex++]=nums[i];
            }
            
            if(nums[j]>pivot){
                res[largeIndex--]=nums[j];
            }
        }

        while(smallIndex<=largeIndex){
            res[smallIndex++]=pivot;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={9,12,5,10,14,3,10};
        PartitionArrayPivot obj = new PartitionArrayPivot();
        obj.pivotArray(arr, 10);
    }
}
