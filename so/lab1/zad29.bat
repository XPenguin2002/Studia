@echo off
setlocal enabledelayedexpansion
set /a "losowa=!random! %% 101"
set "proby=0"
:zgadywanie
set /a "proby+=1"
if !proby! gtr 6 (
    echo Koniec prob. Wylosowana liczba to: !losowa!
) else (
    set /p "zgadnij=proba nr !proby!: Podaj swoja liczbe: "
    if !zgadnij! lss %losowa% (
        echo Za mala liczba! Sprobuj ponownie.
        goto zgadywanie
    ) else if !zgadnij! gtr %losowa% (
        echo Za duza liczba! Sprobuj ponownie.
        goto zgadywanie
    ) else (
        echo Brawo! Zgadles liczbe %losowa%! Wygrales.
    )
)
endlocal