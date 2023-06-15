int main(){
    char ciag1[]="ababceef";
    char ciag2[]="ba";
    char *p;
    p=strstr(ciag1,ciag2);
    if(p){
        printf("%s",ciag2);
    }else{
        printf("Nic nie znaleziono");
    }
    return 0;
}
