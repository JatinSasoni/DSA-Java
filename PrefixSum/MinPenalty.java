package PrefixSum;

public class MinPenalty {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int prefixN[] = new int[n+1];
        int suffixY[] = new int[n+1];

        //prefix
        for(int i=1;i<=n;i++){
            prefixN[i]=prefixN[i-1];
            if(customers.charAt(i-1)=='N'){
                prefixN[i]++;
            }
        }

        //suffix
        for(int i=n-1;i>=0;i--){
            suffixY[i]=suffixY[i+1];
            if(customers.charAt(i)=='Y'){
                suffixY[i]++;
            }
        }

        int ans=0;
        int min=Integer.MAX_VALUE;

        for(int j=0;j<=n;j++){
            int penalty = prefixN[j]+suffixY[j];
            if(penalty < min){
                min = penalty;
                ans=j;
            }
        }
        return ans;
    }
}
