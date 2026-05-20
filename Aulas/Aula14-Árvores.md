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
## Exemplo
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
