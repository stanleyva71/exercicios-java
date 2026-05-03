package exercicio_086;

import java.util.Scanner;

public class Exercicio_086 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 86");
        System.out.println("Ler se um número é positivo, negativo ou zero");
        System.out.println();
        
        System.out.print("Um número: ");
        int num = teclado.nextInt();
        
        if(num >= 1){
            System.out.println("É positivo");
        }
        else if(num < 0){
            System.out.println("É negativo");
        }
        else{
            System.out.println("É zero");
        }
    }
    
}
