public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int cpy=n;
        int rev=0;
        while(cpy>0){
            int a=cpy%10;
            rev=rev*10+a;
            cpy=cpy/10;
        }
        if(rev==n){
            return true;
        }
        else{
            return false;
        }
    }
}