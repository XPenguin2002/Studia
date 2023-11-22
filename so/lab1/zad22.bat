@echo off
if [%1]==[] (
echo skladnia polecenia: %0 [rozszerzenie stare] [rozszerzenie nowe] [sciezka do pliku/plikow]
exit /b 1
) else (
cd %3
ren *.%1 *.%2
)