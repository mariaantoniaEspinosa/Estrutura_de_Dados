import java.util.ArrayList;
import java.util.Iterator;

public class Lista {
    public static void main (String[] args){
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(45);
        lista.add(2);
        lista.add(42);
        lista.add(23);

        //PERCURSOS EM LISTA

        //percorrer via indice (não usar para remoção de lista em tempo de execução)
        System.out.println("Percorrendo via indice");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i)); //lista[i]
        }

        //percorrer via objeto (não usar para remoção de lista em tempo de execução)
        System.out.println("Percorrendo via objeto");
        for(Integer p : lista){
            System.out.println(p);
        }

        //percorrer por um iterador (usar para alteração de lista durante tempo de execução)
        // faz uma cópia virtual da lista
        System.out.println("Percorrendo via Iterator");
        Iterator <Integer> it = lista.iterator();
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }

    }
    
}
