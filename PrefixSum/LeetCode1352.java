package PrefixSum;
import java.util.*;

public class LeetCode1352 {
    ArrayList<Integer> result;
    public void ProductOfNumbers() {
        result = new ArrayList<>();
    }
    
    public void add(int num) {
        result.add(num);
    }
    
    public int getProduct(int k) {
        int res=1;
        int n = result.size();
        for(int i=n-k;i<n;i++){
            res*=result.get(i);
        }
        return res;
    }


/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
}
