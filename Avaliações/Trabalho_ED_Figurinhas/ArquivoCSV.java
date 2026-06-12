import java.io.*;
import java.util.TreeSet;

public class ArquivoCSV {

    public static void salvarFigura(String nomeArquivo, Figura figura) {

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(nomeArquivo, true))) {

            bw.write(figura.paraCSV());
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }

    public static TreeSet<Figura> carregarFiguras(String nomeArquivo) {

        TreeSet<Figura> figuras = new TreeSet<>();

        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            return figuras;
        }

        try (BufferedReader br =
                     new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados = linha.split(",");

                Figura figura = new Figura(
                        dados[0], Integer.parseInt(dados[1]), dados[2], Integer.parseInt(dados[3]), Boolean.parseBoolean(dados[4])
                );

                figuras.add(figura);
            }

        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivo.");
        }

        return figuras;
    }
}