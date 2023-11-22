@echo off
echo Nazwa zalogowanego uzytkownika: %USERNAME%
echo Litera dysku systemowego: %SystemDrive%
echo Aktualny katalog: %cd%
echo Informacje o procesorze:
wmic cpu get name