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
        
  *C completo total*
# Exemplo com Desafios 
```
#include <iostream>
#include <cstdlib>
using namespace std;

typedef struct no{
    int valor;
    struct no *esq;
    struct no *dir;
} Arvore;

Arvore *inserir(int valor, Arvore *raiz){
    if(raiz){
        if(valor < raiz->valor){
            raiz -> esq = inserir(valor, raiz -> esq);
        }else{
            raiz ->dir = inserir(valor, raiz ->dir);
        }
    }else{
        //alocar memória
        Arvore *novo = (Arvore*) malloc (sizeof(Arvore));
        //depositar valores 
        novo -> valor = valor;
        novo -> esq = NULL;
        novo -> dir = NULL;
        //retonar o elemento criado
        return novo;
    }
}


void red(Arvore *raiz){
    if(raiz){
        cout << raiz->valor << endl;
        red(raiz->esq);
        red(raiz->dir);
    }
}

void erd(Arvore * raiz){
    if(raiz){
        erd(raiz->esq);
        cout << raiz-> valor << endl;
        erd(raiz->dir);
    }
}

void edr(Arvore *raiz){
    if(raiz){
        edr(raiz->esq);
        edr(raiz->dir);
        cout << raiz-> valor << endl;
    }
}

void exibir(Arvore *raiz, int nivel){
    if(raiz){
        //tudo para direita
        exibir(raiz-> dir, nivel + 1);

        //exibir o nodo dentro de seu nivel
        for(int i = 0; i < nivel; i++){
            cout << "  ";
        }
        cout <<raiz->valor<< "(" << nivel << ")" << endl;

        //tudo para esquerda
        exibir(raiz->esq, nivel + 1);
    }
}

int contarNos(Arvore *raiz){
    if(raiz){
        return 1 + contarNos(raiz->esq) + contarNos(raiz->dir);
    }
    return 0;
}

// DESAFIOS

//métodos que conte os números pares 
int contarPares(Arvore *raiz){
    if(raiz){
        int atual = (raiz->valor % 2 == 0) ? 1 : 0;
        return atual + contarPares(raiz->esq) + contarPares(raiz->dir);
    }
    return 0; 
}

//método que conte os nodos folhas = sem filhos
int contarFolhas(Arvore *raiz){
    if(!raiz){
        return 0;
    }
    if(raiz->esq == NULL && raiz->dir == NULL){
        return 1;
    }

    return contarFolhas(raiz-> esq) + contarFolhas(raiz->dir);
}

//método que conte os nodos SEM folhas = com filhos
int contarSemFolhas(Arvore *raiz){
    if(!raiz){
        return 0;
    }
    if(raiz->esq != NULL && raiz->dir != NULL){
        return 1;
    }

    return contarSemFolhas(raiz-> esq) + contarSemFolhas(raiz->dir);
}

//método que retorne true (1) se valor esta na árvore ou retorne false (0) se valor não está na árvore
int contido(int valor, Arvore *raiz){
    if(raiz == NULL){
        return 0;
    }
    if(raiz->valor == valor){
        return 1;
    }
    if(valor < raiz->valor){
        return contido(valor, raiz->esq);
    }else{
        return contido(valor, raiz->dir);
    }
}


int main(){
    Arvore *raiz = NULL;

    raiz = inserir(101, raiz);
    raiz = inserir(50, raiz);
    raiz = inserir(200, raiz);
    raiz = inserir(20, raiz);
    raiz = inserir(70, raiz);
    raiz = inserir(250, raiz);
    raiz = inserir (150, raiz);


    //red(raiz);
    //erd(raiz);
    //edr(raiz);

    exibir(raiz, 0);

    cout << "Total de elementos: " << contarNos (raiz) << endl;

    cout << "Numeros pares na arvore: " << contarPares(raiz) << endl;

    cout << "Total de nodos com folhas: " << contarFolhas(raiz) << endl;

    cout << "Total de nodos sem folhas: " << contarSemFolhas(raiz) << endl;

    cout << "O valor esta contido na arvore? " << (contido(200, raiz) ? "sim" : "nao") << endl;

    return 1;
}
```
