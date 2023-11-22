@echo off
if "%1"=="" (
echo Składnia polecenia: %0 dysk\sciezka rozszerzenie1 rozszerzenie2 ...
exit /b 1
) else (
:benc
if "%2"=="" (
exit /b 0
) else (
del %1\*.%2"
shift /2
goto benc
)
)