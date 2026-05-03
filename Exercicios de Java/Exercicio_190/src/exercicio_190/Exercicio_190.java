package exercicio_190;

import java.util.Scanner;

public class Exercicio_190 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //variaveis
        String nome;
        int idade;
        char sexo;
        int i;

        // autor
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 190");
        System.out.println("");
        System.out.println();

        // entrada de dados
        nome = "";
        idade = 0;
        sexo = ' ';
        for (i = 1; i <= 5; i++) {
            System.out.print("Entre com o nome["+i+"]: ");
            nome = teclado.next();
            System.out.print("Entre com a idade: ");
            idade = teclado.nextInt();
            System.out.print("Entre com o sexo [F/M]: ");
            sexo = teclado.next().toUpperCase().charAt(0);
        }

        // processamento
        if((sexo == 'F') && (idade > 21)) {
            // saida de dados
            System.out.println("------------");
            System.out.println(nome);
            System.out.println();
        }

    }

}
