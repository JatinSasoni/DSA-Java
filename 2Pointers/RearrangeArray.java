public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int []res = new int[nums.length];
        int evenIndex=0;
        int oddIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[evenIndex]=nums[i];
                evenIndex=evenIndex+2;
            }else{
                res[oddIndex]=nums[i];
                oddIndex=oddIndex+2;
            }
        }       
        return res;
    }

    public static void main(String[] args) {
        int []arr ={3,1,-2,-5,2,-4};
        rearrangeArray(arr);
    }
}
