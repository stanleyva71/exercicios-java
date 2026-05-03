package exercicio41;

import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        // Variáveis
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        
        System.out.println("Exercício 41");
        System.out.println("Calcula a média ponderada de 4 números reais");
        System.out.println();
        
        // Entrada de dados
        System.out.print("Entre numero 1: ");
        n1 = teclado.nextInt();
        System.out.print("Entre numero 2: ");
        n2 = teclado.nextInt();
        System.out.print("Entre numero 3: ");
        n3 = teclado.nextInt();
        System.out.print("Entre numero 4: ");
        n4 = teclado.nextInt();
        
        // Processamento
        media = ( (n1*1) + (n2*2) + (n3*3) + (n4*4) ) /10;
        
        // Saída de dados
        System.out.println("Média = " + media);
        
    }
    
}
