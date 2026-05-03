package exercicio_290;

import java.util.Scanner;

public class Exercicio_290 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 290");
        System.out.println("Criar um algoritmo que entre vários números inteiros e positivos e imprimir o produto dos números impares e a soma dos pares");
        System.out.println();
        
        // variaveis
        int num;
        int prodImpar = 1;
        int somaPar = 0;
        int cont = 0;
        
        System.out.print("Entre com um número(ou zero para encerrar): ");
        num = teclado.nextInt();
        
        while (num > 0) {
        // processamento
            if (num % 2 == 00) {
                somaPar = somaPar + num;
                cont++;
            }else {
                prodImpar = prodImpar * num;
            }
            System.out.print("Entre com um número: ");
            num = teclado.nextInt();
        }
        
            System.out.println("Para os " +cont+ " números pares");
            System.out.println("Soma = "+somaPar);
            System.out.println("Produto = "+prodImpar);
    }
    
}
