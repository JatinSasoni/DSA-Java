package PrefixSum;
public class LeetCode2843Brute {
    public int bestClosingTime(String customers) {
        int ans = 0, min=Integer.MAX_VALUE,n=customers.length();
        for(int j=0;j<=n;j++){
            int penalty=0;
            for(int i=0;i<j;i++){
                if(customers.charAt(i)=='N'){
                    penalty++;
                }
            }

            for(int i=j;i<n;i++){
                if(customers.charAt(i)=='Y'){
                    penalty++;
                }
            }

            if(penalty < min){
                min=penalty;
                ans=j;
            }

        }
        return ans;
    }
}
