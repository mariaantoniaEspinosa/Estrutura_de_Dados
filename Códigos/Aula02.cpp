#include <cstdlib>
#include <iostream>
#include <string>
#define TAMANHO 10

using namespace std;

#include "utilidades.h"


int main(){
    string vetorNomes[TAMANHO]; 
    inicializar(vetorNomes);
    int totalNomesInseridos = 0;

    totalNomesInseridos = inserir ("Davi", vetorNomes, totalNomesInseridos);
    totalNomesInseridos = inserir ("Eduardo", vetorNomes, totalNomesInseridos);
    totalNomesInseridos = inserir ("Gabriel", vetorNomes, totalNomesInseridos);

    if(totalNomesInseridos>0){
        exibir(vetorNomes);
    } else{
        cout << "Vetor de nomes vazio\n";
    }
   

    //todo vetor é um ponteiro 

    //CMD: cd downloads > cd Estrutura_de_Dados > dir > g++ .\exemploLista1.cpp -o roda > .\roda.exe


    return 1;
}
