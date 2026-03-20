  #include <iostream>
  #include <cstdlib>
  #include <vector> // para a lista
  #include <ctime>
  
  
  using namespace std;
  
  /**
   * @brief método que popula uma lista com numeros inteiros aleatorios dentro de uma faixa
   * 
   * @param lista contem os numeros aleatorios gerados 
   * @param quantidadeNumeros contem quantos numeros se deseja inserir na lista
   * @param faixaInicial contem o numero inicial da faixa
   * @param faixaFinal  contem o numero final da faixa
   */
  
  void popularListaAleatoria(vector<int> &lista, int quantidadeNumeros,  int faixaInicial, int faixaFinal){
      //&: se houver alteração na lista, é preciso utilizar o simbolo de endereçamento 
      srand(time(NULL));
      int numeroSorteado;
      for(int i = 0; i<quantidadeNumeros; i++){
          numeroSorteado = faixaInicial + (rand() % faixaFinal);
          lista.push_back(numeroSorteado);
      }
  
  }
  
  /**
   * @brief metodo que exibe um conteudo de uma lista de inteiros, elemento abaixo de elemento
   * 
   * @param lista lista contem os numeros inteiros
   */
  
  void exibirLista(vector<int> lista){
      for(int i = 0; i<lista.size(); i++){
          cout << lista[i] << "\n";
      }
      cout << "------------";
      cout << "\n";
      cout << "Total de elementos: " << lista.size() << "\n";
  
  }
  
  void copiarListaSemReplicados(vector<int> listaOrigem, vector<int> &listaDestino){
          for(int i = 0; i < listaOrigem.size(); i++){
              int elemento = listaOrigem[i];
              int j;
              for(j = 0; j< listaDestino.size(); j++){
                  if(listaDestino[j]==elemento){
                      break;
                  }
              }
              if(j==listaDestino.size()){
                  listaDestino.push_back(elemento);
              }
          }
  
  }
