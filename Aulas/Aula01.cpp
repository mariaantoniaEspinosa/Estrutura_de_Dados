#include <iostream>
#include <string> 
using namespace std;
int main(){
    
    string nome;

    int boulusAlimentar;
    int quantidadeInsulinaMaxima;
    int carboidrato;

    int quantidadeDeInsulina;
    int quantidadeMaximaCarboidrato; 
    int restanteInsulinaDia; 
    int restanteCarboidratoDia; 

    cout << "Ola, informe seus dados" << endl;
    cout << "Nome";
    //<< insere algo na tela
    // endl quebra a linha 

    getline(cin, nome);
    //cin fluxo de entrada

    cout << "Boulus Alimentar:";
    cin >> boulusAlimentar;
    //>> pega os dados do teclado

    cout << "Quantidade de Insulina Maxima: ";
    cin >> quantidadeDeInsulina;

    cout << "Quantidade de carboidrato ingerido: ";
    cin >> carboidrato;

    quantidadeDeInsulina = carboidrato / boulusAlimentar;
    quantidadeMaximaCarboidrato = boulusAlimentar * quantidadeInsulinaMaxima;
    restanteInsulinaDia = quantidadeInsulinaMaxima - quantidadeDeInsulina;
    restanteCarboidratoDia = quantidadeMaximaCarboidrato - carboidrato;

     
    cout << "Quantidade de insulina para essa refeicao: "
         << quantidadeDeInsulina << endl;

    cout << "Quantidade maxima de carboidrato dia: "
         << quantidadeMaximaCarboidrato << endl;

    cout << "Ainda restam "
         << restanteInsulinaDia
         << " unidades de insulina no dia" << endl;

    cout << "Ainda restam "
         << restanteCarboidratoDia
         << " g de carboidratos no dia" << endl;

    
    return 0;
}
