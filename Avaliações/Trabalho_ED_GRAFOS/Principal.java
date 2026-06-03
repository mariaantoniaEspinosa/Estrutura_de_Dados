import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> vertices = new ArrayList<>();
        
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("mapa.csv"))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(",");
                    String origem = dados[0].trim();
                    String destino = dados[1].trim();

                    if (!vertices.contains(origem)) {
                        vertices.add(origem);
                    }
                    if (!vertices.contains(destino)) {
                        vertices.add(destino);
                    }
                }
            }
            Collections.sort(vertices);
            Grafo g = new Grafo(vertices);

            try (BufferedReader br = new BufferedReader(new FileReader("mapa.csv"))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(",");
                    String origem = dados[0].trim();
                    String destino = dados[1].trim();

                    g.inserirAresta(
                        g.pegarIndice(origem),
                        g.pegarIndice(destino)
                    );
                }
            } 

            System.out.println("Vértices:");
            System.out.println(vertices);
            System.out.println("Matriz: ");
            g.mostrarMatriz();
            System.out.println("Caminhos: ");
            g.mostrarGrafo();

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo mapa.csv: " + e.getMessage());
        }
    }
}