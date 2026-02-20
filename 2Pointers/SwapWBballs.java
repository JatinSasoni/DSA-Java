public class SwapWBballs {
    public static long minimumSteps(String s) {
        long swapCount =0;
        int blackCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                swapCount += (long) blackCount;
            }else{
                blackCount++;
            }
        }
        return swapCount;
    }
    public static void main(String[] args) {
        String str = "101";
        minimumSteps(str);
    }
}
