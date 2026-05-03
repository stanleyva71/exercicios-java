package exercicio_064;

import java.util.Scanner;

public class Exercicio_064 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // variaveis
        double tempC;
        double tempF;
        
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 64");
        System.out.println("Converter temperaturda de celsius para Fahrenheit");
        System.out.println();
        
        // Entrada de dados
        System.out.print("Entre com uma temperatura em graus Celsius: ");
        tempC = teclado.nextDouble();
        
        // Processamento
        tempF = ((9.0 * tempC) + 160.0)/5.0;

        // Saida de dados
        System.out.println("Temperatura em Fahrenheit: "+tempF);
        
    }
    
}
