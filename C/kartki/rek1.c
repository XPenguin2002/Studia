#include <stdio.h>
#include <stdlib.h>
int potega(int n,int a){
    if(a==0){
        return 1;
    }else if(a==1){
        return n;
    }else{
        return n*potega(n,a-1);
    }
}
int main(void){
    int n,a;
    printf("podaj liczbe:\n");
    scanf("%d",&n);
    printf("podaj potege:\n");
    scanf("%d",&a);
    printf("%d^%d=%d",n,a,potega(n,a));
    return 0;
}
