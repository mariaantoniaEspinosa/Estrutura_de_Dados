#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;

void inicializar(string vetor[]){
    for(int i =0; i< TAMANHO; i++){
        vetor[i] = "branco";
    }
}


int inserir(string nome, string vetor[], int total){
    if(total == TAMANHO){
        cout << "Vetor lotado\n";
    } else {
        for( int i = 0; i < TAMANHO; i++){
            if(vetor[i] == "branco"){
                vetor[i] = nome;
                total ++;
                break;
            }
        }
    }
    return total;
}

void exibir(string vetor[]){
    for(int i =0; i < TAMANHO; i++){
        if(vetor[i] != "branco"){
             cout << vetor[i] << "\n";
        }
    }
}
