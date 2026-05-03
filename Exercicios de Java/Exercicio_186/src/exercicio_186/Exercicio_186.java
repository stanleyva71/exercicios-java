package exercicio_186;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_186 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.###");

        //variaveis
        int i;
        double num;

        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 186");
        System.out.println("Entra com 3 numeros e, imprimir o cubo e a raiz cubica de cada número");
        System.out.println();

        // processamento
        for (i = 1; i <= 3; i++) {
            System.out.print("Entre com um número[" + i + "]:");
            num = teclado.nextDouble();
            System.out.println(df.format(Math.pow(num, 3.0)));
            System.out.println(df.format(Math.cbrt(num)));
        }
    }
}
