#include <stdio.h>
#include <stdlib.h>
int ciag(int n){
    long a=0;
	long b=1;
	long c=0;
	int i;
	printf("0\n1\n");
	for (i=0;i<n;i++){
        c=a+b;
		printf("%ld\n",c);
		a=b;
		b=c;
	}
}
int main(){
	int liczba;
	printf("Podaj ilosc liczb ciagu fibonaciego: ");
	scanf("%d",&liczba);
	ciag(liczba-2);
	return 0;
}
