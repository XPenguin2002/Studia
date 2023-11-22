@echo off
setlocal enabledelayedexpansion

set "liczba1=%1"
set "operator=%2"
set "liczba2=%3"

if "%operator%"=="/" if "%liczba2%"=="0" (
    echo debil
    exit /b
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