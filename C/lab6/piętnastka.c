#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(){
    int tab[4][4];
    int i,j,k,l,t;
    char a,b='a',c='w',d='d',e='s',f='r';
    long int m;
    for(j=0;j<4;j++){
        for(i=0;i<4;i++){
            tab[j][i]=rand()%15+1;
        }
    }
    for(m=0;m<100000;m++){
        for(j=0;j<4;j++){
            for(i=0;i<4;i++){
                for(k=0;k<4;k++){
                    for(l=0;l<4;l++){
                        if(j==k && i==l){
                            continue;
                        }else{
                            tab[3][3]=0;
                            while(tab[j][i]==tab[k][l]){
                                tab[j][i]-=1;
                                if(tab[j][i]==0){
                                    tab[j][i]=15;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    printf("%d  %d  %d  %d\n%d  %d  %d  %d\n%d  %d  %d  %d\n%d  %d  %d  %d\n\n",tab[0][0],tab[0][1],tab[0][2],tab[0][3],tab[1][0],tab[1][1],tab[1][2],tab[1][3],tab[2][0],tab[2][1],tab[2][2],tab[2][3],tab[3][0],tab[3][1],tab[3][2],tab[3][3]);
    printf("Jak grac:\nw-gora\ns-dol\na-lewo\nd-prawo\nr-restart");
    j=3;i=3;
    while(tab[0][0]>tab[0][1]||tab[0][1]>tab[0][2]||tab[0][2]>tab[0][3]||tab[0][3]>tab[1][0]||tab[1][0]>tab[1][1]||tab[1][1]>tab[1][2]||tab[1][2]>tab[1][3]||tab[1][3]>tab[2][0]||tab[2][0]>tab[2][1]||tab[2][1]>tab[2][2]||tab[2][2]>tab[2][3]||tab[2][3]>tab[3][0]||tab[3][0]>tab[3][1]||tab[3][1]>tab[3][2]){
        a=getch();
        if(a==b){
            if(i==0){
                continue;
            }else{
                t=tab[j][i];
                tab[j][i]=tab[j][i-1];
                tab[j][i-1]=t;
                i-=1;
            }
        }else if(a==c){
            if(j==0){
                continue;
            }else{
                t=tab[j][i];
                tab[j][i]=tab[j-1][i];
                tab[j-1][i]=t;
                j-=1;
            }
        }else if(a==d){
            if(i==3){
                continue;
            }else{
                t=tab[j][i];
                tab[j][i]=tab[j][i+1];
                tab[j][i+1]=t;
                i+=1;
            }
        }else if(a==e){
            if(j==3){
                continue;
            }else{
                t=tab[j][i];
                tab[j][i]=tab[j+1][i];
                tab[j+1][i]=t;
                j+=1;
            }
        }else if(a==f){
            system("cls");
            main();
        }else{
            continue;
        }
        system("cls");
        printf("%d  %d  %d  %d\n%d  %d  %d  %d\n%d  %d  %d  %d\n%d  %d  %d  %d\n\n",tab[0][0],tab[0][1],tab[0][2],tab[0][3],tab[1][0],tab[1][1],tab[1][2],tab[1][3],tab[2][0],tab[2][1],tab[2][2],tab[2][3],tab[3][0],tab[3][1],tab[3][2],tab[3][3]);
    }
    printf("Wygrales!!!");
    return 0;
}
