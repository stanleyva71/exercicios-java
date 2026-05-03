package exercicio_291;

import java.util.Scanner;

public class Exercicio_291 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 291");
        System.out.println("");
        System.out.println();

        // variaveis
        int numPedido;
        String dataPedido;
        double precoUnitario;
        double quantidade;
        double valorTotal = 0;

        System.out.print("Entre um número ou zero para encerrar: ");
        numPedido = teclado.nextInt();

        while (numPedido > 0) {
            // entrada de dados 2
            System.out.print("Entre a data do pedido [dd/mm/aaaa]");
            dataPedido = teclado.next();

            System.out.print("Entre com o preço unitario R$ ");
            precoUnitario = teclado.nextDouble();

            System.out.print("Entre com a quatidade: ");
            quantidade = teclado.nextDouble();

            // processamento
            valorTotal = valorTotal + (quantidade * precoUnitario);

            // entrada de dados 1
            System.out.print("Entre um número ou zero para encerrar: ");
            numPedido = teclado.nextInt();

        }
        
        System.out.println("Valor total: = "+valorTotal);
        
    }

}
