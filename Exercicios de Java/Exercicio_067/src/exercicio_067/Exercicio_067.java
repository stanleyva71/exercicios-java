package exercicio_067;

import java.util.Scanner;

public class Exercicio_067 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner ( System.in);
        
        // Variaves
        double valor;
        double tempo;
        double taxa;
        double Prestacao;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 66");
        System.out.println("Cálculo do valor de uma prestação em atraso");
        System.out.println();
        
        // Entrada de dados
        System.out.print("Qual o valor? ");
        valor = teclado.nextDouble();
        
        System.out.print("Qual o tempo? ");
        tempo = teclado.nextDouble();
        
        System.out.print("Qual a taxa? ");
        taxa = teclado.nextDouble();
        
        // Processamento 
        Prestacao = (valor + (valor *(taxa/100) * tempo));
        
        System.out.print("Valor da Prestação: " + "R$"+Prestacao);
        
    }
    
}
