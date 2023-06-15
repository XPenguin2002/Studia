#include <stdio.h>
#include <stdlib.h>
int main(void){
    int i,k=0;
    int tab1[2];
    int tab2[2];
    int tab3[2];
    for(i=0;i<2;i++){
        tab1[i]=k;
        k++;
    }
    for(i=0;i<2;i++){
        tab2[i]=k;
        k++;
    }
    printf("\nPoczatkowe wektory:\nwektor 1: {%d %d}\nwektor 2: {%d %d}",tab1[0],tab1[1],tab2[0],tab2[1]);
    for(k=0;k<3;k++){
        if(k==0){
            for(i=0;i<2;i++){
            tab3[i]=tab1[i]+tab2[i];
            }
            printf("\nWynik dodania do siebie wektorow:");
        }else if(k==1){
            for(i=0;i<2;i++){
            tab3[i]=tab1[i]-tab2[i];
            }
            printf("\nWynik odjecia od siebie wektorow:");
        }else{
            for(i=0;i<2;i++){
            tab3[i]=tab1[i]*tab2[i];
            }
            printf("\nWynik pomnozenia przez siebie wektorow:");
        }
        printf("\n{%d %d}",tab3[0],tab3[1]);
    }
    return 0;
}
