#include <stdio.h>

// tail recursion
void tailRecursion(int x){
	if(x > 0)
	{
		printf("%d ", x);
		tailRecursion(x - 1);
	}
}

// head recursion
void headRecursion(int x){
	if(x > 0){
		headRecursion(x - 1);
		printf("%d ", x);
	}
}

int main(){
	int x = 3;
	int y = 4;
	tailRecursion(x);
	printf("\n");
	headRecursion(y);
	printf("\n");
	return 0;
}
