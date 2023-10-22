public class Solution {
    public static int[] printNos(int x) {
        int[] arr=new int[x];
        return recur(x,arr);
        // Write Your Code Here
    }

    public static int[] recur(int x,int[]arr){
        if(x==0){
            return arr;
        }
        int i=x;
        arr[i-1]=x;
        return recur(x-1,arr);
    }
}