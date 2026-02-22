public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]==val && nums[j]==val){
                j--;
            }else if(nums[i]!=val ){
                i++;
            }
            else{
                //swap
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }

        System.err.printf("k is %d",i-1);
        for(int l=0;i<nums.length;i++){
            System.err.println(nums[l]);
        }
        
        return i-1;
    }

    public static void main(String[] args) {
        int []arr ={3,2,2,3};
        RemoveElement obj = new RemoveElement();
        obj.removeElement(arr, 3);
    }
}
