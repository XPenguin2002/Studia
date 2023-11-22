@echo off
if "%1"=="" (
echo Poprawna skladnia polecenia: %0 [sciezka do pliku]
exit /b 1
)

for /f "tokens=1,2,3 delims=," %%a in (%1) do (
net user /add %%c
net user %%c /fullname:"%%b"

)


pause
exit /b 0