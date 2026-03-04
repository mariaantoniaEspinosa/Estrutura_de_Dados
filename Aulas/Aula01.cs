using System;
class Program{
    static void Main(){

        string nome;

        int boulusAlimentar;                
        int quantidadeInsulinaMaxima;      
        int carboidrato;                   

       
        int quantidadeInsulina;            
        int quantidadeMaximaCarboidrato;   
        int restanteInsulinaDia;           
        int restanteCarboidratoDia;  

        Console.WriteLine("Ola, informe seus dados: ");
        // escreve e quebra linha

        Console.WriteLine("Nome: ");
        nome = Console.ReadLine(); // lê o que o usuário digita

        Console.Write("Boulus Alimentar: ");
        boulusAlimentar = int.Parse(Console.ReadLine());

        Console.Write("Quantidade de Insulina Maxima: ");
        quantidadeInsulinaMaxima = int.Parse(Console.ReadLine());

        Console.Write("Quantidade de carboidrato ingerido: ");
        carboidrato = int.Parse(Console.ReadLine());
        //int.Parse converse texto para inteiro

        quantidadeInsulina = carboidrato / boulusAlimentar;
        quantidadeMaximaCarboidrato = boulusAlimentar * quantidadeInsulinaMaxima;
        restanteInsulinaDia = quantidadeInsulinaMaxima - quantidadeInsulina;
        restanteCarboidratoDia = quantidadeMaximaCarboidrato - carboidrato; 

        Console.WriteLine("Quantidade de insulina para essa refeicao: "  + quantidadeInsulina);

        Console.WriteLine("Quantidade maxima de carboidrato dia: "   + quantidadeMaximaCarboidrato);

        Console.WriteLine("Ainda restam " + restanteInsulinaDia  + " unidades de insulina no dia");

        Console.WriteLine("Ainda restam "  + restanteCarboidratoDia   + " g de carboidratos no dia");

    }
}
