package exercicio_293;

import java.util.Scanner;

public class Exercicio_293 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 293");
        System.out.println("Calcula total de pessoas do sexo feminino com idade entre 30 e 45");
        System.out.println("Calcula total de pessoas do sexo masculino");
        System.out.println();

        int idade = 0;
        int somaIdades = 0;
        int totalPessoas = 0;
        int sexo;
        double mediaIdade;
        int totalF3035;
        int totalM;

        System.out.print("Entre com a idade ou zero para encerrar: ");
        idade = teclado.nextInt();

        while (idade > 0) {
            // processamento
            somaIdades = somaIdades + idade;
            totalPessoas++;

            // entradade dados
            System.out.print("Entre com a idade ou zero para encerrar: ");
            idade = teclado.nextInt();

        }
        if (somaIdades > 0) {
            mediaIdade = somaIdades / totalPessoas;
            System.out.println("Para um total de " + totalPessoas + "a media das idades = " + mediaIdade);
        }

    }

}
