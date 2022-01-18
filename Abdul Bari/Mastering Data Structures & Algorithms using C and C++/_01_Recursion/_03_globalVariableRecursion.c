#include<stdio.h>

int x = 0;

int globalVarRecursion(int n){
	if(n > 0){
		x++;
		return globalVarRecursion(n - 1) + x;
	}
	return 0;
}

int main(){
	int r;
       	r = globalVarRecursion(3);
	printf("%d\n", r);
	r = globalVarRecursion(3);
	printf("%d\n", r);
	return 0;
}
