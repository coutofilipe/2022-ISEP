## Ex.02 - Complexidade

### a) 
    É não deterministico porque tem diferentes comportamentos mediante as strings que recebe;

### b) 
    Utilizar exemplos para explicar:
    string: AAAAAAXXXXAAAAA
    padrao: XXXXXX

    Best case: O(n)
    Worst case: O(n^2) quando falha ao encontrar o padrão nas primeiras iterações;

### Ex03 - BST
    Método não recursivo. Visita por niveis (Devolve um Map). Precisa de:


    
`
limiteInf == 0;
limiteSup == height;
while (limiteInf <= limiteSup) {
    Collections(map.get(limiteInf), reverse)
    list.addAll(map.get(limiteInf))
    list.addAll(map.get(limiteSup))
    limiteInf++;
    limiteSup--;
}`

### Ex04 - Grafos
    . ciclo para iterar sobre todos os vértices e para cada vertice usar um ShortestPaths(de um vOrig para todos os outros);

    . Ou usar o FW que é mais eficiente;

### Ex05 - Heap Priority Qeueu
    Cada elemento da heap é um par. Fazer a visita em largura whiskas saquetas
    
