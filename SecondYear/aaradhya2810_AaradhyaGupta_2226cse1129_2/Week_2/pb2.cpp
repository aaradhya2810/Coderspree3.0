#include <cmath>
long reverseBits(long n) {
    long bin=0,num = n,cnt=0;
    long digit;
    long rev=0;
    long long binary=0;
    while(num!=0){
        digit = num%2;
        bin = bin + long(digit*pow(10,cnt));
        cnt++;
        num/=2;
    }
    while(bin!=0){
        digit = bin%10;
        rev = rev*10 + digit;
        bin/=10;
    }
    while(rev!=0){
        digit = rev%10;
        if(digit == 1){
        binary +=pow(2, 32-cnt);
        }
        rev/=10;
        cnt--;
    }
    return binary;
    // Write your code here.
}