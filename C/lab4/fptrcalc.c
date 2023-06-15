#include <stdio.h>
#include <stdlib.h>
int dodaj(int *a,int *b){
    return *a+*b;
}
int odejmij(int *a,int *b){
    return *a-*b;
}
int pomnoz(int *a,int *b){
    return *a**b;
}
int main(void){
    int a,b,c;
    printf("Wybierz pierwsza cyfre\n");
    scanf("%d",&a);
    printf("Wybierz druga cyfre\n");
    scanf("%d",&b);
    c=dodaj(&a,&b);
    printf("dodawanie:\n%d\n",c);
    c=odejmij(&a,&b);
    printf("odejmowanie:\n%d\n",c);
    c=pomnoz(&a,&b);
    printf("mnozenie:\n%d\n",c);
    return 0;
}
