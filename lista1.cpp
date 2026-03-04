#include <iostream>
#include <cstdlib>
#include <vector> // para a lista

using namespace std;

#include "biblioteca.h"

int main(){
    
    //declarando uma lista
    vector<int> listaNumero;


    int quantidadeNumeros;
    int faixaInicial=10, faixaFinal=50;
    vector<int> listaResultados;

    cout << "Digite quantos numeros quer gerar: ";
    cin >> quantidadeNumeros;

    popularListaAleatoria(listaNumero, quantidadeNumeros, faixaInicial, faixaFinal);
    exibirLista(listaNumero);
    copiarListaSemReplicados(listaNumero, listaResultados);

    cout << "\nLista sem numeros repetidos:\n";
    exibirLista(listaResultados);

    return 1;
}