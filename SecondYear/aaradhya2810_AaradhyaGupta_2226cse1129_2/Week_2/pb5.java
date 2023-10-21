import static java.lang.Math.sqrt;
public class Solution {
	public static String isPrime(int num) {
		int i;
		int flag=0;
		if(num==1){
			flag=1;
		}
		else{
		for(i=2; i<=sqrt(num);i++){
			if(num%i==0){
				flag=1;
				break;
			}
	}
		}
	if(flag==1){
			return "NO";
		}
		else{
			return "YES";
		}
		//Your code goes here
	}
}
