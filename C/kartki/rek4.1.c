#include <stdio.h>
#include <stdlib.h>
int ciag(int n){
	if (n==0){
		return 0;
	}
	else if(n==1){
		return 1;
	}
	else{
		return(ciag(n-1)+ciag(n-2));
	}
}
int main() {
	int liczba,i;
	printf("Podaj ilosc liczb ciagu fibonaciego: ");
	scanf("%d", &liczba);
	for (i=0;i<liczba;i++){
    printf("%d\n", ciag(i));
	}
	return 0;
}
