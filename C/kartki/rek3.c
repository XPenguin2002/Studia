#include <stdio.h>
#include <stdlib.h>
int znak(int i){
	if (i==0){
		printf("\n");
	}
	else{
		printf("*");
		znak(i-1);
	}
	return 0;
}
int main()
{
    int j;
	for (j=0;j<5;j++){
		znak(j+1);
	}
}
