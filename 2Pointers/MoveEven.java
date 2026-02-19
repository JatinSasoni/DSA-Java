public class MoveEven {
    public static int[] sortArrayByParity(int[] nums) {
        int first =0;
        int second =0;
        while(second<nums.length){
            if(nums[second]%2==0){
                //swap
                int temp;
                temp = nums[first];
                nums[first] =nums[second];
                nums[second]=temp;
                first++;second++;
            }else{

            second++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int []nums ={3,1,2,4};
        System.err.println(sortArrayByParity(nums));
    }
}
