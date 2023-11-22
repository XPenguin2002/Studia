@echo off
if "%1"=="" (
    echo Podaj sciezke do zasobu jako pierwszy parametr.
    exit /b 1
)
if "%2"=="" (
    echo Podaj nazwe uzytkownika jako drugi parametr.
    exit /b 1
)
if "%3"=="" (
    echo Podaj prawa dostepu jako trzeci parametr.
    exit /b 1
)
icacls %1 /grant %2:(%3) /inheritance:e
pause
exit /b 0