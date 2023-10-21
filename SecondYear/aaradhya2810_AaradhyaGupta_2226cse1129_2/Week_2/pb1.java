public class Solution {
    public static int countDigits(int n){
        int cpy=n;
        int cnt=0;
        int a;
        while(cpy!=0){
            a=cpy%10;
            cpy=cpy/10;
            if(a!=0 && n%a==0){
                cnt=cnt+1;
            }
        }
        return cnt;
        // Write your code here.
    }
}