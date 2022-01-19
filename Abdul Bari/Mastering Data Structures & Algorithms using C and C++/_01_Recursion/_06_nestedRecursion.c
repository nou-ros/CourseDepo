#include<stdio.h>

int function(int n){
	if(n > 100)
		return n - 10;
	return function(function(n + 11));
}

int main(){
	int r;
	r = function(95);
	printf("%d\n",r);
	return 0;
}
