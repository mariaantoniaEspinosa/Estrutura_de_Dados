import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;

public class Estrutura{

    public static void gerarProcessos(ArrayList<Processo> lista){
        int id;
        String descricao;
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random ();
        Processo tmp;

        while(true){
            id = gerador.nextInt(500);
            System.out.print("Descricao do Processo: ");
            descricao = teclado.nextLine().toUpperCase();
            if (descricao.equals("SAIR")){
                break;
            }
            tmp = new Processo(id, descricao);
            if (!lista.contains(tmp)){
                lista.add(tmp);
            }
        }
    }


    public static void exibirProcesso(ArrayList<Processo> lista){
        System.out.println("Quatidade de processos: " + lista.size());
       //System.out.println(lista);

       //índice = atributo que será usado pra ordenar
       //qual será a ordem de descrição? a descição será a usada
       lista.sort((p1, p2) -> p1.descricao.compareTo(p2.descricao));

       //para exibir um abaixo do outro:
       for(Processo p : lista){
            System.out.println(p);
       }
    }


    public static void localizarProcesso(ArrayList<Processo> lista){
        String descricao;
        Scanner teclado = new Scanner(System.in);
        //rotina para pesquisar parte da descrição na lista de processos

       System.out.println("Digite palavra ou expressao que deseja localizar: ");
       descricao = teclado.nextLine().toUpperCase();

       for(Processo p : lista){
            if (p.descricao.contains(descricao)){
              System.out.println(p);
            }
        }
    }

    public static void localizarParaExcluir(ArrayList<Processo> lista){
        String descricao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite palavra ou expressao que deseja excluir: ");
        descricao = teclado.nextLine().toUpperCase();


        Iterator<Processo> it = lista.iterator();
        while (it.hasNext()) {
            Processo p = it.next();
            if (p.descricao.contains(descricao)){
                it.remove();
            }
        }

       // for(Processo p : lista){
        //    if (p.descricao.contains(descricao)){
        //        lista.remove(p);
        //        //System.out.println(lista);
        //         for (Processo p2 : lista) {
        //            System.out.println(p2);
        //        }
        //    }
        //}
    }

    public static void main(String[ ] args){
       ArrayList<Processo> lista = new ArrayList<>();

       Estrutura.gerarProcessos(lista);

       Estrutura.exibirProcesso(lista);

       Estrutura.localizarProcesso(lista);

       Estrutura.localizarParaExcluir(lista);
       
       Estrutura.exibirProcesso(lista);

       // cara entre <> é o tipo de lista que estamos armazenando, neste caso = processo

       //lista só aceita Processo 
       //um Processo é construido através do construtor (new Processo)
       
        //construtor contruído exige 2 parâmetros 
    //    lista.add(new Processo(1, "abertura"));
    //    lista.add(new Processo(500,"teste de clock"));
    //    lista.add(new Processo(45,"fechamento de valvula"));
    //    lista.add(new Processo(1,"outro processo"));

    }
}

    }
}
