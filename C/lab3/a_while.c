#include <stdio.h>
#include <stdlib.h>
int main(void)
{
 int a=1;
 int b=1;
 while(a<=100 && b<=50){
    printf("%d",a);
    printf("\n");
    a+=a;
    b++;
 }
 return(0);
}
