package exercicio53;

import java.util.Scanner;

public class Exercicio53 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Exercício 53");
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();

        double largura;
        double comprimento;
        double altura;

        
        System.out.print("Digite a largura: ");
        largura = teclado.nextDouble();
        System.out.print("Digite o comprimento: ");
        comprimento = teclado.nextDouble();
        System.out.print("Digite a altura: ");
        altura = teclado.nextDouble();
        
        //Processamento
        double diagonal = (double) Math.sqrt(Math.pow(largura, 2)
                + Math.pow(comprimento, 2)
                + Math.pow(altura, 2));


        // Saida de dados
        System.out.println("Diagonal: " + diagonal);

    }

}
