package exercicio_068;

import java.util.Scanner;

public class Exercicio_068 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Variaves
        int numA;
        int numB;
        int aux;

        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 68");
        System.out.println("Ler valores");
        System.out.println();

        // Entrada de dados 
        System.out.print("Entre com um número A inteiro: ");
        numA = teclado.nextInt();
        System.out.print("Entre com um número B inteiro: ");
        numB = teclado.nextInt();
                
        // procssamento 
        aux = numA;
        numA = numB;
        numB = aux;

        // Saida de dados
        System.out.println("Número novo A = " + numA);
        System.out.println("Número novo B = " + numB);
    }

}
