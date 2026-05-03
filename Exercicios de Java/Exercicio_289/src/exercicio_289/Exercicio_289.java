package exercicio_289;

import java.util.Scanner;

public class Exercicio_289 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 289");
        System.out.println("Criar um algoritmo que entre vários números inteiros e positivos e imprimir a média dos números múltiplos de 3");
        System.out.println();
        
        // variaveis
        int num;
        int cont3;
        int soma3;
        int media;

        // entrada de dados
        cont3 = 0;
        soma3 = 0;
        
        System.out.print("Entre com um número(ou zero para encerrar): ");
        num = teclado.nextInt();
        
        while (num > 0) {
        // processamento
            if (num % 3 == 00) {
                soma3 = soma3 + num;
                cont3++;
            }
            System.out.print("Entre com um número: ");
            num = teclado.nextInt();
        }
        
        // saida de dados
        if (cont3 > 0) {
            media = soma3 / cont3;
            System.out.println("Para os " +cont3+ " numeros multiplos de 3");
            System.out.println("Media = "+media);
        }

    }

}
