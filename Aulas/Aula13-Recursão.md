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
### Exercícios
- Exercícios de fixação sobre o código base gerado. Faça métodos recurssivos que:
1) receba uma list, seu tamanho, valor de pesquisa. Caso o valor de pesquisa ocorra na lista, retornar quantas vezes ele aparece.
2) receba uma lista, seu tamanho, valor de pesquisa, valor de substituição. Caso o valor ocorra na lista, substituir o valor de pesquisa pelo valor de substituição
3) receba uma lista, seu tamanho e retorne TRUE se a lista ordenada, FALSE se a lista desordenada.
4) receba uma lista e seu tamano. O método deve exibir todos os número múltiplos de 4.
   
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

    // EXERCÍCIOS DE FIXAÇÃO

    public static int pesquisa(ArrayList<Integer>lista, int n, int valor){
        int i =  0;
        int contador = 0;
        for(i = 0; i< n; i++){
            if(lista.get(i) == valor){
                contador++;
            }
        }
        return contador;
    }

    public static int substituicao(ArrayList<Integer> lista, int n, int valor, int subs){
        int i = 0;
        for(i = 0; i<n; i++){
            if(lista.get(i) == valor){
                lista.set(i, subs);
            }
            
        }
        return i;
    }

    public static int multiplo(ArrayList<Integer>lista, int n){
        if(n>0){
            int soma = 0;
            if(lista.get(n-1)%4==0){
                System.out.println(lista.get(n-1));
                soma = 1;
            }
            return soma + multiplo(lista, n-1);
        }
        return 0;
    }

    public static boolean ordenada(ArrayList<Integer> lista, int n){
        if(n<=0){
            return true;
        }
        for(int i = 0; i<n-1; i++){
            if(lista.get(i) > lista.get(i + 1)){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int quantidade = 5;
        lista.add(15);
        popular(lista, quantidade);
        exibir(lista);
        //exibirR(lista, quantidade);
        System.out.println("A soma dos elementos da lista é: " + somarR(lista, lista.size()));
        System.out.println("A soma dos pares na lista é: " + contarParesR(lista, lista.size()));

        // EXERCÍCIOS DE FIXAÇÃO

        System.out.println("Valor de pesquisa foi encontrado:" + pesquisa(lista, quantidade, 15) + " vez");
        System.out.print("O valor 15 foi substituído por: " + substituicao(lista, quantidade, 15, 5) + " -> ");
        System.out.println(lista);
        System.out.println("Os seguintes numeros da lista são multiplos de 4: " + multiplo(lista, quantidade) + "; ");
        System.out.println("A lista está ordenada? " + ordenada(lista, quantidade));
    }
}

/* 
Exercícios de fixação sobre o código base gerado. Faça métodos recurssivos que:
1) receba uma lista, seu tamanho, valor de pesquisa. Caso o valor de pesquisa ocorra na lista, retornar quantas vezes ele aparece.
2) receba uma lista, seu tamanho, valor de pesquisa, valor de substituição. Caso o valor ocorra na lista, substituir o valor de pesquisa pelo valor de substituição
*3) receba uma lista, seu tamanho e retorne TRUE se a lista ordenada, FALSE se a lista desordenada.
4) receba uma lista e seu tamanho. O método deve exibir todos os número múltiplos de 4.
*/
```
