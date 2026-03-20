import java.util.ArrayList;

public class PrincipalClima {
    
    public static void main(String[] args) {

        ArrayList<Clima> lista = new ArrayList<Clima>();

        //simulando que estamos lendo linha a linha do arquivo
        //primeira linha
        String linha = "2020,Janeiro,Quente,muita";
        String[] dadoslinha = linha.split(",");
        Clima objClima = new Clima(dadoslinha[0], dadoslinha[1], dadoslinha[2], dadoslinha[3]);


        if(!lista.contains(objClima)){
            lista.add(objClima);
        }

        //segunda linha
        linha = "2020,Janeiro,Frio,pouca";
        dadoslinha = linha.split(",");
        objClima = new Clima(dadoslinha[0], dadoslinha[1], dadoslinha[2], dadoslinha[3]);

        
        if(!lista.contains(objClima)){
            lista.add(objClima);
        }

        for(Clima c : lista){
            System.out.println(c);
        }

    }
    
}
