import java.util.Scanner;
import java.util.TreeSet;

public class AlbumFigurinhas {

    private TreeSet<Figura> repetidasPessoais;
    private TreeSet<Figura> desejadasPessoais;

    public AlbumFigurinhas() {

        repetidasPessoais = ArquivoCSV.carregarFiguras("figuras_repetidas_pessoais.csv");

        desejadasPessoais = ArquivoCSV.carregarFiguras("figuras_desejadas_pessoais.csv");
    }

    public void cadastrarRepetida(Scanner sc) {

        Figura figura = lerFigura(sc);

        repetidasPessoais.add(figura);

        ArquivoCSV.salvarFigura("figuras_repetidas_pessoais.csv", figura);

        System.out.println("Figura cadastrada.");
    }

    public void cadastrarDesejada(Scanner sc) {

        Figura figura = lerFigura(sc);

        desejadasPessoais.add(figura);

        ArquivoCSV.salvarFigura("figuras_desejadas_pessoais.csv",figura);

        System.out.println("Figura cadastrada.");
    }

    private Figura lerFigura(Scanner sc) {

        System.out.print("Seleção: ");
        String selecao = sc.nextLine();

        System.out.print("Número: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        System.out.print("Rara (true/false): ");
        boolean rara = Boolean.parseBoolean(sc.nextLine());

        return new Figura(selecao, numero, descricao, quantidade, rara);
    }

    public void listarRepetidas() {

        System.out.println("\nFIGURAS REPETIDAS");

        for (Figura figura : repetidasPessoais) {
            System.out.println(figura);
        }
    }

    public void listarDesejadas() {

        System.out.println("\nFIGURAS DESEJADAS");

        for (Figura figura : desejadasPessoais) {
            System.out.println(figura);
        }
    }

    public void carregarRepetidasOutro(Scanner sc) {

        System.out.print("Nome do arquivo CSV: ");
        String arquivo = sc.nextLine();

        TreeSet<Figura> repetidasOutro = ArquivoCSV.carregarFiguras(arquivo);

        System.out.println("\nFIGURAS REPETIDAS DO OUTRO");

        for (Figura figura : repetidasOutro) {
            System.out.println(figura);
        }

        System.out.println("\nMATCHES");

        for (Figura outro : repetidasOutro) {

            for (Figura desejada : desejadasPessoais) {

                if (outro.getNumeroFigura() == desejada.getNumeroFigura()) {
                    System.out.println(outro);
                }
            }
        }
    }

    public void carregarDesejadasOutro(Scanner sc) {

        System.out.print("Nome do arquivo CSV: ");
        String arquivo = sc.nextLine();

        TreeSet<Figura> desejadasOutro = ArquivoCSV.carregarFiguras(arquivo);

        System.out.println("\nFIGURAS DESEJADAS DO OUTRO");

        for (Figura figura : desejadasOutro) {
            System.out.println(figura);
        }

        System.out.println("\nMATCHES");

        for (Figura outro : desejadasOutro) {

            for (Figura repetida : repetidasPessoais) {

                if (outro.getNumeroFigura() == repetida.getNumeroFigura()) {
                     System.out.println(repetida);
                }
            }
        }
    }
}