@echo off
schtasks /create /tn "defragmentacja" /sc once /sd %1 /st %2 /tr "C:\Windows\System32\defrag.exe C: /O"