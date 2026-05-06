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


        public static void main(String[] args) {
        int numero = 3;

        //mostrarSequenciaCrescente(numero); //mostrar a sequencia de 0 até número
        //mostrarSequenciaDecrescente(numero); //mostrar sequencia de numero até 0

        mostrarSequenciaDecrescenteR(numero);
        mostrarSequenciaCrescenteR(numero);

        }
}
