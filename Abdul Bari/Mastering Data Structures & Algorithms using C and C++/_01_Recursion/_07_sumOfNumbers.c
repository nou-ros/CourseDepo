#include<stdio.h>

int rSum(int n){
	if(n == 0)
		return 0;
	return rSum(n-1) + n;
}

int iSum(int n){
	int isum = 0;
	for(int i = 1; i <= n; i++){
		isum += i;
	}
	return isum;
}

int main(){
	int i = iSum(5);
	printf("%d ", i);
	int r = rSum(5);
	printf("%d ", r);

	return 0;
}
