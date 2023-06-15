#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include <math.h>
typedef struct figury t;
struct figury{
    char figura[20];
    float wymiary1;
    float wymiary2;
    char kolor[20];
    unsigned int wypelnienie;
    unsigned int obramowanie;
};
int tablica(){
    int i,n;
    t f[100];
    system("cls");
    printf("Podaj ilosc figur jaka chcesz umiescic:\n");
    scanf("%d",&n);
    system("cls");
    for(i=0;i<n;i++){
        printf("Jaka figure chcesz zapisac?(kolo,prostokat,trojkat)\n");
        scanf("%s",f[i].figura);
        system("cls");
        if(f[i].figura[0]=='k'){
            printf("Podaj promien kola:\n");
            scanf("%f",&f[i].wymiary1);
            f[i].wymiary2=0;
            system("cls");
        }else if(f[i].figura[0]=='p'){
            printf("Podaj wymiary pierwszego boku:\n");
            scanf("%f",&f[i].wymiary1);
            system("cls");
            printf("Podaj wymiary drugiego boku:\n");
            scanf("%f",&f[i].wymiary2);
            system("cls");
        }else if(f[i].figura[0]=='t'){
            printf("Podaj podstawe\n");
            scanf("%f",&f[i].wymiary1);
            system("cls");
            printf("Podaj wysokosc\n");
            scanf("%f",&f[i].wymiary2);
            system("cls");
        }else{
            printf("Cos poszlo nie tak. Nie rozpoznano figury.\nWcisnij jakikolwiek przycisk aby zakonczyc program...");
            i=getch();
            exit(0);
        }
        printf("Podaj kolor:\n");
        scanf("%s",f[i].kolor);
        system("cls");
        printf("Czy figura posiada wypelnienie? 1-tak 2-nie\n");
        scanf("%d",&f[i].wypelnienie);
        system("cls");
        printf("Czy figura posiada obramowanie? 1-tak 2-nie\n");
        scanf("%d",&f[i].obramowanie);
        system("cls");
    }
    printf("Zakonczono dodawanie figur do struktury. Wcisnij jakikolwiek przycisk aby kontynuowac...");
    i=getch();
    main1(f,n);
    return 0;
}
int oblicz_pole(t f3[],int n){
    int i;
    float suma[100];
    float sumac=0;
    system("cls");
    for (i=0;i<n;i++){
        if(f3[i].figura[0]=='k'){
            suma[i]=(3.14*(f3[i].wymiary1*f3[i].wymiary1));
            printf("Pole figury nr %d wynosi %.2f\n",i+1,suma[i]);
            sumac+=suma[i];
        }else if(f3[i].figura[0]=='p'){
            suma[i]=(f3[i].wymiary1*f3[i].wymiary2);
            printf("Pole figury nr %d wynosi %.2f\n",i+1,suma[i]);
            sumac+=suma[i];
        }else{
            suma[i]=((f3[i].wymiary1*f3[i].wymiary2)/2);
            printf("Pole figury nr %d wynosi %.2f\n",i+1,suma[i]);
            sumac+=suma[i];
        }
    }
    printf("\nSuma pol wszystkich figur wynosi %.2f\n\nWcisnij jakikolwiek przycisk aby kontynuowac...",sumac);
    i=getch();
    main1(f3,n);
    return 0;
}
int sprawdz_obramowanie(t f2[],int n){
    int i,b,a=0;
    system("cls");
    for(i=0;i<n;i++){
        if(f2[i].obramowanie==1){
            a+=1;
        }
    }
    printf("Ilosc figur z obramowaniem to %d\n\nWcisnij jakikolwiek przycisk aby kontynuowac...",a);
    a=getch();
    main1(f2,n);
    return 0;
}
int main(){
    main1();
    return 0;
}
int main1(t f1[],int n){
    char z;
    while(1==1){
        system("cls");
        printf("1.Podaj figure.\n");
        printf("2.Oblicz pole figur.\n");
        printf("3.Sprawdz ile obiektow ma obramowanie.\n");
        printf("4.Wyjdz z programu.\n\n");
        printf("Wybierz numer");
        z=getch();
        if(z=='1'){
            tablica();
        }else if(z=='2'){
            oblicz_pole(f1,n);
        }else if(z=='3'){
            sprawdz_obramowanie(f1,n);
        }else if(z=='4'){
            exit(0);
        }else{
            continue;
        }
    }
    return 0;
}
