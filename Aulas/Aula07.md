## Estrutura de Dados - Unidade 1
 - Físicas: as próprias varipaveis - fortamente dependentes da linguagem de programação
 - Abstratas: algoritmos de gestão de memória (COLEÇÕES)
   
   - Lista: conjunto de dados ordenados (não obrigatoriamente) 
     - todas as operações - inserir, remover, buscar, atualizar (Create, Retrieve, Update, Delete)
     - foco no amazenamento, busca e relatórios
     - contains, size, add, remove, isEmpty
       
   - Pilha: dados organizados pelo topo - LIFO: Last In, First Out
     - há duas operações: inserir no topo e o remover do topo
     - foco no dado que está no topo
     - peek, push, pop
       
   - Fila: dados organizados pela chegada - FIFO: First In, First Out
     - há dois ponteiros: o início/cabeça para o remover e o fim/cauda para o inserir
     - foco na prioridade de chegada, ou seja, o dado mais importante é o que está no início/cabeça
     - offers, poll
  
 - No processo de herança: LISTA -> PILHA -> FILA

- COLEÇÕES de objetos
  - Na classe, há os métodos que devem ser sobreescritos:
    - toString()
    - equals()
      
 OBS:. o arquivo serve para o programador, mas na compilação todas as classes serão geradas.
 ### Exemplo - Main
```
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Aluno {
    String cpf;
    String nome;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Aluno(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", nome=" + nome + "]";
    }
}

public class ExemploMaria {  
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String cpf, nome;
        Aluno alunoTMP;
        boolean flagSair;

        do {
            do {
                System.out.print("Digite o cpf: ");
                cpf = teclado.nextLine().toUpperCase();
                if (cpf.equals("FIM")) {
                    alunos.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
                    System.out.println("Alunos cadastrados....");
                    for (Aluno a : alunos) {
                        System.out.println(a);
                    }
                    System.exit(1);
                }
                if (Util.cpfValido(cpf)) {
                    break;
                } else {
                    System.out.println("CPF invalido!!!");
                }
            } while (true);
            System.out.print("Nome: ");
            nome = teclado.nextLine().toLowerCase();
            alunoTMP = new Aluno(cpf, nome);
            if (!alunos.contains(alunoTMP)) {
                alunos.add(alunoTMP);
            } else {
                System.out.println("Aluno com este cpf ja cadastrado!!");
            }
        } while (true);
    }
}
```
### Exemplo - Classe
```
public class Util {
    /**
     * método que recebe um cpf por string e retorna true se eh valido, ou false caso contrario
     * @param cpf - numero identificador da pessoa física
     * @return true se cpf valido
     */
    public static boolean cpfValido(String cpf) {
        // Remove qualquer caractere que não seja número
        cpf = cpf.replaceAll("\\D", "");

        // CPF deve ter 11 dígitos e não pode ser uma sequência de números iguais
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            // Cálculo do 1º dígito verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int digito1 = 11 - (soma % 11);
            if (digito1 > 9) digito1 = 0;

            // Cálculo do 2º dígito verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            int digito2 = 11 - (soma % 11);
            if (digito2 > 9) digito2 = 0;

            // Verifica se os dígitos calculados batem com os digitados
            return (digito1 == (cpf.charAt(9) - '0') && digito2 == (cpf.charAt(10) - '0'));

        } catch (Exception e) {
            return false;
        }
    }
}

```
## Matrizes Especiais - Unidade 2
 
