# Aula7ED.3
## Atividade 3

### 3. Considerando a biblioteca Fila Genérica, já criada, faça:
  
Criar um projeto Java (EscalonamentoProcessos) e importe a biblioteca FilaObject. Esse novo projeto irá receber Objectos com dados de processos com o formato do objecto abaixo e simular o escalonamento de processos RoundRobin.

A classe EscalonadorController no package controller deve ter 1 método:

• O método escalonador que recebe uma Fila de processos, como parâmetros, verifica se o número que vezes é maior que 1, decrementa esse valor no objeto e, se for maior que 1, insere o objeto novamente na fila;

A classe Principal, no package view, no seu método Main, deve inicializar uma fila Com processos, como no exemplo abaixo Objeto:

<img width="155" height="85" alt="image" src="https://github.com/user-attachments/assets/522a97d8-84c7-46c3-b2af-845e43af7e4e" />


Exemplo de entrada:

{"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"}
