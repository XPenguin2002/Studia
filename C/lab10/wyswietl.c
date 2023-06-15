#include <stdio.h>
struct liczba{
    int a;
    float b;
};
int main(){
    int n,i;
    struct liczba l[100];
    FILE *plik=fopen("plik.txt","rb");
    FILE *ntxt=fopen("n.txt","rb");
    fscanf(ntxt,"%d",&n);
    if(plik==NULL){
        printf("Cos poszlo nie tak ale ja nie wiem co nie znam sie");
        return 0;
    }
    if(ntxt==NULL){
        printf("Cos poszlo nie tak ale ja nie wiem co nie znam sie");
        return 0;
    }
    fread(l,sizeof(struct liczba),n,plik);
    fclose(plik);
    for(i=0;i<n;i++){
        printf("Liczba %d:\n",i+1);
        printf("a: %d\n",l[i].a);
        printf("b: %.2f\n",l[i].b);
    }
    return 0;
}
