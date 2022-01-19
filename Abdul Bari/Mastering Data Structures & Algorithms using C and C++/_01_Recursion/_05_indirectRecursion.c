#include<stdio.h>

void functionB(int n);

void functionA(int n){
	if(n > 0){
		printf("(A)%d ",n);
		functionB(n - 1);
	}
}

void functionB(int n){
	if(n > 1){
		printf("(B)%d ",n);
		functionA(n/2);
	}
}

int main(){
	functionA(10);
	return 0;
}
