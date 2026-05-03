package exercicio46;

import java.util.Scanner;


public class Exercicio46 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Exercício 46");
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        
        //Variáveis
        double Saldo;
        double novoSaldo;
        
        // Entrada de dados
        
        // Processamento
        System.out.print("Entre com um número: ");
        Saldo = teclado.nextDouble();
        novoSaldo = (Saldo * 0.01)+ Saldo;
        
        // Saída de dados
        System.out.print("Saldo: " +Saldo);
        System.out.println(" Novo Saldo: " +novoSaldo);
        
    }
    
}
