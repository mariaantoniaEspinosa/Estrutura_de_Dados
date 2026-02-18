// EXERCÍCIO 01 - ESTRUTURA DE DADOS.
// Um diabético de fator de correção (boulus) de carboidrato. 
// O sistema precisa solicitar o boulus de correção (dg/ml por carboidrato) e a quantidade de carboidrato ingerido.


// ENTRADA:
// nome = alexandre
// boulusAlimentar = 15 
// carboidrato = 30
// quantidadeInsulinaMaxima = 13


// PROCESSAMENTO E SAÍDA: 

// quantidadeInsulina = carboidrato / boulus
// quantidadeMaximaCarboidrato = boulus * quantidadeInsulinaMaxima
// restanteInsulinaDia = quantidadeInsulinaMaxima - quantidadeInsulina
// restanteCarboidratoDia = quantidadeMaximaCaboidrato - carboidrato

#include <stdio.h>
#include <stdlib.h>

int main(){

    char nome[100];

    //entradas
    int boulusAlimentar;
    int quantidadeInsulinaMaxima;
    int carboidrato;

    //saídas
    int quantidadeInsulina;
    int quantidadeMaximaCarboidrato; 
    int restanteInsulinaDia; 
    int restanteCarboidratoDia; 



    printf("Ola, informe seus dados\n");
    printf("Nome: ");
    gets(nome);

    printf("Boulus alimentar: ");
    scanf("%d", &boulusAlimentar);
    
    printf("Quantidade de insulina máxima: ");
    scanf("%d", &quantidadeInsulinaMaxima);
    
    printf("Quantidade de carboidrato ingerido: ");
    scanf("%d", &carboidrato);
    

    quantidadeInsulina = (int)carboidrato / boulusAlimentar;
	quantidadeMaximaCarboidrato = boulusAlimentar * quantidadeInsulinaMaxima;
	restanteInsulinaDia = quantidadeInsulinaMaxima - quantidadeInsulina;
	restanteCarboidratoDia = quantidadeMaximaCarboidrato - carboidrato;
	
	printf("Quantidade de insulina paa essa refeição: %d\n", quantidadeInsulina);
	printf("Quantidade maxima de carboidrato dia: %d\n", quantidadeMaximaCarboidrato);
	printf("Ainda restam %d unidades de insulina no dia\n", restanteInsulinaDia);
	printf("Ainda restam %d g de carboidratos no dia\n", restanteCarboidratoDia);

    return 1;
}
