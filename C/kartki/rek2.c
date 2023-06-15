#include <stdio.h>
#include <stdlib.h>
double ciag(int n){
    if(n==0){
        return 1;
    }else{
        return ciag(n-1)+1/(double)n;
        }
}
int main(){
    int n,m;
    printf("Podaj n:\n");
    scanf("%d",&n);
    printf("Podaj m:\n");
    scanf("%d",&m);
    printf("%f\n",ciag(n));
    n++;
    while(n<=m){
        float x=(1/(double)n);
        printf("%f roznica: %f\n",ciag(n),x);
        n++;
    }
    return 0;
}
