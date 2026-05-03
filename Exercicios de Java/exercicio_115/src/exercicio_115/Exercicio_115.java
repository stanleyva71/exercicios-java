package exercicio_115;

import java.util.Scanner;

public class Exercicio_115 {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
        
        // variavies

        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 115");
        System.out.println("Entrar com");
        System.out.println();
        
        // entrada de dados
        System.out.print("Entrar com nome 1: ");
        double num1 = teclado.nextDouble();
        System.out.print("Entrar com nome 2: ");
        double num2 = teclado.nextDouble();
        double menor;
        double maior;
        
        // Processamento
        
        if(num1<num2){
        menor = num1;
        maior = num2;
        } else{
        maior = num2;
        menor = num1;
        }
        
        maior = Math.sqrt(maior);
        menor = Math.pow(menor, 2);
        
        // Saida de dados
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
       
    }
    
    
}
