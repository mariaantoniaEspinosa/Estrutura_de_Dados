import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Classe Aluno
class Aluno {

    private String nome;
    private String curso;
    private String sexo;
    private String anoIngresso;

    public Aluno(String nome, String curso, String sexo, String anoIngresso) {
        this.nome = nome;
        this.curso = curso;
        this.sexo = sexo;
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getSexo() {
        return sexo;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s, Curso: %s, Ano: %s",
            nome,
            curso,
            anoIngresso
        );
    }
}

// Classe SistemaAcademico
class SistemaAcademico {

    private List<Aluno> alunos;

    public SistemaAcademico(String arquivoCSV) {
        alunos = new ArrayList<>();
        carregarDados(arquivoCSV);
    }

    // Ler arquivo CSV
    public void carregarDados(String arquivoCSV) {

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                if (!linha.isEmpty()) {

                    String[] dados = linha.split(",");

                    Aluno novoAluno = new Aluno(
                        dados[0],
                        dados[1],
                        dados[2],
                        dados[3]
                    );

                    alunos.add(novoAluno);
                }
            }

        } catch (IOException e) {
            System.out.println("Erro: O arquivo alunos.csv não foi encontrado.");
        }
    }

    // Ordenar por nome
    public void ordenarPorNome() {

        Collections.sort(alunos, new Comparator<Aluno>() {

            @Override
            public int compare(Aluno a1, Aluno a2) {
                return a1.getNome().compareToIgnoreCase(a2.getNome());
            }
        });
    }

    // Ordenar por ano
    public void ordenarPorAno() {

        Collections.sort(alunos, new Comparator<Aluno>() {

            @Override
            public int compare(Aluno a1, Aluno a2) {
                return a1.getAnoIngresso().compareTo(a2.getAnoIngresso());
            }
        });
    }

    // Buscar aluno
    public Aluno buscarAluno(String nomeProcurado) {

        for (Aluno aluno : alunos) {

            if (aluno.getNome().equalsIgnoreCase(nomeProcurado)) {
                return aluno;
            }
        }

        return null;
    }

    // Relatório por ano
    public Map<String, Integer> relatorioPorAno() {

        Map<String, Integer> contagem = new HashMap<>();

        for (Aluno aluno : alunos) {

            String ano = aluno.getAnoIngresso();

            contagem.put(
                ano,
                contagem.getOrDefault(ano, 0) + 1
            );
        }

        return contagem;
    }

    // Exibir lista
    public void exibirLista() {

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

// Classe Main
public class Main {

    public static void main(String[] args) {

        SistemaAcademico sistema =
            new SistemaAcademico("alunos.csv");

        Scanner sc = new Scanner(System.in);

        System.out.println("Alunos ordenados por nome");

        sistema.ordenarPorNome();
        sistema.exibirLista();

        System.out.println("\nBusca de Aluno");

        System.out.print("Digite o nome do aluno: ");
        String nomeBusca = sc.nextLine();

        Aluno busca = sistema.buscarAluno(nomeBusca);

        if (busca != null) {
            System.out.println("Resultado da busca:\n " + busca);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        System.out.println("\nRelatório de Ingressantes por ano");

        Map<String, Integer> stats =
            sistema.relatorioPorAno();

        List<String> anos =
            new ArrayList<>(stats.keySet());

        Collections.sort(anos);

        for (String ano : anos) {

            System.out.println(
                "Ano " + ano + ": "
                + stats.get(ano)
                + " aluno(s)"
            );
        }

        sc.close();
    }
}