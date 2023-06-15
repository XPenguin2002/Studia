#include <stdio.h>
#include <stdlib.h>
int main(void)
{
 int a=1;
 int b;
 for(b=1;b<=50;b++){
    if(a<=100){
        printf("%d",a);
        printf("\n");
        a+=a;
    }
 }
 return(0);
}
