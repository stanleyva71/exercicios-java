package exercicio_079;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_079 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Variaves
        double i; // Taxa
        double P; // Aplicação Mensal
        int n; // Número de Meses
        double taxa; // Número de Meses
        double valorAcumulado;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 79");
        System.out.println("Calcular rendimento de uma aplicação na poupança programada");
        System.out.println();

        // Entrada de dados 
        System.out.print("Entre com o valor da aplicação mensal: ");
        P = teclado.nextDouble();
        System.out.print("Entre com o valor da taxa de juros mensal (em %): ");
        taxa = teclado.nextDouble();
        System.out.print("Entre com o número de meses: ");
        n = teclado.nextInt();
        
        // Processamento
        i = taxa/100.0;
        valorAcumulado = P * (Math.pow(1 + i, n)-1) / i;
        
        // Saida
        System.out.println("Valor acumulado após " +n+ " meses é: " +"R$"+ df.format(valorAcumulado));
    }
    
}
