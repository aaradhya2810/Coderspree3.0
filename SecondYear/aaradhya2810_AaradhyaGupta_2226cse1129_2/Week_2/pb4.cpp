#include<cmath>
bool checkArmstrong(int n){
	int y=n;
	int b=n;
	int cnt=0;
	int arm=0;
	while(b>0){
		cnt++;
		b=b/10;
	}
	while(y>0){
		int a=y%10;
		arm=arm+pow(a,cnt);
		y=y/10;
	}
	if(arm==n){
		return true;
	}
	else{
		return false;
	}
	//Write your code here
}
