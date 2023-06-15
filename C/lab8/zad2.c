int main(void) {
    char ciag1[]="ababaeef";
    char ciag2[]="ba";
    int i=0;
    char *p=ciag1;
    while(p=strstr(p, ciag2)){
        i++;
        p++;
    }
    printf("Ilosc odnalezionych wzorcow '%s' w ciagu '%s': %d\n",ciag2,ciag1,i);
    return 0;
}
