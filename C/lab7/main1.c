#include<conio.h>
#include<stdio.h>
int tab[100]={1,3,4,2,5,6,9,7};/*maksymalna ilosc wartosci w tablicy 100*/
int *p=tab;
int a=8;
int *b=&a;
void usun(){
    int i,z;
    system("cls");
    *b-=1;
    printf("Usunieto liczbe ze stosu.\nWcisnij jakikolwiek przycisk aby kontynuowac...");
    z=getch();
    main();
}
void dodaj(){
    int i,z;
    system("cls");
    *b+=1;
    printf("Podaj liczbe i wcisnij enter:\n");
    scanf("%d",&z);
    *(p+*b-1)=z;
    printf("Dodano liczbe %d do stosu.\nWcisnij jakikolwiek przycisk aby kontynuowac...",z);
    z=getch();
    main();
}
void wyswietl(){
    int i,z;
    system("cls");
    for(i=1;i<=*b;i++){
    printf("%d\n",*(p+*b-i));
    }
    printf("Wcisnij jakikolwiek przycisk aby kontynuowac...");
    z=getch();
    main();
}
int main(){
    char z;
    system("cls");
    printf("1-usun liczbe ze stosu\n2-dodaj liczbe do stosu\n3-wyswietl stos\n4-zakoncz program\n");
    while(1==1){
        z=getch();
        if(z=='1'){
            if(*b>0){
                usun();
                return 0;
            }else{
                system("cls");
                printf("Stos jest pusty\nWcisnij jakikolwiek przycisk aby kontynuowac...");
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
                printf("Stos jest pelen\nWcisnij jakikolwiek przycisk aby kontynuowac...");
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
