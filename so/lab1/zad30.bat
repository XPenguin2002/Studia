@echo off
setlocal enabledelayedexpansion
:in
set /p "liczba1=Podaj pierwsza liczbe: "
set /p "operator=Podaj operator (+, -, *, /): "
set /p "liczba2=Podaj druga liczbe: "

if "%operator%"=="/" if "%liczba2%"=="0" (
    echo debil.
    pause
    goto in
)

set /a wynik=0
if "%operator%"=="+" (
    set /a wynik=liczba1+liczba2
)
if "%operator%"=="-" (
    set /a wynik=liczba1-liczba2
)
if "%operator%"=="*" (
    set /a wynik=liczba1*liczba2
)
if "%operator%"=="/" (
    set /a wynik=liczba1/liczba2
)

echo !wynik!
endlocal