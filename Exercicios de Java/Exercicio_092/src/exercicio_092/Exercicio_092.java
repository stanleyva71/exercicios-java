package exercicio_092;

import java.util.Scanner;

public class Exercicio_092 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
        int soma;
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 92");
        System.out.println("Contruir um algoritimo que leia 2 números e efetue sua adição");
        System.out.println();
        
        System.out.print("Um número: ");
        num1 = teclado.nextInt();
        System.out.print("Outro número: ");
        num2 = teclado.nextInt();
        
        soma = num1 + num2;
        
        if(soma >= 20){
            soma = soma + 8;
            System.out.println("Valor: " + soma);
        }
        if(soma < 20){
            soma = soma - 5;
            System.out.println("Valor: " + soma);
        }
        
    }
    
}
