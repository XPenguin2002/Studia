#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include <math.h>
int tab1[100]={1,3,4,2,5,6,9,7};/*maksymalna ilosc wartosci w tablicy 100*/
int *p1=tab1;
int a1=8;
int *b1=&a1;
void usun1(){
    int i1,z1;
    system("cls");
    *b1-=1;
    printf("Usunieto liczbe ze stosu.\nWcisnij jakikolwiek przycisk aby kontynuowac...");
    z1=getch();
    main1();
}
void dodaj1(){
    int i1,z1;
    system("cls");
    *b1+=1;
    printf("Podaj liczbe i wcisnij enter:\n");
    scanf("%d",&z1);
    *(p1+*b1-1)=z1;
    printf("Dodano liczbe %d do stosu.\nWcisnij jakikolwiek przycisk aby kontynuowac...",z1);
    z1=getch();
    main1();
}
void wyswietl1(){
    int i1,z1;
    system("cls");
    for(i1=1;i1<=*b1;i1++){
    printf("%d\n",*(p1+*b1-i1));
    }
    printf("Wcisnij jakikolwiek przycisk aby kontynuowac...");
    z1=getch();
    main1();
}
int main1(){
    char z1;
    system("cls");
    printf("1-usun liczbe ze stosu\n2-dodaj liczbe do stosu\n3-wyswietl stos\n4-zakoncz program\n");
    while(1==1){
        z1=getch();
        if(z1=='1'){
            if(*b1>0){
                usun1();
                return 0;
            }else{
                system("cls");
                printf("Stos jest pusty\nWcisnij jakikolwiek przycisk aby kontynuowac...");
                z1=getch();
                main1();
                return 0;
            }
        }else if(z1=='2'){
            if(*b1<101){
                dodaj1();
                return 0;
            }else{
                system("cls");
                printf("Stos jest pelen\nWcisnij jakikolwiek przycisk aby kontynuowac...");
                z1=getch();
                main1();
                return 0;
            }
        }else if(z1=='3'){
            wyswietl1();
            return 0;
        }else if(z1=='4'){
            exit(0);
        }else{
            continue;
        }
    }
}
int tab2[100]={1,3,4,2,5,6,9,7};/*maksymalna ilosc wartosci w tablicy 100*/
int *p2=tab2;
int a2=8;
int *b2=&a2;
int sortowanie2(const void * o12, const void * o22){
  return(*(int*)o12-*(int*)o22);
}
void usun2(){
    int i2,x2,y2;
    system("cls");
    printf("Aktualne wartoœci w tabeli:\n");
    for(i2=0;i2<*b2;i2++){
        printf("%d",*(p2+i2));
    }
    while(1==1){
        printf("\nZ ktorego miejsca z tabeli chcia³bys usunac liczbe? Potwierdz wybor wciskajac enter.\n");
        scanf("%d",&y2);
        if(y2>*b2){
            printf("Nie ma takiego miejsca w tabeli. Wcisnij jakikolwiek przycisk aby kontynuowac...\n");
            x2=getch();
            continue;
        }else{
            for(i2=y2;i2<=*b2;i2++){
                *(p2+i2-1)=*(p2+i2);
            }
            *b2-=1;
            printf("Usunieto liczbe z tabeli.\nWcisnij jakikolwiek przycisk aby kontynuowac...");
            y2=getch();
            main2();
        }
    }
}
void dodaj2(){
    int i2,x2,y2,z2;
    system("cls");
    printf("Aktualne wartosci w tabeli:\n");
    for(i2=0;i2<*b2;i2++){
        printf("%d",*(p2+i2));
    }
    *b2+=1;
    printf("\nPodaj liczbe ktora chcesz dodac do tabeli i wcisnij enter:\n");
    scanf("%d",&z2);
    *(p2+*b2-1)=z2;
    printf("Dodano liczbe %d do tabeli.\nWcisnij jakikolwiek przycisk aby kontynuowac...",z2);
    z2=getch();
    main2();
}
void wyswietl2(){
    int h2,i2,j2,v2,x2,y2,z2,tabd2[100];
    system("cls");
    printf("Tabela:\n");
    for(i2=0;i2<*b2;i2++){
        printf("%d",*(p2+i2));
        tabd2[i2]=*(p2+i2);
    }
    printf("\nPosortowana tabela:\n");
    qsort(tabd2,*b2,sizeof(int),sortowanie2);
    for(i2=0;i2<*b2;i2++){
        printf("%d",tabd2[i2]);
    }
    printf("\nDrzewo binarne:\n");

    if(*b2==0){
        x2=0;
    }else if(*b2<=1){
        x2=1;
    }else if(*b2<=3){
        x2=2;
    }else if(*b2<=7){
        x2=3;
    }else if(*b2<=15){
        x2=4;
    }else if(*b2<=31){
        x2=5;
    }else if(*b2<=63){
        x2=6;
    }else{
        x2=7;
    }
    h2=0;
    y2=1;
    v2=(pow(2,x2))/2;
    for(i2=1;i2<=x2;i2++){
        for(j2=1;j2<=y2;j2++){
            for(z2=0;z2<v2;z2++){
                printf(" ");
            }
            printf("%d",tabd2[h2]);
            h2++;
            if(h2>=*b2){
                break;
            }
            for(z2=1;z2<v2;z2++){
                printf(" ");
            }
        }
        v2/=2;
        y2*=2;
        printf("\n");
    }

    printf("\nWcisnij jakikolwiek przycisk aby kontynuowac...");
    z2=getch();
    main2();
}
int main2(){
    char z2;
    int i2;
    system("cls");
    printf("1-usun liczbe z tabeli\n2-dodaj liczbe do tabeli\n3-wyswietl drzewo binarne\n4-zakoncz program\n");
    while(1==1){
        z2=getch();
        if(z2=='1'){
            if(*b2>0){
                usun2();
                return 0;
            }else{
                system("cls");
                printf("Tabela jest pelna\nWcisnij jakikolwiek przycisk aby kontynuowac...");
                z2=getch();
                main2();
                return 0;
            }
        }else if(z2=='2'){
            if(*b2<101){
                dodaj2();
                return 0;
            }else{
                system("cls");
                printf("Tabela jest pelna\nWcisnij jakikolwiek przycisk aby kontynuowac...");
                z2=getch();
                main2();
                return 0;
            }
        }else if(z2=='3'){
            wyswietl2();
            return 0;
        }else if(z2=='4'){
            exit(0);
        }else{
            continue;
        }
    }
}
int main(){
    char q1;
    while(1==1){
        system("cls");
        printf("Wybierz program:\n1.Stos\n2.Drzewo binarne\n");
        q1=getch();
        if(q1=='1'){
            main1();
        }else if(q1=='2'){
            main2();
        }else{
            continue;
        }
    }
}
