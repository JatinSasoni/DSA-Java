public class StringLen {
    public int minimumLength(String s) {
        int n = s.length();
        int start=0,end=n-1;

        if(start==end){
            return 1;
        }

        while(s.charAt(start)==s.charAt(end)){
            char ch = s.charAt(start);

            while(start < n && ch == s.charAt(start)){
                start++;
            }

            while(end >= 0 && ch == s.charAt(end)){
                end--;
            }

            if(start==end){
                return 1;
            }

            if(end<start){
                return 0;
            }
        }

        return end - start +1;
    }
}
