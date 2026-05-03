package exercicio_069;

import java.util.Scanner;

public class Exercicio_069 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o numerador: ");
        double numerador = teclado.nextDouble();

        System.out.print("Digite o denominador: ");
        double denominador = teclado.nextDouble();

        // Processamento (sem if/else)
        double decimal = numerador / denominador;

        // Saída de dados
        System.out.println("Valor decimal da fração: " + decimal);
        
    }
    
}
