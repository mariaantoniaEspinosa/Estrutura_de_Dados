public class Processo {
    public int id; //identificador 
    public String descricao; //descreve

    //construtor
    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
   
    //reescrita equals: para identificar a chave primária
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Processo other = (Processo) obj;
        if (id != other.id)
            return false;
        return true;
    }

    // toString: como exibir um objeto completo da classe dentro de uma lista
    @Override //sobre escrita
    public String toString() {
        return "Processo [id=" + id + ", descricao=" + descricao + "]";
    }

    

    
}
