#include <stdio.h>
int main(void){
    int kolor1;
    int kolor2;
    int a;
    int b;
    printf("Jaki lubisz kolor? 1-niebieski 2-zielony 3-czerwony\n");
    scanf("%d",&kolor1);
    if(kolor1==1){
        printf("Wolisz jasny niebieski czy ciemny niebieski? 1-jasny 2-ciemny\n");
        scanf("%d",&kolor2);
    }else{
        if(kolor1==2){
            printf("Wolisz jasny zielony czy ciemny zielony? 1-jasny 2-ciemny\n");
            scanf("%d",&kolor2);
        }else{
            printf("Wolisz jasny czerwony czy ciemny czerwony? 1-jasny 2-ciemny\n");
            scanf("%d",&kolor2);
        }
    }
    printf("Czy wybrany przez ciebie kolor jest twoim ulubionym? 1-tak 2-nie\n");
    scanf("%d",&a);
    if(a==1){
        printf("Super. ");
    }else{
        printf("Szkoda. ");
    }
    printf("Podobala ci sie ankieta? 1-tak 2-nie\n");
    scanf("%d",&b);
    return 0;
}
