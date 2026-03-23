package PrefixSum;
public class MaxPopulation {
    public int maximumPopulation(int[][] logs) {
        int pop[] = new int[2051];
        for(int i[]:logs){
            pop[i[0]]++;
            pop[i[1]]--;
        }
        
        int maxYear = 1950;
        for(int i=1950;i<2050;i++){
            pop[i] += pop[i-1];
            if(pop[i]>pop[maxYear]){
                maxYear=i;
            }
        }
        return maxYear;
    }
}
