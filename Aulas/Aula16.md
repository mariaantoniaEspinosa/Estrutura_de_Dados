# Revisão
- Estrutura de dados
  - físicas: variáveis -> RAM
  - abstratas: algoritmos + coleções
    - lineares:
      - lista (ordem)
      - pilha (LIFO)
      - fila (FIFO)
      - -> add, remove, contains, size, empty, indexOP 
    - não lineares:
      - árvore: genéricas X binárias -> pesquisa/busca/ordenadas
      - -> add, remove, contains, size, empty, **recursão**
        
# GRAFO
- Estrutura de dados/coleção com foco em roteamento/percurso/caminhamento/track/route
- Representar em geral mapas (rodoviário...equipamentos...aeroviário...ferroviário)
- Relação de nó e seus adjacentes
- lista -> pilha -> fila -> árvore -> grafo
- Conceitos:
  - nó ou nodo ou vértice
    - V = {a, b, c, d, e}
  - aresta ou arco (linha)
    - A = {a,b; b,c; b,d; c,e; d,a; d,b; d,c; e,d}
  - Grau/ramificação: quantas partidas e quantas chegadas tem um nó; arestas que chegam e partem
    - grau 2: tem uma partida e uma chegada
    - grau 3: duas partidas e uma chegada
    - grau 5: três partidas e duas chegadas
    - ...
    - -> Grau total:
    - -> Grau incidência = chegada
    - -> Grau partida
  - Simetria
    - Simetrico: aresta sem seta indica que é simetrico e vai e volta 
    - Assimétrico: digrafo -> tem seta
  - Representação
    - matriz de adjacência
      - quantidade de linhas = quantidade de vértices
      - quantidade de colunas = quatidade de vértices
      - aresta assimétrica
      - aresta simétrica
    - disco
    - RAM
## Construindo um GRAFO
- Classe Grafo
```
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Grafo {
    int matrizADJ[][];
    int qtdVertices;
    ArrayList<String> vertices;

    /**
     * Construtor
     * @param qtdVertices para indicar a quantidade de linhas e colunas da Matriz 
    */
    public Grafo(ArrayList<String> vertices){
        this.vertices = new ArrayList<>();
        this.vertices.addAll(vertices);
        this.qtdVertices = vertices.size();
        this.matrizADJ = new int [this.qtdVertices][this.qtdVertices];

        //inicializar com 0 a matriz que representa o grafo
        for(int i = 0; i < qtdVertices; i++){
            for(int j = 0; j < qtdVertices; j++){
                this.matrizADJ[i][j] = 0;
            }
        }
    }

    /**
     * Exibe a matrizADJ do grafo em formato de matriz
     */
    void mostrarMatriz(){
        for(String v : this.vertices){
            System.out.print("    " + v);
        }
        System.out.println();

        for(int i = 0; i < qtdVertices; i++){   
            System.out.print(this.vertices.get(i) + "   ");
            for(int j = 0; j< qtdVertices; j++){
                System.out.print(matrizADJ[i][j] + "    ");
            }
            System.out.println();
        }
    }

    void mostrarGrafo(){
        for(int i = 0; i < this.qtdVertices; i++){
            System.out.print(this.vertices.get(i) + ": ");
            for(int j = 0; j < this.qtdVertices; j++){
                if(this.matrizADJ[i][j] != 0){
                    System.out.print(this.vertices.get(j) + "   ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Dado uma origem e destino é definida uma aresta
     * @param origem representa a linha
     * @param destino representa a coluna
     */

    void inserirAresta(int origem, int destino){
        if(this.matrizADJ[origem][destino] == 0){
            this.matrizADJ[origem][destino] = 1;
        }
       
    }

    /**
     * Retorna o indice na lista de vertices de um vertice
     * @param vertice é um nó ou nodo do grafo
     * @return retorna a posição do vértice
     */
    int pegarIndice(String vertice){
        return this.vertices.indexOf(vertice);
    }
}


```
- Classe Principal
```
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> estacoes = new ArrayList<>();

        //populando estacoes
        estacoes.add("a");
        estacoes.add("b");
        estacoes.add("c");
        estacoes.add("d");
        estacoes.add("e");

        Grafo gAssimetrico = new Grafo(estacoes);
        //a, b
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("a"), gAssimetrico.pegarIndice("b"));
        //b, c 
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("b"), gAssimetrico.pegarIndice("c"));
        //b, d
       gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("b"), gAssimetrico.pegarIndice("d"));
        //c, e
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("c"), gAssimetrico.pegarIndice("e"));
        //d, a
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("d"), gAssimetrico.pegarIndice("a"));
        //d, b
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("d"), gAssimetrico.pegarIndice("b"));
        //d,c
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("d"), gAssimetrico.pegarIndice("c"));
        //e, d
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("e"), gAssimetrico.pegarIndice("d"));


        gAssimetrico.mostrarMatriz(); // curiosidade, não é tão utilizado

        System.out.println();

        gAssimetrico.mostrarGrafo();

    }
}

```
# Desafio
- Ler arquivo csv, chamado mapa.csv do tipo:
  - a, b
  - b, c
  - b, d
  - d, a
  - d, b
  - d, c
  - e, d
- Extrair os vértices presentes no csv e adiciona-los na lista de vértices (lembrar de ordenar)
