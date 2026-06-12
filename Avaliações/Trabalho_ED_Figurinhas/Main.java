import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AlbumFigurinhas album = new AlbumFigurinhas();

        int opcao;

        do {

            System.out.println("\nMENU  - ÁLBUM DE FIGURINHAS");
            System.out.println("1 - Cadastrar figuras repetidas pessoais");
            System.out.println("2 - Listar figuras repetidas pessoais");
            System.out.println("3 - Cadastrar figuras desejadas pessoais");
            System.out.println("4 - Listar figuras desejadas pessoais");
            System.out.println("5 - Carregar figuras repetidas OUTRO");
            System.out.println("6 - Carregar figuras desejadas OUTRO");
            System.out.println("7 - Sair");
            System.out.print("Opção: ");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    album.cadastrarRepetida(sc);
                    break;

                case 2:
                    album.listarRepetidas();
                    break;

                case 3:
                    album.cadastrarDesejada(sc);
                    break;

                case 4:
                    album.listarDesejadas();
                    break;

                case 5:
                    album.carregarRepetidasOutro(sc);
                    break;

                case 6:
                    album.carregarDesejadasOutro(sc);
                    break;

                case 7:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        sc.close();
    }
}