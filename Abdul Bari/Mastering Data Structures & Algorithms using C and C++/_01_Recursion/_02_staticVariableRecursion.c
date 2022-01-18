#include<stdio.h>

int staticRecursionUse(int n){
	static int x = 0;
	if(n > 0){
		x++;
		printf("%d\n",x);
		return staticRecursionUse(n - 1) + x;
	}
	return 0;
}

int main(){
	int value;
	value = staticRecursionUse(3);
	printf("%d\n", value);
	value = staticRecursionUse(3);
	printf("%d\n", value);
	return 0;
}
