public class Clima{
    public String ano;
    public String mes;
    public String temperatura;
    public String precipitacao;

    public Clima(String ano, String mes, String temperatura, String precipitacao) {
        this.ano = ano;
        this.mes = mes;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }

    @Override
    public String toString() {
        return "Dados climaticos(Ano: " + this.ano + ", Mês: " + this.mes + ", Temperatura: " + this.temperatura + ", Precipitação: " + this.precipitacao + ")";
    }
    //reescrevemos toString para exibir um objeeto completo da classe 
    @Override
    public boolean equals(Object obj) {
        Clima c = (Clima) obj;
        return (this.ano.equals(c.ano) && this.mes.equals(c.mes));
        //estamos dizendo quem são as chaves primárias (aquelas que não podem se repetir)
        //reescrevemos o metodo equals para definir os atributos identificadores
    }

    
    
}
