# Árvore
- ED abstrata: om crud completo;
  - foco na busca;
  - tipos:
    - genérica: um nodo pai e n nodos filos;
    - binária: um nodo pai e no máximo 2 nodos filhos;
      - árvore binária de pesquisa ou de busca - ORDENADAS;
  - conceitos:
    - raiz: no ou nodo de principal de uma árvore ou de subárvores;
    - folhas: no ou nodo sem filhos (região de inserção);
    - Nó ou nodo:
      - no mínimo 3 campos: valor; filho da *direita; filho da *esquerda;
    - nível: a posição hierárquica de um no ou nodo. Começa sempre em 0;
    - percurso ou caminho;
      - RED: pré-fixado ou pré-ordem;
      - ERD: in-fixado ou em ordem;
      - EDR: pós-fixado ou pós-ordem;
        -R: visita raiz ou aplica uma instrução/comando;
        -E: empilha p/ o nodo do filho da esquerda;
        -D: empilha p/ o nodo do filho da direita;
    - exemplo:
      - RED: 100, 50, 20, 10, 30, 70, 60, 80, 200, 120, 110, 150, 250
      - ERD: 10, 20, 30, 50, 60, 70, 80, 100, 110, 120, 150, 200, 250
      - EDR: 10, 30, 20, 60, 80, 70, 50, 110, 150, 120, 250, 200, 100
        
  *C completo ++*
