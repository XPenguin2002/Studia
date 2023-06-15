#include <stdio.h>
#include <stdlib.h>
int main(void){
    int a,b,c;
    printf("Wybierz pierwsza cyfre\n");
    scanf("%d",&a);
    printf("Wybierz druga cyfre\n");
    scanf("%d",&b);
    c=a+b;
    printf("dodawanie:\n%d\n",c);
    c=a-b;
    printf("odejmowanie:\n%d\n",c);
    c=a*b;
    printf("mnozenie:\n%d\n",c);
    return 0;
}
