package exercicio_184;

import java.util.Scanner;

public class Exercicio_184 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //variaveis
        int i;
        double num;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 184");
        System.out.println("Entra com 5 numeros e, para cada número, imprimir o log na base 10");
        System.out.println();
        
        // processamento
        for (i=1; i <=5; i++){
        System.out.print("Entre com um número["+i+"]:");
        num = teclado.nextDouble();
        System.out.println("Log base 10 = "+ Math.log10(num));
        
        }
        
    }
    
}
