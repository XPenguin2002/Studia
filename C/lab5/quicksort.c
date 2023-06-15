#include <stdio.h>
#include <stdlib.h>
int main(void){
    int i;
    int tab[]={2,8,9,15,7,4,10};
    int j=7;
    printf("Ciag znakow:\n");
    for(i=0;i<j;++i){
    printf("%d,",tab[i]);
    }

    quicksort(tab,0,j-1);

    printf("\nCiag znakow posortowany za pomoca algorytmu QuickSort:\n");
    for(i=0;i<j;++i){
    printf("%d,",tab[i]);
    }
    return 0;
}
int quicksort(int tab[],int lewa,int prawa){
    if(lewa<prawa){
        int p=przeskok(tab,lewa,prawa);
        quicksort(tab,lewa,p-1);
        quicksort(tab,p+1,prawa);
        return 0;
    }
}
int przeskok(int tab[],int lewa, int prawa){
    int z,j;
    int p=tab[prawa];
    int i=(lewa-1);
    for(j=lewa;j<prawa;j++){
        if (tab[j]<=p){
            i++;
            z=tab[i];
            tab[i]=tab[j];
            tab[j]=z;
        }
    }
    z=tab[i+1];
    tab[i+1]=tab[prawa];
    tab[prawa]=z;
    return(i+1);
}
