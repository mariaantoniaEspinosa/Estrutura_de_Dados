# Árvore: Estrutura de Dados Abstrata

  - árvore genérica
  - árvore binária: 1 nodo/nó raiz(pai) com 2 filhos no máximo
    - árvore binária de pesquisa/busca: ABP ou ABB - organiza
- "guarda" e "busca" bem
- Principal estrutura de dados: Lista
  
### Conceitos

- raiz: nó/nodo de uma (sub)árvore;
- folhs: nó/nodo sem filhos;
- percursão
  - LRED: pré-fixado; localizar dados ou pesquisa; - *if(arvore.contains(60)*
  - LERD: infixado; exibição; - *for(Integer i : arvore)*
  - LEDR: pós-fixado; apagar árvore; - *arvore.clear*
    
## Exemplo 01

```
import java.util.TreeSet;

public class Arvore{

    public static void main(String[] args){
        TreeSet<String> arvore = new TreeSet<>();
        arvore.add("Banana");
        arvore.add("Maça");
        arvore.add("Laranja");
        arvore.add("Abacaxi");
        arvore.add("Uva");
        arvore.add("Pera");
        arvore.add("Manga");

        System.out.println("Elementos da TreeSet: ");
            for(String fruta : treeSet){ // ERD
                System.out.println(fruta);
            }

            if(arvore.contains("Caqui")){ // RED
                System.out.println("A treeSet contém caqui");
            } else {
                System.out.println("A treeSt não contém caqui");
            }

            arvore.clear(); // EDR

            System.out.println("Tamanho da treeSet após limpar: "+ arvore.size());

    }
}
```

## Exemplo 02 - testar exemplo em casa

```
import java.util.ArrayList;
import java.util.TreeSet;

public class Arvore{

    public static void main(String[] args){
        TreeSet<Integer> arvore = new TreeSet<>();
        ArrayList<Integer> lista = new ArrayList<>();
        int quantidade = 10000000;


        long inicio = System.currentTimeMillis();
        for(int i = 0; i< quantidade; i++){
            int numero = (int) (Math.random() * quantidade);
            arvore.add(numero);
        }
        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução arvore: " + tempoDecorrido + " ms");

        
        inicio = System.currentTimeMillis();
        for(int i =0; i < quantidade; i++){
            int numero = (int) (Math.random() * quantidade);
            lista.add(numero);
        }
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução lista: " + tempoDecorrido + " ms");


    }
}
```

## Exemplo 03

```
import java.util.ArrayList;
import java.util.TreeSet;
 
public class Arvore {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();
        ArrayList<Integer> lista = new ArrayList<>();
        int quantidade = 10000000;
 
        //adicionando na árvore
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            int numero = (int) (Math.random() * quantidade);
            arvore.add(numero);
        }
        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de insercao em arvore: " + tempoDecorrido + " ms");
 
        //acionando na lista
        inicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            int numero = (int) (Math.random() * quantidade);
            lista.add(numero);
        }
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de insercao em lista: " + tempoDecorrido + " ms");
 
        //pesquisando na árvore
        inicio = System.currentTimeMillis();
        System.out.println("Verificando se o número -9 está presente na árvore: " + arvore.contains(-9));
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de pesquisa em árvore: " + tempoDecorrido + " ms");
 
        //pesquisando na lista
        inicio = System.currentTimeMillis();
        System.out.println("Verificando se o número -9 está presente na lista: " + lista.contains(-9));
        fim = System.currentTimeMillis();
        tempoDecorrido = fim - inicio;
        System.out.println("Tempo de execução de pesquisa em lista: " + tempoDecorrido + " ms");
    }
}
```
### Desafio ÁRVORE 
 
- Fazer um programa em Java  para gerenciar figurinhas da copa 2026. O programa deve persistir e identificar figurinhas para troca entre duas pessoas.
- A classe básica de ver ser:
  - Figura:
    - nomeSelecao
    - numeroFigura
    - descricao //nome do jogador, brasao, ou bandeira
    - quantidade //opcional, usada nas repetidas
    - rara (boolean)
 
- O menu deve ser:
  - 1 - Cadastrar figuras repetidas pessoais (persistidas em arquivo csv figuras_repetidas_pessoais.csv e adicionadas na -arvore_repetidas_pessoais)
  - 2 - Listar figuras repetidas pessoais (mostrar a arvore respectiva)
  - 3 - Cadastrar figuras desejadas pessoais (persistidas em arquivo csv figuras_desejadas_pessoais.csv e adicionadas na arvore_desejadas_pessoais)
  - 4 - Listar figuras desejadas pessoais (mostrar a arvore respectiva)
  - 5 - Carregar figuras repetidas OUTRO (carregar o arquivo, listar as figuras e mostrar as figuras que dão match com arvore_desejadas_pessoais)
  - 6 - Carregar figuras desejadas OUTRO (carregar o arquivo, listar as figuras e mostrar as figuras que dão match com arvore_repetidas_pessoais)
  - 7 - Sair
  - Opção:
 
- Toda vez que o programa for iniciado, os arquivos csv pessoais devem ser populados em suas arvores respectivas.
 
 
