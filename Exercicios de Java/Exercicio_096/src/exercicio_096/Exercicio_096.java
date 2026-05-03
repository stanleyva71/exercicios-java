package exercicio_096;

import java.util.Scanner;

public class Exercicio_096 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Stanley Sousa do Vale");
        System.out.println("RA: 2090782521011");
        System.out.println();
        System.out.println("Exercício 96");
        System.out.println("Informar se um número é divisível por 3 e 7(simultanemante)");
        System.out.println();
        
        System.out.print("Um número: ");
        int num = teclado.nextInt();
        
        if((num %3==0)&&(num%7==0)){
            System.out.println("É divisivel");
        }
        else{
            System.out.println("Não é divisivel");
        }
        
    }
    
}
