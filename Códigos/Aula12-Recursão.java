import java.util.ArrayList;
public class Recursao {
    
        static void mostrarSequenciaCrescente(int numero){
            //variável de controle = i
            for (int i = 0; i <= numero; i++){
                System.out.println(i);
            }
        }


        // PRIMEIRO: POR LAÇO // SEGUNDO: POR RECURSÃO

        static void mostrarSequenciaDecrescente(int numero){
            //variável de controle = número
            for(; numero>= 0; numero--){
                System.out.println(numero);
            }
        }

        static void mostrarSequenciaDecrescenteR(int numero){
            if (numero >= 0){
                System.out.println(numero);
                mostrarSequenciaDecrescente(numero - 1); //ponto de recursão
            }
        }

        static void mostrarSequenciaCrescenteR(int numero){
            if(numero>=0){
                mostrarSequenciaCrescenteR(numero - 1);
                System.out.println(numero);
            }
        }

        static void mostrarIntervalo(int ini, int fim){
            for(; ini<=fim; ini++){
                System.out.println(ini);
            }
        }

        static void mostrarIntervaloR(int ini, int fim){
            if(ini>= fim){
                System.out.println(ini);
                mostrarIntervaloR(ini + 1, fim); //ponto da transformação da váriavel na recursão
            }
        }

        static void mostraLista(ArrayList<Integer> lista){
            for (int i = 0; i< lista.size(); i++){
                System.out.println(lista.get(i));
            }
            //for(Integer i : lista){
              //  System.out.println(i);
            //}
        }



        // SEM ESTAR EM ORDEM CRESCENTE 

        /*static void mostrarListaR(ArrayList<Integer> lista, int n){
            if(n>0){
                System.out.println(lista.get(n-1));
                mostrarListaR(lista, n - 1);//ponto de recursão
            }
        }*/

        // EM ORDEM CRESCENTE

         static void mostrarListaR(ArrayList<Integer> lista, int n){
            if(n>0){
                mostrarListaR(lista, n - 1);//ponto de recursão
                System.out.println(lista.get(n-1));
            }
        }

        static void mostrarParesListaR(ArrayList<Integer> lista, int n){
            if(n>0){
                mostrarParesListaR(lista, n-1);
                if(lista.get(n-1) % 2 == 0){
                    System.out.println(lista.get(n-1));
                } 
            }
        }

        static void substituirR(ArrayList<Integer> lista, int n, int x, int y){
            if(n>0){
                substituirR(lista, n-1, x, y);//ponto de recursão
                if(lista.get(n-1) == x){
                    lista.set(n-1, y);
                }
                System.out.println(lista.get(n-1));
            }
        }


        public static void main(String[] args) {

        //int numero = 3;

        //mostrarSequenciaCrescente(numero); //mostrar a sequencia de 0 até número
        //mostrarSequenciaDecrescente(numero); //mostrar sequencia de numero até 0

        //mostrarSequenciaDecrescenteR(numero);
        //mostrarSequenciaCrescenteR(numero);

        //mostrarIntervalo(3, 6);
        //mostrarIntervaloR(3, 6);
        
        ArrayList<Integer> lista = new ArrayList<>();
        //lista = [20, 30, 40];
        lista.add(21);
        lista.add(30);
        lista.add(43);

        //mostraLista(lista);
        mostrarListaR(lista, lista.size());

        //EXERCÍCIOS
        mostrarParesListaR(lista, lista.size());

        substituirR(lista, lista.size(), 30, 100);

    }
}
