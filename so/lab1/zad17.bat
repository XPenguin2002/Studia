@echo off
if [%1]==[] (
echo skladnia polecenia: %0 dysk\sciezka
exit /b 1
) else (
del %1\*.bak
del %1\*.tmp
)