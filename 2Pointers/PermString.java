public class PermString {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int i=0,j=n;
        int res[]= new int[n+1];
        for(int k=0;k<n;k++){
            if(s.charAt(k)=='I'){
                res[k]=i++;
            }else{
                res[k]=j--;
            }
        }
        res[n]=i;
        
        return res;
    }
}
