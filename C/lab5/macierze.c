#include <stdio.h>
#include <stdlib.h>
int main(void){
    int i,j,k=0;
    int tab1[3][3];
    int tab2[3][3];
    int tab3[3][3];
    for(j=0;j<3;j++){
        for(i=0;i<3;i++){
            tab1[j][i]=k;
            k++;
        }
    }
    for(j=0;j<3;j++){
        for(i=0;i<3;i++){
            tab2[j][i]=k;
            k++;
        }
    }
    printf("Macierz nr 1:\n{%d %d %d}\n{%d %d %d}\n{%d %d %d}\n",tab1[0][0],tab1[0][1],tab1[0][2],tab1[1][0],tab1[1][1],tab1[1][2],tab1[2][0],tab1[2][1],tab1[2][2]);
    printf("Macierz nr 2:\n{%d %d %d}\n{%d %d %d}\n{%d %d %d}\n",tab2[0][0],tab2[0][1],tab2[0][2],tab2[1][0],tab2[1][1],tab2[1][2],tab2[2][0],tab2[2][1],tab2[2][2]);
    printf("Wynik dodawania:\n");
    for(j=0;j<3;j++){
        for(i=0;i<3;i++){
            tab3[j][i]=tab1[j][i]+tab2[j][i];
        }
    }
    printf("{%d %d %d}\n{%d %d %d}\n{%d %d %d}\n",tab3[0][0],tab3[0][1],tab3[0][2],tab3[1][0],tab3[1][1],tab3[1][2],tab3[2][0],tab3[2][1],tab3[2][2]);
    printf("Wynik odejmowania:\n");
    for(j=0;j<3;j++){
        for(i=0;i<3;i++){
            tab3[j][i]=tab1[j][i]-tab2[j][i];
        }
    }
    printf("{%d %d %d}\n{%d %d %d}\n{%d %d %d}\n",tab3[0][0],tab3[0][1],tab3[0][2],tab3[1][0],tab3[1][1],tab3[1][2],tab3[2][0],tab3[2][1],tab3[2][2]);
    printf("Wynik mnozenia:\n");
    for(j=0;j<3;j++){
        k=0;
        for(i=0;i<3;i++){
            tab3[j][i]=tab1[j][0]*tab2[0][k]+tab1[j][1]*tab2[1][k]+tab1[j][2]*tab2[2][k];
            k++;
        }
    }
    printf("{%d %d %d}\n{%d %d %d}\n{%d %d %d}\n",tab3[0][0],tab3[0][1],tab3[0][2],tab3[1][0],tab3[1][1],tab3[1][2],tab3[2][0],tab3[2][1],tab3[2][2]);
    return 0;
}
