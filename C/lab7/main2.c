#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include <math.h>
int tab[100]={1,3,4,2,5,6,9,7};/*maksymalna ilosc wartosci w tablicy 100*/
int *p=tab;
int a=8;
int *b=&a;
int sortowanie(const void * o1, const void * o2){
  return(*(int*)o1-*(int*)o2);
}
void usun(){
    int i,x,y;
    system("cls");
    printf("Aktualne wartości w tabeli:\n");
    for(i=0;i<*b;i++){
        printf("%d",*(p+i));
    }
    while(1==1){
        printf("\nZ ktorego miejsca z tabeli chciałbys usunac liczbe? Potwierdz wybor wciskajac enter.\n");
        scanf("%d",&y);
        if(y>*b){
            printf("Nie ma takiego miejsca w tabeli. Wcisnij jakikolwiek przycisk aby kontynuowac...\n");
            x=getch();
            continue;
        }else{
            for(i=y;i<=*b;i++){
                *(p+i-1)=*(p+i);
            }
            *b-=1;
            printf("Usunieto liczbe z tabeli.\nWcisnij jakikolwiek przycisk aby kontynuowac...");
            y=getch();
            main();
        }
    }
}
void dodaj(){
    int i,x,y,z;
    system("cls");
    printf("Aktualne wartosci w tabeli:\n");
    for(i=0;i<*b;i++){
        printf("%d",*(p+i));
    }
    *b+=1;
    printf("\nPodaj liczbe ktora chcesz dodac do tabeli i wcisnij enter:\n");
    scanf("%d",&z);
    *(p+*b-1)=z;
    printf("Dodano liczbe %d do tabeli.\nWcisnij jakikolwiek przycisk aby kontynuowac...",z);
    z=getch();
    main();
}
void wyswietl(){
    int h,i,j,v,x,y,z,tabd[100];
    system("cls");
    printf("Tabela:\n");
    for(i=0;i<*b;i++){
        printf("%d",*(p+i));
        tabd[i]=*(p+i);
    }
    printf("\nPosortowana tabela:\n");
    qsort(tabd,*b,sizeof(int),sortowanie);
    for(i=0;i<*b;i++){
        printf("%d",tabd[i]);
    }
    printf("\nDrzewo binarne:\n");

    if(*b==0){
        x=0;
    }else if(*b<=1){
        x=1;
    }else if(*b<=3){
        x=2;
    }else if(*b<=7){
        x=3;
    }else if(*b<=15){
        x=4;
    }else if(*b<=31){
        x=5;
    }else if(*b<=63){
        x=6;
    }else{
        x=7;
    }
    h=0;
    y=1;
    v=(pow(2,x))/2;
    for(i=1;i<=x;i++){
        for(j=1;j<=y;j++){
            for(z=0;z<v;z++){
                printf(" ");
            }
            printf("%d",tabd[h]);
            h++;
            if(h>=*b){
                break;
            }
            for(z=1;z<v;z++){
                printf(" ");
            }
        }
        v/=2;
        y*=2;
        printf("\n");
    }

    printf("\nWcisnij jakikolwiek przycisk aby kontynuowac...");
    z=getch();
    main();
}
int main(){
    char z;
    int i;
    system("cls");
    printf("1-usun liczbe z tabeli\n2-dodaj liczbe do tabeli\n3-wyswietl drzewo binarne\n4-zakoncz program\n");
    while(1==1){
        z=getch();
        if(z=='1'){
            if(*b>0){
                usun();
                return 0;
            }else{
                system("cls");
                printf("Tabela jest pelna\nWcisnij jakikolwiek przycisk aby kontynuowac...");
                z=getch();
                main();
                return 0;
            }
        }else if(z=='2'){
            if(*b<101){
                dodaj();
                return 0;
            }else{
                system("cls");
                printf("Tabela jest pelna\nWcisnij jakikolwiek przycisk aby kontynuowac...");
                z=getch();
                main();
                return 0;
            }
        }else if(z=='3'){
            wyswietl();
            return 0;
        }else if(z=='4'){
            exit(0);
        }else{
            continue;
        }
    }
}
