## Recursão
- Recursão é um recurso computacional de programação que substitui as instruções de repetição (for-while)
-  Toda repetição obedece 3 regras:
    - A - inicialização da variável de controle
    - B - teste de parada com a variável de controle
    - C - transformação da variável de controle
```
import java.util.ArrayList;
import java.util.Random;

class Recusao {
    
    public static void popular(ArrayList<Integer> lista, int quantidade) {
        Random gerador = new Random();
        int numero;
        for (int i = 0; i < quantidade; i++) {
            numero = gerador.nextInt(100);
            lista.add(numero);
        }
    } 

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)); // "System" corrigido com S maiúsculo
        }
    }

    public static void exibirR(ArrayList<Integer> lista, int n){
        if(n>0){
            //codigo antes do empilhamento
            System.out.println(lista.get(n-1));
            exibirR(lista, n - 1);
            //codigo depois do empilhamento
            System.out.println(lista.get(n-1));

        }
    }

    public static int somarR(ArrayList<Integer>lista, int n){
        if(n>0){
            int soma = lista.get(n-1) + somarR(lista, n-1);
            return soma;
        }
        return 0;
    }

    public static int contarParesR(ArrayList<Integer>lista, int n){
        if(n>0){
            int soma;
            if(lista.get(n-1)%2==0){
                soma = lista.get(n-1)+contarParesR(lista, n-1);
            }
            else{
                soma = 0 + contarParesR(lista, n-1);
            }
            return soma;
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int quantidade = 5;
        lista.add(15);
        popular(lista, quantidade);
        exibir(lista);
        exibirR(lista, quantidade);
        System.out.println("A soma dos elementos da lista é: " + somarR(lista, lista.size()));
        System.out.println("A soma dos pares na lista é: " + contarParesR(lista, lista.size()));

    }
}
```
