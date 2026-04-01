import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int k=2;
        Map<Integer,Integer> dist = new HashMap<>();
        int right=0;
        int left=0;
        // Maximum distinct window
        int max = Integer.MIN_VALUE;
        while(right<n){
            int tree = fruits[right];
            //calculate window size
            dist.put(tree,dist.getOrDefault(tree,0)+1);

            while(dist.size()>k){
                int treeL = fruits[left];
                dist.put(treeL,dist.get(treeL)-1);
                if(dist.get(treeL)==0){
                    dist.remove(fruits[left]);
                }
                left++;
            }
            max = Math.max(max,(right-left+1));
            right++;
        }
        return max;
    }
}
