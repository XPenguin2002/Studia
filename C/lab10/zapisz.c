#include <stdio.h>
struct liczba{
    int a;
    float b;
};
int main(){
    int n,i;
    struct liczba l[100];
    FILE *plik=fopen("plik.txt","wb");
    FILE *ntxt=fopen("n.txt","wb");
    printf("Podaj liczbe struktur: ");
    scanf("%d", &n);
    for (i=0;i<n;i++){
        printf("Podaj wartosci dla liczby %d:\na:",i+1);
        scanf("%d",&l[i].a);
        printf("b:");
        scanf("%f",&l[i].b);
    }
    fwrite(l,sizeof(struct liczba),n,plik);
    fprintf(ntxt,"%d",n);
    fclose(plik);
    return 0;
}
