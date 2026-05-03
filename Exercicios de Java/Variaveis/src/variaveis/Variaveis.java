package variaveis;

import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {
        // Declaracao de variáveis
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        int soma;
        
        // Identificacao
        System.out.println("Stanley Sousa do Vale");
        System.out.println("2090782521011");
        
        // Para que serve o programa (Objetivo)
        System.out.println("Imprime a soma de dois numeros");
        System.out.println("==============================");
        System.out.println("");
        
        // Entrada de dados
        System.out.println("Entre numero 1? ");
        n1 = teclado.nextInt();
        System.out.println("Entre numero 2? ");
        n2 = teclado.nextInt();
        
        // Processamento
        soma = n1 + n2;
        
        // Saida de dados
        System.out.println("Soma = "+ soma);
        
    }
    
}
