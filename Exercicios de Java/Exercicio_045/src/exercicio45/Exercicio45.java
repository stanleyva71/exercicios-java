package exercicio45;

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Exercício 45");
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        
        // Váriáveis
        double n1;
        double aoQuadrado;
        double Raiz;
        
        // Entrada de dados
        
        // Processamento
        System.out.print("Entre com um número: ");
        n1 = teclado.nextDouble();      
        aoQuadrado = Math.pow(n1, 2);
        Raiz = Math.sqrt(n1);     
     
        // Saída de dados
        System.out.print("Número: " +n1);
        System.out.print(" Quadrado: " +aoQuadrado);
        System.out.println(" Raiz: " +Raiz);
        
    }
    
}
